
package game_01;

import Game_01Entity.Enemy;
import Game_01Entity.Entity;
import Game_01Entity.Player;
import Game_01Entity.Projectil;
import Game_01Entity.Spell;
import Game_01Gráficos.Spritesheet;
import Game_01Gráficos.UI;
import Game_01World.Camera;
import Game_01World.World;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

public class Game_01 extends Canvas implements Runnable, KeyListener, MouseListener{
    
    //Atributos
    
    public static JFrame frame;
    public static int WIDHT = 200, HEIGHT = 150;
    public static int SCALE = 4;
    public Thread trad;
    public boolean isRunning;
    public BufferedImage image;
    public static ArrayList<Entity> entities;
    public static ArrayList<Enemy> enemies;
    public static ArrayList<Spell> spells;
    public static ArrayList<Projectil> projectiles;
    public static Spritesheet sprite;
    public static Player player;
    public static World world;
    public static Random rand;
    public UI ui;
    private int CUR_LEVEL = 1, MAX_LEVEL = 2;
    public static String GAME_STATE = "NORMAL";
    private boolean showMasageGameOver = true;
    private boolean restartGame = false;
    private int framesGameOver = 0;

    
    public Game_01(){
    
        this.addKeyListener(this);
        this.addMouseListener(this);
        image = new BufferedImage(WIDHT * SCALE, HEIGHT * SCALE, BufferedImage.TYPE_INT_RGB);
        entities = new ArrayList<Entity>();
        enemies = new ArrayList<Enemy>();
        spells = new ArrayList<Spell>();
        projectiles = new ArrayList<Projectil>();
        ui = new UI();
        sprite = new Spritesheet("/Sprites1.png");
        player = new Player(64, 64, 16, 16, sprite.getSprite(0,0,15,15));
        entities.add(player);
        world = new World("/level1.png");
        frame = new JFrame("Adventure");
        frame.setPreferredSize(new Dimension(WIDHT * SCALE, HEIGHT * SCALE));
        trad = new Thread(this); 
        rand = new Random();
    }
    
    public void render(){
        
        BufferStrategy bs = this.getBufferStrategy();
        
        if(bs == null){
            
           this.createBufferStrategy(3);
           return;
            
        }                   
        
        Graphics g = image.getGraphics();
        world.render(g);
        
        
        for(int cc = 0;cc < entities.size();cc++){
            
            Entity e = entities.get(cc);
            
            
            e.render(g);            
           
        }
        for(int cc = 0;cc < spells.size();cc++){
            spells.get(cc).render(g);
        }
        
        for(int cc = 0;cc < projectiles.size();cc++){
            
            projectiles.get(cc).render(g);         
            
        }
        ui.render(g);
        
        g.dispose();
        
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDHT * SCALE, HEIGHT * SCALE, null);
        
        if(this.GAME_STATE == "GAME_OVER"){
            
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(0,0,0,150));
            g2.fillRect(0, 0, WIDTH * SCALE + 1000, HEIGHT * SCALE );
            g.setFont(new Font("arial", Font.BOLD, 28));
            g.setColor(Color.RED);
            g.drawString("FIM DE JOGO", 325, 250);
            g.setColor(Color.GREEN);
            
