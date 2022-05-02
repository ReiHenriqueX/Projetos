
package core;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class PaineldeFundo extends javax.swing.JPanel{
    
    private ImageIcon img;
    
    public PaineldeFundo(){
       img = new ImageIcon();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        
    }
    
    public void setImg(ImageIcon img){
        this.img = img;
    }
    
    public ImageIcon getImg(){
        return this.img;
    }
    
}
