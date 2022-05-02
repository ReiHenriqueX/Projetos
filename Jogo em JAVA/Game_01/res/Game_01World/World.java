
package Game_01World;

import Game_01Entity.Curador;
import Game_01Entity.Enemy;
import Game_01Entity.Entity;
import Game_01Entity.InimigoAzul;
import Game_01Entity.InimigoVermelho;
import Game_01Entity.Life;
import Game_01Entity.Orbs;
import Game_01Entity.Player;
import Game_01Entity.Staff;
import Game_01Gráficos.Spritesheet;
import static Game_01World.Tile.TILE_WALL;
import game_01.Game_01;
import static game_01.Game_01.HEIGHT;
import static game_01.Game_01.SCALE;
import static game_01.Game_01.WIDHT;
import static game_01.Game_01.entities;
import static game_01.Game_01.frame;
import static game_01.Game_01.player;
import static game_01.Game_01.sprite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class World {
    
    private static Tile[] tiles;
    public static int WIDHT, HEIGHT;
    public static int selec, selecte;
    public static int TILE_SIZE = 64;
    public static int entityCode1 = 0;
    public static int entityCode2 = 1;
    public static int entityCode3 = 2;
   
    
    public World(String path){
        
        try {
            BufferedImage map = ImageIO.read(getClass().getResource(path));
           
            
            int[] pixels = new int[(map.getWidth() *  map.getHeight())];
            
            WIDHT = map.getWidth();
            HEIGHT = map.getHeight();
                        
            tiles = new Tile[((map.getWidth() * map.getHeight()))];
            
            map.getRGB(0, 0, map.getWidth(), map.getHeight(), pixels, 0, map.getWidth());
            
            for(int xx = 0;xx < map.getWidth();xx++){
                for(int yy = 0;yy < map.getHeight(); yy++){
                    int pixelAtual = pixels[xx + (yy * (map.getWidth()))];
                    selec = new Random().nextInt(3);
                    selecte = new Random().nextInt(3);
                  
                     tiles[xx + (yy * WIDHT)] = new Tile_Floor(xx * 64, yy * 64, Tile.TILE_FLOOR[selec]); 
                    
                    if (pixelAtual == 0xFF000000) {
                       tiles[xx + (yy * WIDHT)] = new Tile_Floor(xx * 64, yy * 64, Tile.TILE_FLOOR[selec]); 
                        //chão
                        
                    } else if(pixelAtual == 0xFFFFFFFF){
                        tiles[xx + (yy * WIDHT)] = new Tile_Wall(xx * 64, yy * 64, Tile.TILE_WALL[selec]); 
                        
                        //parede
                        
                    }else if(pixelAtual == 0xFF0026FF){
                       //player
                       
                       player.setX(xx*64);
                       player.setY(yy*64);
                    
                    }else if(pixelAtual == 0xFF0094FF){
                       
                        //staff
                        entities.add(new Staff(xx * 64, yy * 64, 16, 16, Entity.STAFF_EN));
                        
                    }else if(pixelAtual == 0xFFFFD800){
                        
                        //Vida
                        
                        entities.add(new Life(xx * 64, yy * 64, 16, 16, Entity.HEART_EN));
                        
                    }else if(pixelAtual == 0xFF007F0E){
                        
                        //Orbs
                        
                        entities.add(new Orbs(xx * 64, yy * 64, 16, 16, Entity.ORB_EN));
                        
                    }else if(pixelAtual == 0xFFFF0000){
                        
                        
                        
                        if(selecte == 0){
                            
                            InimigoVermelho en = new InimigoVermelho(xx * 64, yy * 64, 16, 16, Entity.ENEMY_EN1);
                            entities.add(en);
                            Game_01.enemies.add(en);
                              
                            
                        }else if(selecte == 1){
                            
                            InimigoAzul en = new InimigoAzul(xx * 64, yy * 64, 16, 16, Entity.ENEMY_EN2);
                            entities.add(en);
                            Game_01.enemies.add(en);
                            
                        }else if(selecte == 2){
                          
                            Curador en = new Curador(xx * 64, yy * 64, 16, 16, Entity.ENEMY_EN3);
                            entities.add(en);
                            Game_01.enemies.add(en);
                            
                        }
                        
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tick(){
      
       
    }
    
    public static void restartWorld(String levelIndex){
        
            Game_01.entities.clear();
            Game_01.enemies.clear();

            Game_01.entities = new ArrayList<Entity>();
            Game_01.enemies = new ArrayList<Enemy>();       
            Game_01.sprite = new Spritesheet("/Sprites1.png");
            Game_01.player = new Player(64, 64, 16, 16, sprite.getSprite(0,0,15,15));
            Game_01.entities.add(Game_01.player);
            Game_01.world = new World("/" + levelIndex);
            frame = new JFrame("Adenture");
            frame.setPreferredSize(new Dimension(WIDHT * SCALE, HEIGHT * SCALE));
            
    }
    public static boolean isFree(int x, int y){
        
        int x1 = x / TILE_SIZE;
        int y1 = y / TILE_SIZE;
        
        int x2 = (x + TILE_SIZE - 1) / TILE_SIZE;
        int y2 = y / TILE_SIZE;
        
        int x3 = x / TILE_SIZE;
        int y3 = (y + TILE_SIZE -1) / TILE_SIZE;
        
        int x4 = (x + TILE_SIZE - 1) / TILE_SIZE;
        int y4 = (y + TILE_SIZE - 1) / TILE_SIZE;
        
        return !((tiles[x1 + (y1 * World.WIDHT)] instanceof Tile_Wall) ||
               (tiles[x2 + (y2 * World.WIDHT)] instanceof Tile_Wall) ||
               (tiles[x3 + (y3 * World.WIDHT)] instanceof Tile_Wall) ||
               (tiles[x4 + (y4 * World.WIDHT)] instanceof Tile_Wall));       
    }
    
    public void render(Graphics g){
        int xstart = Camera.x /64;
        int ystart = Camera.y /64;
        
        int xfinal = xstart + (Game_01.WIDHT/2);
        int yfinal = ystart + (Game_01.HEIGHT/2);
                
         for(int xx = xstart;xx <= xfinal;xx++){
                for(int yy = ystart;yy <= yfinal; yy++){
                    
                    if(xx < 0 || yy < 0 || xx >= WIDHT || yy >= HEIGHT){
                        continue;
                    }
                 
                    Tile tile = tiles[xx + (yy * WIDHT)]; 
                    tile.render(g);
                    
                }
         }
    }
        
}
 /*for(int cc = 0;cc < pixels.length;cc++){
                
                if(pixels[cc] == 0xFFFF0000){//vermelho
                    
                    
                }else if(pixels[cc] == 0xFF007F0E){//verde
                   
                    
                }else if(pixels[cc] == 0xFFFFD800){//amarelo
                   
                    
                }else if(pixels[cc] == 0xFF0094FF){//azul
                    
                    
                }else if(pixels[cc] == 0xFF0026FF){//player
                    
                    
                }else if(pixels[cc] == 0xFFFFFFFF){//branco
                    
                    
                }
            }*/