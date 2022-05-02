
package Game_01Entity;

import Game_01Gráficos.Spritesheet;
import Game_01Gráficos.UI;
import Game_01World.Camera;
import Game_01World.World;
import static Game_01World.World.isFree;
import game_01.Game_01;
import static game_01.Game_01.HEIGHT;
import static game_01.Game_01.SCALE;
import static game_01.Game_01.WIDHT;
import static game_01.Game_01.enemies;
import static game_01.Game_01.entities;
import static game_01.Game_01.frame;
import static game_01.Game_01.player;
import static game_01.Game_01.rand;
import static game_01.Game_01.sprite;
import static game_01.Game_01.world;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;


public class Player extends Entity{
    
   
    public BufferedImage[] playerLeft = new BufferedImage[2];
    public BufferedImage[] playerRight = new BufferedImage[2];
    public BufferedImage[] playerFront = new BufferedImage[2];
    public BufferedImage[] playerBack = new BufferedImage[2];
    public BufferedImage playerDamage;
    public BufferedImage playerStop;
    
    public boolean moved;
    
    public boolean isDamaged = false;
    
    public boolean hasStaff = false;
    
    public boolean speling = false;
    
    public boolean mouseSpelling = false;
    
    public int mauseatx, mauseaty;
    //atributos

    public Player(int x, int y, int widht, int height, BufferedImage sprite) {
        super(x, y, widht, height, sprite);
        
         this.playerLeft[0] = Game_01.sprite.getSprite(49, 1, 15, 15);
         this.playerLeft[1] = Game_01.sprite.getSprite(65, 1, 15, 15);
                
         this.playerRight[0] = Game_01.sprite.getSprite(81, 1, 15, 15);
         this.playerRight[1] = Game_01.sprite.getSprite(97, 1, 15, 15);
                
         this.playerFront[0] = Game_01.sprite.getSprite(17, 1, 15, 15);
         this.playerFront[1] = Game_01.sprite.getSprite(33, 1, 15, 15);
                
         this.playerBack[0] = Game_01.sprite.getSprite(17, 16, 15, 15);
         this.playerBack[1] = Game_01.sprite.getSprite(33, 16, 15, 15);
         
         this.playerDamage = Game_01.sprite.getSprite(0, 33, 16, 16);
         this.playerStop = sprite;
    }
    
    //atributos
   
    private boolean up, down, right, left;
    public int spd = 4, dir = 0;
    public int frames = 0;
    public int damageFrames;
    public int maxFrames = 30;
    public int curAnimation = 0;
    public int maxAnimation = 2;
    public  double life = 100;
    public  final  int MAX_LIFE = 100;
    public static double energy = 40;
    public static final  int MAX_ENERGY = 80;

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    
    @Override
    public void tick(){
        moved = false;
        if (this.isLeft() && isFree((int)this.getX() - spd, this.getY())) {
             moved = true;
            
            this.setX(this.getX() - spd);
           
            dir = 1;
            
        } else if(this.isRight()&& isFree((int)this.getX() + spd, this.getY())){
            moved = true;
            
            this.setX(this.getX() + spd);
           
            dir = 2;
                  
        }
        
        if (this.isUp()&& isFree(this.getX(), (int)this.getY() - spd)) {
             moved = true;
             
            this.setY(this.getY() - spd);
            dir = -1;
                                              
        } else if(this.isDown()&& isFree(this.getX(), (int)this.getY() + spd)){
             moved = true;
            
            this.setY(this.getY() + spd);
            dir = -2;
                                                       
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
        }else{
            dir = 0;
        }
        
        this.checkCollisionItem();
        
        if(this.isDamaged){
            this.damageFrames++;
            if(this.damageFrames == 10){
                this.damageFrames = 0;
                this.isDamaged = false;
            }
            
        }
        
        if(this.speling && this.hasStaff){
            this.speling = false;
            
            int dx = 0;
            int dy = 0;
            int px = 0;
            int py = 0;
            
            if(this.dir == 1){
                               
                dx = -1;
                px = -20; 
                
                                
            }else{
            
                dx = 1;
                px = 40;
            }
            
            if(this.dir == -1){
                
               dy = -1;
               py = -8;
                       
            }else{
                
               dy = 1;
               py = 8;
                                              
            }
                if(this.energy > 0 && this.dir > 0){
                    Spell spell = new Spell(this.getX() + px, this.getY() - 10, 30, 30, null, dx, 0);
                    Game_01.spells.add(spell);
                    this.energy -= 0;
                    
                }else if(this.energy > 0 && this.dir < 0){
                    
                    Spell spell = new Spell(this.getX() + 20, this.getY() + py, 30, 30, null, 0, dy);
                    Game_01.spells.add(spell);
                    this.energy -= 0;
                    
                }
            
       
    }
            
        
        if(mouseSpelling && this.hasStaff) {
           
            this.mouseSpelling = false;
            
            double angle = 0;
            
            int px = 0;
            int py = 0;
            
            if(this.dir == 1){
                 
                px = 0; 
                angle = Math.toDegrees(Math.atan2(this.mauseaty - (this.getY() - Camera.y), this.mauseatx - (this.getX() + px - Camera.x)));
                    
                                
            }else{
                
                px = 0;
                angle = Math.toDegrees(Math.atan2(this.mauseaty - (this.getY() - Camera.y), this.mauseatx - (this.getX() + px - Camera.x)));
            
            }
            
            if(this.dir == -1){
               
               py = 0;
               angle = Math.toDegrees(Math.atan2(this.mauseaty - (this.getY() + py - Camera.y), this.mauseatx - (this.getX() - Camera.x)));
                    
            }else{
              
               py = 0;
               angle = Math.toDegrees(Math.atan2(this.mauseaty - (this.getY() + py - Camera.y), this.mauseatx - (this.getX() - Camera.x)));           
                                              
            }
            
            double dx = Math.cos(angle);
            double dy = Math.sin(angle);
            
                if(this.energy > 0 && this.dir > 0){
                    Spell spell = new Spell(this.getX() + px, this.getY() - 10, 30, 30, null, dx, 0);
                    Game_01.spells.add(spell);
                    this.energy -= 0;
                    
                }else if(this.energy > 0 && this.dir < 0){
                    
                    Spell spell = new Spell(this.getX() + 20, this.getY() + py, 30, 30, null, 0, dy);
                    Game_01.spells.add(spell);
                    this.energy -= 0;
                    
                }
        }   
            
        
        if(this.life <= 0){
         
            Game_01.GAME_STATE = "GAME_OVER";

            return;
        }
        
        Camera.x = Camera.clamp(this.getX() + (Game_01.WIDHT/2) - 450,0,World.WIDHT*64 - Game_01.WIDHT - 590);
        Camera.y = Camera.clamp(this.getY() + (Game_01.HEIGHT/2) - 300,0,World.HEIGHT*64 - Game_01.HEIGHT - 410);
        
    }
    
