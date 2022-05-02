
package Game_01Entity;

import Game_01World.World;
import game_01.Game_01;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy extends Entity{
    
    public static int spd = 1;
    
    public double life = 5;
    public static int MAX_LIFE; 
    
    public boolean isDamaged = false;
    public int damageframes = 10; 
    public int DamageCurrent = 0; 
    public int maskx, masky, maskw, maskh;
    
    public Enemy(int x, int y, int widht, int height, BufferedImage sprite) {
        super(x, y, widht, height, sprite);
        
        
    }
    
    @Override
    public void tick(){           
        
                             
        
            
                 if (this.getX() <= Game_01.player.getX() && World.isFree(this.getX() + spd, this.getY())){
                
                    x += spd;
                
                 } else if(this.getX() >= Game_01.player.getX() && World.isFree(this.getX() - spd, this.getY())){
                
                    x -= spd;
             
                 }
             
                 if (this.getY() <= Game_01.player.getY() && World.isFree(this.getX(), this.getY() + spd)){
                
                    y += spd;
            
                } else if(this.getY() >= Game_01.player.getY() && World.isFree(this.getX(), this.getY() - spd)){
                
                    y -= spd;
            
                 }            
            
         }
    
   
    
    public boolean isCollidingwithPlayer(){
       maskx = 8;
       masky = 8;
       maskw = 46;
       maskh = 55;
        Rectangle enemyCurent = new Rectangle(this.getX() + maskx, this.getY() + masky, maskw, maskh);
        
        Rectangle player = new Rectangle(Game_01.player.getX(), Game_01.player.getY(), 64, 64);
        return enemyCurent.intersects(player);
    }
    public boolean isColliding(int x, int y){
        
       maskx = 8;
       masky = 8;
       maskw = 46;
       maskh = 55;
        
        Rectangle enemyCurent = new Rectangle(x + maskx, y + masky, maskw, maskh);
        for(int cc = 0;cc < Game_01.enemies.size();cc++){
            
            Enemy e = Game_01.enemies.get(cc);
            
            if(this == e){
                continue;
            }
            
            Rectangle targetEnemy = new Rectangle(e.getX() + maskx, e.getY() + masky, maskw, maskh);
            
            if(enemyCurent.intersects(targetEnemy)){
                return true;                
            }
            
        }
        
        
        return false;
    }
    public void restInPieces(){
        
        Game_01.entities.remove(this);
        Game_01.enemies.remove(this);
    }
    public void isCollidingBullet(){
         for(int cc = 0;cc < Game_01.spells.size();cc++){
             Entity e = Game_01.spells.get(cc);
             if (e instanceof Spell) {
                
                 if (Entity.isColliding(this, e)) {
                     life--;
                     this.isDamaged = true;
                     Game_01.spells.remove(e);
                     System.out.println("acertou");
                     return;
                 }
             }                    
         }        
    }

    public static int getSpd() {
        return spd;
    }

    public static void setSpd(int spd) {
        Enemy.spd = spd;
    }

    public  double getLife() {
        return life;
    }

    
    
    
}
