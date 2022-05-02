package Telas;

import Telas.AreadeVendas;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

public class VendasUni extends javax.swing.JFrame {

    //Atributos
     private String[] quantI = new String[AreadeVendas.n];
     private int[] c = new int[AreadeVendas.n];
     
    public VendasUni() {
        initComponents();
       //Carrega a Quantidade de Itens Vendidos 
       this.LoadSelledUni();
       this.jLabel8.setOpaque(true);
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
        listaquant = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paineldeFundo1.setBackground(new java.awt.Color(51, 51, 51));
        paineldeFundo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Produto:");
        paineldeFundo1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Quantiade Vendida R$:");
        paineldeFundo1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Voltar ao Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        paineldeFundo1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 0));

        listanames.setBackground(new java.awt.Color(0, 0, 0));
        listanames.setForeground(new java.awt.Color(255, 255, 255));
        listanames.setModel(AreadeVendas.listN);
        jScrollPane1.setViewportView(listanames);

        paineldeFundo1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 119, 225));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(0, 102, 0));

        listaquant.setBackground(new java.awt.Color(0, 0, 0));
        listaquant.setForeground(new java.awt.Color(255, 255, 255));
        listaquant.setModel(AreadeVendas.qtd);
        jScrollPane2.setViewportView(listaquant);

        paineldeFundo1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 118, 225));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fechar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        paineldeFundo1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        paineldeFundo1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        jLabel8.setBackground(new java.awt.Color(38, 37, 37));
        paineldeFundo1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        getContentPane().add(paineldeFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inicializa o menu quando o botão é pressionado
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.initMenu();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(TelaLogin.ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendasUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasUni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasUni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listanames;
    private javax.swing.JList<String> listaquant;
    private Classes.PaineldeFundo paineldeFundo1;
    // End of variables declaration//GEN-END:variables

    // Implementa o método que inicializa o menu
    public void initMenu(){
        
        MenuPrincipal v = new MenuPrincipal();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
        
    }
    
    // Implementa o Método que carrega as unidades vendidas 
    public void LoadSelledUni(){
       
        if(ZonadePagamento.encerrado){

           for(int cc= 0;cc < AreadeVendas.listN.getSize();cc++){

               this.getListanames().setListData(AreadeVendas.nomes);

           }

               for(int cc = 0;cc < this.quantI.length;cc++){                  

                       this.c[cc] += (AreadeVendas.quant[cc]);


                 quantI[cc] = Integer.toString(c[cc]);

               }
                this.getListaquant().setListData(quantI);

       }else{

           for(int cc= 0;cc < AreadeVendas.listN.getSize();cc++){
           this.getListanames().setListData(AreadeVendas.nomes);
           }

           for(int cc = 0;cc < this.quantI.length;cc++){


                  c[cc] += 0;   

             quantI[cc] = Integer.toString(c[cc]);

           }
            this.getListaquant().setListData(quantI);

           }
       }

    // Getters e Setters
    public String[] getQuantI() {
        return quantI;
    }

    public void setQuantI(String[] quantI) {
        this.quantI = quantI;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public JList<String> getListanames() {
        return listanames;
    }

    public void setListanames(JList<String> listanames) {
        this.listanames = listanames;
    }

    public JList<String> getListaquant() {
        return listaquant;
    }

    public void setListaquant(JList<String> listaquant) {
        this.listaquant = listaquant;
    }
  
}
