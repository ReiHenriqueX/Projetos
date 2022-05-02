package Telas;
import static core.Core.login;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        super("Menu Principal");
        initComponents();   
        //Inicializa o Menu Principal junto com o tipo de usuário
        
        this.jPanel1.setOpaque(false);      
        this.jLabel2.setOpaque(true);
        this.jLabel3.setOpaque(true);
        
        this.jLabel1.setOpaque(true);
        this.Nome.setOpaque(true);
        this.Cargo.setOpaque(true);
        
        this.Cargo.setText(TelaLogin.contas[TelaLogin.users]);
        this.Nome.setText(TelaLogin.nomes);
        
        if(TelaLogin.users == 0){
                     
            this.jPanel1.setVisible(false);
             
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        Help = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();
        BotãodoHenrique = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        BotãodoVitão = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargo.setBackground(new java.awt.Color(255, 102, 0));
        Cargo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cargo.setForeground(new java.awt.Color(0, 102, 0));
        Cargo.setToolTipText("Cargo Ocupado pelo Usuário");
        getContentPane().add(Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 103, 17));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("MENU PRINCIPAL");
        jLabel1.setToolTipText("Bem-Vindo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 332, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(153, 153, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Conferir Vendas");
        jButton3.setToolTipText("Se desloca para o relatório de Vendas em Reais");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("Conferir Unidades Vendidas");
        jButton4.setToolTipText("Se desloca para o relatório de Vendas em Unidades");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Usuário Atual:");
        jLabel2.setToolTipText("Exibe seu nome de Usuário");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 102, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Cargo:");
        jLabel3.setToolTipText("Indica seu cargo(ADM, etc)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 51, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Retornar ao Login");
        jButton1.setToolTipText("Volta à área de Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 102, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 153));
        jButton2.setText("Acessar Área de Vendas");
        jButton2.setToolTipText("Conduz à Área de Vendas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 194, -1));

        Nome.setBackground(new java.awt.Color(255, 102, 0));
        Nome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nome.setForeground(new java.awt.Color(0, 102, 0));
        Nome.setToolTipText("Nome do Usuário");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 102, 22));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ESTANTE.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 312));

        jMenuBar2.setMaximumSize(new java.awt.Dimension(54, 32769));
        jMenuBar2.setMinimumSize(new java.awt.Dimension(0, 21));

        Help.setForeground(new java.awt.Color(0, 102, 0));
        Help.setText("Ajuda");
        Help.setToolTipText("Abre o Manual do Programa");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        jMenuItem1.setText("Cargos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cash-register.png"))); // NOI18N
        jMenuItem2.setText("Área de Vendas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vendasgrafico.png"))); // NOI18N
        jMenuItem3.setText("Analisar Vendas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem3);

        jMenuBar2.add(Help);

        MenuSobre.setForeground(new java.awt.Color(0, 102, 0));
        MenuSobre.setText("Sobre");
        MenuSobre.setToolTipText("Cotém informações sobre os criadores");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });

        BotãodoHenrique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Henrique.png"))); // NOI18N
        BotãodoHenrique.setText("Henrique Winterkorn");
        BotãodoHenrique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãodoHenriqueActionPerformed(evt);
            }
        });
        MenuSobre.add(BotãodoHenrique);
        MenuSobre.add(jSeparator1);

        BotãodoVitão.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vitor_Shinobi_portador_da_respiracao_JOSIAS_A_LENDA.png"))); // NOI18N
        BotãodoVitão.setText("Vitor Emmanuel");
        BotãodoVitão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãodoVitãoActionPerformed(evt);
            }
        });
        MenuSobre.add(BotãodoVitão);

        jMenuBar2.add(MenuSobre);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inicializa a área de gerenciamento de vendas por unidade, e dispara uma excessão caso a área de vendas não seja acessada antes
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!(AreadeVendas.apr)) {
            
            JOptionPane.showMessageDialog(MenuPrincipal.this, "Acesse a Área de Vendas 1 Vez", "Alerta", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
        this.initVendasUni();
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed
    //Inicializa a Área de Login caso o usuário deseje retornar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.initLogin();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Inicializa a área de gerenciamento de vendas por unidade, isto é, se a área de Vendas já tiver sido iniciada
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         if (!(AreadeVendas.apr)) {
            
            JOptionPane.showMessageDialog(MenuPrincipal.this, "Acesse a Área de Vendas 1 Vez", "Alerta", JOptionPane.WARNING_MESSAGE);
            
       } else {
            
       this.initVendasReais();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Inicializa a Área de Vendas
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.initÁreadeVendas();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
       
    }//GEN-LAST:event_MenuSobreActionPerformed
    //Configura os menus "Sobre"
    private void BotãodoHenriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãodoHenriqueActionPerformed
        
        JOptionPane.showMessageDialog(MenuPrincipal.this, "HENRIQUE WINTERKORN: \n\nEstudante do 2° ano do EMI Técnico em Informática do Campus Osório\nSobre: Entusiasta da área de ciências da computação,\n"
                + "com foco em: programação JAVA voltada para Desenvolvimento Web e de Games.", "Sobre", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_BotãodoHenriqueActionPerformed

    private void BotãodoVitãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãodoVitãoActionPerformed
        
        JOptionPane.showMessageDialog(MenuPrincipal.this, "VITOR EMAMANUEL: \n\nEstudante do 2° ano do EMI Técnico em Informática do Campus Osório\n"
                + "Sobre: Inteso buscador de conhecimento,\n"
                + "com enfoque nas áreas de Desenvolvimento:\nJAVA, WEB, Backend, Frontend e Desenvolvimento de Games", "Sobre", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_BotãodoVitãoActionPerformed

    //Configuração do Menu de Ajuda
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        JOptionPane.showMessageDialog(MenuPrincipal.this, "1- Os Cargos representam os diferentes níveis de acesso de um usuário ao Sistema\n"
                + "São subdivididos em 3 tipos: Usuário Padrão, Manutenção e Administração(ADM)\n"
                + "Cargos diferentes possuem privilégios e vantagens sobre outros", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(MenuPrincipal.this, "2- A Área de Vendas é o local onde as compras são feitas\n"
                + "Para acessá-la pressione o botão (Acessar Área de Vendas)\n", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         JOptionPane.showMessageDialog(MenuPrincipal.this, "2- Conferir as Vendas Informa quanto, e qual valor foi vendido de um determinado item \n"
                + "Para realizar a verificação você precisa ter o Cargo Manutenção ou Administrador\n"
                + "Posteriormente pressione os botões (Conferir Vendas) ou (Conferir Unidades Vendidas)\n", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BotãodoHenrique;
    private javax.swing.JMenuItem BotãodoVitão;
    private javax.swing.JLabel Cargo;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
    public void initLogin(){
        
        TelaLogin v = new TelaLogin();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
    }
    public void initÁreadeVendas(){
        
        AreadeVendas v = new AreadeVendas();
        
        v.pack();
        v.setResizable(true);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
    }
    public void initVendasUni(){
        
        VendasUni v = new VendasUni();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
    }
    public void initVendasReais(){
         VendasReais v = new VendasReais();
            
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
        
    }

}
