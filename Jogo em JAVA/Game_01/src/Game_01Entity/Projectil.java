
package Game_01Entity;

import Game_01World.Camera;
import game_01.Game_01;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Projectil extends Entity{
    
    public int dx;
    public int dy;
    public int spd = 7;
    public int curTime = 0, time = 50;
    
    public Projectil(int x, int y, int widht, int height, BufferedImage sprite, int dx, int dy) {
        super(x, y, widht, height, sprite);
        
        this.dx = dx;
        this.dy = dy;
        
    }
    
    
    public void tick(){
        
        this.x += dx * spd;
        this.y += dy * spd;
        
        curTime++;
        if(curTime >= time){
            
            Game_01.projectiles.remove(this);
            return;
            
        }
        
    }
   
    
    public void render(Graphics g){
        
        g.setColor(Color.yellow);
        g.fillOval(this.getX() - Camera.x, this.getY() - Camera.y, 10, 10);
       
    }
    
}
