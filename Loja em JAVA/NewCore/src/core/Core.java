
package core;

import Telas.MenuPrincipal;
import Telas.TelaLogin;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.JFrame;

public class Core extends Canvas implements Runnable{
    
	//Atributos
	public static final int WIDTH = 800, HEIGHT = 480;
	public static int SCALE = 2;
	public static JFrame frame;
        public static MenuPrincipal menu;
        public static TelaLogin login;
	public static BufferedImage image = new BufferedImage(WIDTH*SCALE, HEIGHT*SCALE, BufferedImage.TYPE_INT_RGB);
	//Construtor
	public Core() {
            
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));               
		
	}
			
	//Principal
	public static void main(String[] args) throws IOException {
            
                
		Core core = new Core();
                
                // Inicialização da Janela
                
                login = new TelaLogin();
		               
                
                InitWindow();
		//Inicialização Thread
                              
		new Thread(core).start();

	}
	
	
	
	//Tick
	public void tick() {
	   
	}
	
	//Render
	public void render() {
        	
	}
	
	
	//Loop
	@Override
	public void run() {
		long lastTime = System.nanoTime();
        double amoutofTicks = 60.0;
        double ns = 1000000000 / amoutofTicks;
        double timer = System.currentTimeMillis();
        int frames = 0;
        double delta = 0;

        while(true){
	          long now = System.nanoTime();
	          delta += (now - lastTime) / ns;
	          lastTime = now;
	
	          if(delta >= 1){
	
	              tick();
	              render();
	              frames++;
	              delta--;
	
	          }
	          if(System.currentTimeMillis() - timer >= 1){
	
	            System.out.println("FPS: " + frames);
	            timer += 1000;
	            frames = 0;
	
	        } 
        }
	}
	
	public static void InitWindow(){            
            login.pack();
            Image ícone = null;
            try{
            ícone = ImageIO.read(Core.class.getResource("/Images/melancia.png"));
            }catch(Exception e){
                e.printStackTrace();

            }
            Toolkit ferramenta = Toolkit.getDefaultToolkit();
            Image imagem = ferramenta.getImage(Core.class.getResource("/Images/melancia.png"));
            Cursor mouse = ferramenta.createCustomCursor(imagem, new Point(0,0), "img");
            login.setCursor(mouse);
            login.setAlwaysOnTop(true);
            login.setIconImage(ícone);
            login.setResizable(false);
            login.setLocationRelativeTo(null);
            login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            login.setVisible(true);
            login.setVisible(true);
                
        }
        
}
    