            if(showMasageGameOver){
                g.drawString("> Pressione ENTER para reiniciar <", 200, 300);
                
            }
        }
        
        bs.show();
        
    }
    
    public void tick(){
        
        if(this.GAME_STATE == "NORMAL"){
            
            this.restartGame = false;
            
            for(int cc = 0; cc < entities.size(); cc++){

                Entity e = entities.get(cc);  

                e.tick();


            }
            for(int cc = 0;cc < spells.size();cc++){
                spells.get(cc).tick();
            }

            for(int cc = 0;cc < projectiles.size();cc++){

                projectiles.get(cc).tick();           

            }

            if (enemies.isEmpty()) {

                //Avançar Nível

                this.CUR_LEVEL++;

                if (this.CUR_LEVEL > this.MAX_LEVEL) {
                    this.CUR_LEVEL =  1;
                }
                String newWorld = "level" + this.CUR_LEVEL + ".png";
                World.restartWorld(newWorld);
            }
            
        }else if(this.GAME_STATE == "GAME_OVER"){
            
            this.framesGameOver++;
            
            if (this.framesGameOver == 25) {
                this.framesGameOver = 0;
                
                if (this.showMasageGameOver) {
                        
                    this.showMasageGameOver = false;
                    
                }else{
                    
                    this.showMasageGameOver = true;
                    
                }
            }
            if(restartGame){
                
                this.restartGame = false;
                this.GAME_STATE = "NORMAL";
                this.CUR_LEVEL = 1;
                String restarter = "level" + this.CUR_LEVEL + ".png";
                World.restartWorld(restarter);                
                this.GameOver();
                
            }
            
        }

    }
    
    
    public static void main(String[] args) {
       Game_01 game = new Game_01(); 
       game.initFrame();
       frame.add(game);
       game.start();
    }
    
    public void GameOver(){
        
            Game_01.entities.clear();
            Game_01.enemies.clear();

            Game_01.entities = new ArrayList<Entity>();
            Game_01.enemies = new ArrayList<Enemy>();       
            Game_01.sprite = new Spritesheet("/Sprites1.png");
            Game_01.player = new Player(64, 64, 16, 16, sprite.getSprite(0,0,15,15));
            Game_01.entities.add(Game_01.player);
            Game_01.world = new World("/level1.png");
            frame = new JFrame("Adenture");
            frame.setPreferredSize(new Dimension(WIDHT * SCALE, HEIGHT * SCALE));
    }

    @Override
    public void run() {
        
        long lastTime = System.nanoTime();
        double amoutofTicks = 60.0;
        double delta = 0;
        double ns = 1000000000 / amoutofTicks;
        int frames = 0;
        double timer = System.currentTimeMillis();
        
        while(this.isRunning()){
            requestFocus();
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            
            if(delta >= 1){
                
                tick();
                render();
                frames++;
                delta--;
                
            }
           
            if(System.currentTimeMillis() - timer >= 1000){
               
                System.out.println("FPS: " + frames);
                frames = 0;
                timer += 1000;
                
            }
            
        }
        
    }
    
    public void start(){
       
       trad = new Thread(this);
       this.trad.start();
       this.setRunning(true);
        
    }
    
    public void stop(){
        
       trad = new Thread(this);
       this.trad.stop();
       this.setRunning(false);
        
    }
    
    public void initFrame(){
            
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
    }

    public static int getWIDHT() {
        return WIDHT;
    }

    public static void setWIDHT(int WIDHT) {
        Game_01.WIDHT = WIDHT;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static void setHEIGHT(int HEIGHT) {
        Game_01.HEIGHT = HEIGHT;
    }

    public int getSCALE() {
        return SCALE;
    }

    public void setSCALE(int SCALE) {
        this.SCALE = SCALE;
    }

    public Thread getTrad() {
        return trad;
    }

    public void setTrad(Thread trad) {
        this.trad = trad;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            
            this.player.setUp(true);
            
            
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN){
          
            this.player.setDown(true);
           
            
        }
        
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
            this.player.setLeft(true);
            
            
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           
            this.player.setRight(true);
            
            
        }
        
        if(e.getKeyCode() == KeyEvent.VK_Q){
            
            this.player.speling = true;
            
        }
        
        //GAME OVER
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {            
            
                this.restartGame = true;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
         if (e.getKeyCode() == KeyEvent.VK_UP) {
            
            this.player.setUp(false);
            
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN){
          
            this.player.setDown(false);
            
        }
        
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
            this.player.setLeft(false);
            
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           
            this.player.setRight(false);
            
        }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        player.mouseSpelling = true;
        player.mauseatx = (e.getX()/SCALE);
        player.mauseaty = (e.getY()/SCALE);
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
