
package Game_01World;

import game_01.Game_01;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Tile {
    
    public static BufferedImage[] TILE_FLOOR = new BufferedImage[3];          
    public static BufferedImage[] TILE_WALL = new BufferedImage[3];
    
    private BufferedImage sprite;
    private int x, y;
    
    public Tile(int x, int y, BufferedImage sprite){
        
        this.TILE_FLOOR[0] = Game_01.sprite.getSprite(113, 0, 16, 16);
        this.TILE_FLOOR[1] = Game_01.sprite.getSprite(129, 0, 16, 16);
        this.TILE_FLOOR[2] = Game_01.sprite.getSprite(145, 0, 16, 16);
        
        this.TILE_WALL[0] = Game_01.sprite.getSprite(161, 0, 16, 16);
        this.TILE_WALL[1] = Game_01.sprite.getSprite(176, 0, 16, 16);
        this.TILE_WALL[2] = Game_01.sprite.getSprite(192, 0, 16, 16);
        
        this.setX(x);
        this.setY(y);
        this.setSprite(sprite);    
                                        
    }
    
    public void tick(){
        
    }
    
    public void render(Graphics g){
       
       
        
            
            g.drawImage(sprite,  this.getX() - Camera.getX(), this.getY() - Camera.getY(),64,64, null);
        
       
        
    }

    public static BufferedImage[] getTILE_FLOOR() {
        return TILE_FLOOR;
    }

    public static void setTILE_FLOOR(BufferedImage[] TILE_FLOOR) {
        Tile.TILE_FLOOR = TILE_FLOOR;
    }

    public static BufferedImage[] getTILE_WALL() {
        return TILE_WALL;
    }

    public static void setTILE_WALL(BufferedImage[] TILE_WALL) {
        Tile.TILE_WALL = TILE_WALL;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
