
package Game_01Gráficos;

import Game_01Entity.Curador;
import Game_01Entity.Enemy;
import Game_01Entity.InimigoAzul;
import Game_01Entity.InimigoVermelho;
import Game_01Entity.Player;
import Game_01World.Camera;
import game_01.Game_01;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class UI {
    
    public void render(Graphics g){
        
        //Barra de Vida
        g.setColor(Color.red);
        g.fillRect(20, 20, 250, 40);
        g.setColor(Color.green);
        g.fillRect(20, 20, (int)((Game_01.player.life/Game_01.player.MAX_LIFE) * 250), 40);
        g.setColor(Color.black);
        g.setFont(new Font("Times", Font.BOLD, 25));
        g.drawString((int)(Game_01.player.life) + "/" + Game_01.player.MAX_LIFE, 100, 50);

        //Barra de Energia
        
        g.setColor(Color.gray);
        g.fillRect(20, 60, 150, 30);  
        g.setColor(Color.blue);
        g.fillRect(20, 60, (int)(Player.energy/Player.MAX_ENERGY) * 150, 30);
        g.setColor(Color.white);
        g.setFont(new Font("times", Font.BOLD, 20));
        g.drawString((int)Game_01.player.energy + "/" + Game_01.player.MAX_ENERGY, 70, 82);
        
        
        
        
    }
    
}
