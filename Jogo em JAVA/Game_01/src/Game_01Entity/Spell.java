/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_01Entity;

import Game_01World.Camera;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import game_01.Game_01;

/**
 *
 * @author Win10
 */
public class Spell extends Entity{
    
    public double dx;
    public double dy;
    public double spd = 8;
    public int time = 100, curTime = 0;
    
    
    public Spell(int x, int y, int widht, int height, BufferedImage sprite, double dx, double dy) {
        super(x, y, widht, height, sprite);
        
        this.dx = dx;
        this.dy = dy;
        
    }
    
    public void tick(){
        
        x += dx * spd;
        y += dy * spd;
        
        curTime++;
        if(curTime >= time){
            
            Game_01.spells.remove(this);
            return;
            
        }
        
    }
    
    public void render(Graphics g){
       
        g.drawImage(Entity.SPELL_01, this.getX() - Camera.x, this.getY() - Camera.y, 50, 50, null);
        
    }
        
    
}
