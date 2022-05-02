
package Game_01Entity;

import static Game_01Entity.Enemy.spd;
import Game_01World.Camera;
import Game_01World.World;
import game_01.Game_01;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Curador extends Enemy{
   
    public BufferedImage[] sprites = new BufferedImage[2];
    
    public boolean moved;
    public int frames = 0;
    public int maxFrames = 30;
    public int curAnimation = 0;
    public int maxAnimation = 2;
    
    public Curador(int x, int y, int widht, int height, BufferedImage sprite) {
        super(x, y, widht, height, sprite);
        
        this.life = 10;
        sprites[0] = Game_01.sprite.getSprite(288, 16, 16, 16);
        sprites[1] = Game_01.sprite.getSprite(288, 0, 16, 16);
        
    }
    
    @Override
    public void tick(){           
        
       Enemy.setSpd(2);
       
       if(this.isCollidingwithPlayer() == false){
                    
                if (this.getX() <= Game_01.player.getX() + 50 && World.isFree(this.getX()+ spd, this.getY()) 
                         && !isColliding(this.getX() + spd, this.getY())){
                
                    x += spd;
                     this.moved = true;
                
                 } else if(this.getX() >= Game_01.player.getX() - 50 && World.isFree(this.getX() - spd, this.getY()) 
                         && !isColliding(this.getX() - spd, this.getY())){
                
                    x -= spd;
                     this.moved = true;
             
                 }
             
                 if (this.getY() <= Game_01.player.getY() + 50 && World.isFree(this.getX(), this.getY() + spd)
                         && !isColliding(this.getX(), this.getY() + spd)){
                
                    y += spd;
                     this.moved = true;
            
                } else if(this.getY() >= Game_01.player.getY() - 50 && World.isFree(this.getX(), this.getY() - spd)
                        && !isColliding(this.getX(), this.getY() - spd)){
                
                    y -= spd;
                     this.moved = true;
            
                }
       }else{
                
                if(Game_01.rand.nextInt(100) < 2){
                Game_01.player.life--;
                Game_01.player.isDamaged = true;
                                    
                
                }
       }
            if(moved){
            
            frames++;
            
                if(frames >= maxFrames){
                    frames = 0;
                    curAnimation++;
                }
                if(curAnimation >= maxAnimation){
                    curAnimation = 0;
                }
        
           }
            
            if(isDamaged){
           
               this.DamageCurrent++;
               
               if (DamageCurrent == damageframes) {
                   DamageCurrent = 0;
                   this.isDamaged = false;
               }
           }
        
                isCollidingBullet();
               if(life <= 0){
                
                restInPieces();
                return;
            }
    }
   
     @Override
    public void render(Graphics g){
        
         if (this.isDamaged) {
            
            g.drawImage(Entity.ENEMY_FEEDBACK_EN3, this.getX() - Camera.x, this.getY() - Camera.y, 64, 64, null);
            
        }else{
        
            g.drawImage(sprites[curAnimation], this.getX() - Camera.x, this.getY() - Camera.y, 64, 64, null);
        }
    }   
    
}
