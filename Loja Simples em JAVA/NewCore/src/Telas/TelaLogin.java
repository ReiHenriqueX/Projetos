package Telas;

import Telas.MenuPrincipal;
import core.BancoDeDados;
import core.Core;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TelaLogin extends javax.swing.JFrame {

    public static String[] contas;
    public static String[] passwords;
    public static String nomes;
    public static int users;
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        super("Área de Login");
        initComponents();
        
        //Inicializa a Tela de Login
        this.LoadLogin();
       
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Login");
        jLabel3.setToolTipText("Zona de Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Acessar");
        jButton1.setToolTipText("Acessa o Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, -1));

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setToolTipText("Senha");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 98, -1));

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setForeground(new java.awt.Color(0, 102, 0));
        exit.setText("Sair");
        exit.setToolTipText("Sair da Aplicação");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 59, -1));

        txtUser.setBackground(new java.awt.Color(0, 0, 0));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setToolTipText("Nome do usuário");
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 98, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginzinho.png"))); // NOI18N
        jLabel1.setText("Nome do Usuário:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chave.png"))); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/in.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fechar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 30));

        jLabel8.setBackground(new java.awt.Color(38, 37, 37));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Eventos de Botões
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
       this.ValidarUsuário();       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
        BancoDeDados.cadastrarBancoDeDados();
    }//GEN-LAST:event_exitActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
       
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
        BancoDeDados.cadastrarBancoDeDados();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(TelaLogin.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    //Implementa o método para Inicializar o Menu
    private void initMenu(){
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.pack();
         Image ícone = null;
                try{
                ícone = ImageIO.read(Core.class.getResource("/Images/melancia.png"));
                }catch(Exception e){
                    e.printStackTrace();
                    
                }
                Toolkit ferramenta = Toolkit.getDefaultToolkit();
                Image imagem = ferramenta.getImage(Core.class.getResource("/Images/melancia.png"));
                Cursor mouse = ferramenta.createCustomCursor(imagem, new Point(0,0), "img");
                menu.setCursor(mouse);
                menu.setAlwaysOnTop(true);
                menu.setIconImage(ícone);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
        menu.setVisible(true);
        this.dispose();
        
    }
    
    // Implementa o Método de Validação do Usuário
    public void ValidarUsuário(){
         if(this.txtUser.getText().isEmpty() 
           && this.password.getText().isEmpty() 
           || this.txtUser.getText().isEmpty() 
           || this.password.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(TelaLogin.this,"Campo de Nome ou Senha Vazios", "Alerta" ,JOptionPane.ERROR_MESSAGE);
            
        }else{
            
        String s = this.password.getText();
        nomes = this.txtUser.getText();
         
        
        if(this.passwords[2].equals(s)){
            
            users = 2;
            this.initMenu();
        
        }else if(this.passwords[1].equals(s)){
            
            users = 1;
            this.initMenu();
            
            
        }else if(this.passwords[0].equals(s)){    
            
            users = 0;
            this.initMenu();
            
        }else{
            
           JOptionPane.showMessageDialog(TelaLogin.this,"Senha Incorreta","Alerta" ,JOptionPane.ERROR_MESSAGE);
            
        }
      }
    }
    
    //Implementa o método que carrega os níveis de usuário
    public void LoadLogin(){
        this.jLabel1.setOpaque(true);
        this.jLabel2.setOpaque(true);
        this.jLabel3.setOpaque(true);
        this.jLabel5.setOpaque(true);
        this.jLabel7.setOpaque(true);
        this.jLabel8.setOpaque(true);        
        contas = new String[3];
        passwords = new String[3];              
        
        contas[0] = "Usuário Padrão";
        contas[1] = "Manutenção";
        contas[2] = "Administração";
        
        passwords[0] = "HRW";
        passwords[1] = "VEMSB";
        passwords[2] = "MCP";
    }
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField password;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