    @Override
    public void render(Graphics g){
        
        if(!this.isDamaged){
        
        switch(dir){
         
            
            case 0:
                
                g.drawImage(playerStop, this.getX() - Camera.getX(), this.getY() - Camera.getY(), 64, 64, null);
            
            break;
            
            case 1:
                               
                g.drawImage(playerRight[curAnimation],  this.getX() - Camera.getX(), this.getY() - Camera.getY(), 64, 64, null);
                
                if (hasStaff) {
                    
                    g.drawImage(Entity.STAFF_RIGHT, this.getX() - Camera.getX() - 10, this.getY() - Camera.getY() + 5,50, 50, null);
                    
                }
                
            break; 
            
            case 2:
                
                g.drawImage(playerLeft[curAnimation],  this.getX() - Camera.getX(), this.getY() - Camera.getY(), 64, 64, null);
                
                if(hasStaff){
                 g.drawImage(Entity.STAFF_LEFT, this.getX() - Camera.getX() + 25, this.getY() - Camera.getY() + 10,50, 50, null);
                }
                
            break;  
            
            case -1:
                
                g.drawImage(playerBack[curAnimation],  this.getX() - Camera.getX(), this.getY() - Camera.getY(), 64, 64, null);
                
                if(hasStaff){
                 g.drawImage(Entity.STAFF_DOWN, this.getX() - Camera.getX() + 10, this.getY() - Camera.getY() + 8,50, 50, null);
                }
                
            break;  
            
            case -2:
                
                g.drawImage(playerFront[curAnimation],  this.getX() - Camera.getX(), this.getY() - Camera.getY(), 64, 64, null);
                if(hasStaff){
                 g.drawImage(Entity.STAFF_UP, this.getX() - Camera.getX() + 15, this.getY() - Camera.getY() + 20,50, 50, null);
                }
                
            break;                    
        }
        }else{
            g.drawImage(this.playerDamage, this.getX() - Camera.getX(), this.getY() - Camera.getY(), 64, 64, null);
        }
        
    }
    
    public void checkCollisionItem(){
        
        for(int cc = 0;cc < Game_01.entities.size();cc++){
            Entity current = Game_01.entities.get(cc);
            
            if(current instanceof Life){
                
                if(Entity.isColliding(this,current)){
                                      
                    this.life+=30;
                    if (this.life > this.MAX_LIFE) {
                         this.life = MAX_LIFE;
                    }
                    Game_01.entities.remove(cc);
                    }
                }else if(current instanceof Orbs){
                    
                    if(Entity.isColliding(this, current)){
                        
                        Player.energy += 20;
                        if(Player.energy > 80){
                            Player.energy = 80;
                        }
                        Game_01.entities.remove(cc);
                        
                    }
                    
                }else if(current instanceof Staff){
                    if(Entity.isColliding(this, current)){
                        
                        this.hasStaff = true;
                        Game_01.entities.remove(cc);
                        
                    }
                   
                   }
        }
    }
    
}

    
    
    
    
   
    

