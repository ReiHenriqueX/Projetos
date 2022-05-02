
package Game_01Entity;

import Game_01World.Camera;
import game_01.Game_01;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;


public class Entity {
    
    public int x, y, widht, height;
    private BufferedImage sprite;
    
    
    public static BufferedImage HEART_EN = Game_01.sprite.getSprite(209, 0, 16, 16);
    public static BufferedImage STAFF_EN = Game_01.sprite.getSprite(224, 0, 17, 16);
    public static BufferedImage ORB_EN = Game_01.sprite.getSprite(241, 0, 16, 16);
    public static BufferedImage ENEMY_EN1 = Game_01.sprite.getSprite(256, 0, 16, 16);
    public static BufferedImage ENEMY_EN2 = Game_01.sprite.getSprite(272, 0, 16, 16);
    public static BufferedImage ENEMY_EN3 = Game_01.sprite.getSprite(288, 0, 16, 16);
    public static BufferedImage ENEMY_FEEDBACK_EN1 = Game_01.sprite.getSprite(257, 32, 16, 16);
    public static BufferedImage ENEMY_FEEDBACK_EN2 = Game_01.sprite.getSprite(272, 32, 16, 16);
    public static BufferedImage ENEMY_FEEDBACK_EN3= Game_01.sprite.getSprite(288, 32, 16, 16);
    public static BufferedImage STAFF_UP = Game_01.sprite.getSprite(208, 17, 16, 16);
    public static BufferedImage STAFF_DOWN = Game_01.sprite.getSprite(208, 33, 16, 16);
    public static BufferedImage STAFF_LEFT = Game_01.sprite.getSprite(225, 0, 16, 16);
    public static BufferedImage STAFF_RIGHT = Game_01.sprite.getSprite(225, 17, 16, 16);
    
    public static BufferedImage SPELL_01 = Game_01.sprite.getSprite(242, 17, 15, 16);
    
    public int maskx, masky, maskw, maskh;
    
    public Entity(int x, int y, int widht, int height, BufferedImage sprite){
        
       this.setX(x);
       this.setY(y);
       this.setHeight(height);
       this.setWidht(widht);
       this.setSprite(sprite);
       
       maskx = 0;
       masky = 0;
       maskw = 50;
       maskh = 50;
             
        
    }

    public int getMask() {
        return maskx;
    }

    public void setMask(int maskx, int masky, int maskw, int maskh) {
        this.maskx = maskx;
        this.masky = masky;
        this.maskw = maskw;
        this.maskh = maskh;
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

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }
   
   public void tick(){
       
   }
    public void render(Graphics g){
     
        g.drawImage(sprite, this.getX() - Camera.getX(), this.getY() - Camera.getY(), 60, 60, null);
        
    }
    
    public static boolean isColliding(Entity e1, Entity e2){
        
        Rectangle maske1 = new Rectangle(e1.getX() + e1.maskx, e1.getY() + e1.masky, e1.maskw, e1.maskh);
        Rectangle maske2 = new Rectangle(e2.getX() + e2.maskx, e2.getY() + e2.masky, e2.maskw, e2.maskh);
       
        return maske1.intersects(maske2);
    }
        
}
