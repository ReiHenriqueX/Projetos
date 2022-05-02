
package Telas;

import Telas.AreadeVendas;
import Classes.Storage;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

public class VendasReais extends javax.swing.JFrame {
    //Atributos
    public static String[] valor = new String[AreadeVendas.n]; 
    public static  double[] val = new double[AreadeVendas.n];
    public static int[] c = new int[AreadeVendas.n];
    private String[] status = new String[AreadeVendas.n];
    private boolean concluido = false;
    private Storage s = new Storage();
    
    
    public VendasReais() {
        initComponents(); 
      
         //Inicializa as unidades vendidas
        this.LoadSelledItems();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineldeFundo1 = new Classes.PaineldeFundo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listanames = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaprice = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        satus = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paineldeFundo1.setBackground(new java.awt.Color(51, 51, 51));
        paineldeFundo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Produto:");
        paineldeFundo1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Quantiade Vendida R$:");
        paineldeFundo1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Voltar ao Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        paineldeFundo1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 322, -1, -1));

        listanames.setBackground(new java.awt.Color(0, 0, 0));
        listanames.setForeground(new java.awt.Color(255, 255, 255));
        listanames.setModel(AreadeVendas.listN);
        jScrollPane1.setViewportView(listanames);

        paineldeFundo1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 119, 225));

        listaprice.setBackground(new java.awt.Color(0, 0, 0));
        listaprice.setForeground(new java.awt.Color(255, 255, 255));
        listaprice.setModel(AreadeVendas.listP);
        jScrollPane2.setViewportView(listaprice);

        paineldeFundo1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 118, 225));

        satus.setBackground(new java.awt.Color(0, 0, 0));
        satus.setForeground(new java.awt.Color(255, 255, 255));
        satus.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(satus);

        paineldeFundo1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 111, 225));

        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Status:");
        paineldeFundo1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fechar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        paineldeFundo1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        paineldeFundo1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        jLabel8.setBackground(new java.awt.Color(38, 37, 37));
        paineldeFundo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 30));

        getContentPane().add(paineldeFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     //Inicializa o menu quando o botão é pressionado
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        this.InitMenu();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(TelaLogin.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasReais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listanames;
    private javax.swing.JList<String> listaprice;
    private Classes.PaineldeFundo paineldeFundo1;
    private javax.swing.JList<String> satus;
    // End of variables declaration//GEN-END:variables

    // Implementa o método que inicializa o menu
    public void InitMenu(){
        
        MenuPrincipal v = new MenuPrincipal();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
        
    }
    // Implementa o Método que carrega o valor das unidades vendidas 
    public void LoadSelledItems(){
          this.listanames.setListData(AreadeVendas.nomes);
               
        if (ZonadePagamento.encerrado) {
                    
            for(int cc = 0;cc < valor.length;cc++){
                                      
               if(AreadeVendas.quant[cc] * AreadeVendas.preco[cc] > val[cc]){
                   
                    val[cc] = AreadeVendas.preco[cc] * AreadeVendas.quant[cc];                                      
                    
               } 
               
                if(ZonadePagamento.parc[cc]){
                        
                    status[cc] = "Pagando...";
                    ZonadePagamento.parc[cc] = false;
                        
                 }else{

                    status[cc] = "Pago!";

                }
                
                valor[cc] = Double.toString(val[cc]);
               
            }                                 
        }
        for(int cc  = 0;cc < valor.length;cc++){
            valor[cc] = new DecimalFormat("0.00").format(val[cc]);
        }
        this.listaprice.setListData(valor);
        this.satus.setListData(status);
    }
    
}
