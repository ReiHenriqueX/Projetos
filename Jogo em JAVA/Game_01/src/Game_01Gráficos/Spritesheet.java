/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_01Gráficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Win10
 */
public class Spritesheet {
   
     public static BufferedImage spritesheet;
     
      public Spritesheet(String path){//método que busca a spritesheet na pasta com as imagens
        try {
            spritesheet = ImageIO.read(getClass().getResource(path));
            
        } catch (IOException ex) {
            Logger.getLogger(Spritesheet.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
      public BufferedImage getSprite(int x, int y, int widht, int height){
      return spritesheet.getSubimage(x, y, widht, height);
    }
}
