
package Telas;

import Telas.TelaLogin;
import Telas.AreadeVendas;
import core.BancoDeDados;
import java.text.DecimalFormat;
import java.util.Random;

public class ZonadePagamento extends javax.swing.JFrame {

    //Atributos
    public static double tempValor = AreadeVendas.total; 
    public static boolean encerrado = false;
    public static boolean[] parc = new boolean[AreadeVendas.n];
   
    //Construtor
    public ZonadePagamento() {
        initComponents();
       
        //Determina os componentes visíveis para o usuário
       this.SetVisibleComponents();
       // Determina as Abas que podem ser selecionadas e quais não podem
       this.setAbasSelectible(0);
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        abas = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        aVista = new javax.swing.JButton();
        Parcelamento = new javax.swing.JButton();
        Boleto = new javax.swing.JButton();
        voltaraoM = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        vista = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sair = new javax.swing.JButton();
        encerrar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        painelparc = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nparc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vparc = new javax.swing.JLabel();
        voltar1 = new javax.swing.JButton();
        enc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jboleto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        encerr = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        abas.setBackground(new java.awt.Color(0, 0, 0));
        abas.setForeground(new java.awt.Color(0, 102, 0));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        aVista.setBackground(new java.awt.Color(0, 0, 0));
        aVista.setForeground(new java.awt.Color(0, 102, 0));
        aVista.setText("Pagamento á Vista");
        aVista.setToolTipText("Seleciona a Versão de Pagamento à Vista");
        aVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aVistaActionPerformed(evt);
            }
        });

        Parcelamento.setBackground(new java.awt.Color(0, 0, 0));
        Parcelamento.setForeground(new java.awt.Color(0, 102, 0));
        Parcelamento.setText("Pagamento Parcelado");
        Parcelamento.setToolTipText("Seleciona a Versão de Pagamento Parcelado");
        Parcelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcelamentoActionPerformed(evt);
            }
        });

        Boleto.setBackground(new java.awt.Color(0, 0, 0));
        Boleto.setForeground(new java.awt.Color(0, 102, 0));
        Boleto.setText("Boleto Bancário");
        Boleto.setToolTipText("Seleciona a Versão de Pagamento Via Boleto Bancário");
        Boleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoletoActionPerformed(evt);
            }
        });

        voltaraoM.setBackground(new java.awt.Color(0, 0, 0));
        voltaraoM.setForeground(new java.awt.Color(0, 102, 0));
        voltaraoM.setText("Retonar ao Menu Principal");
        voltaraoM.setToolTipText("Retorna à área de vendas");
        voltaraoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaraoMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltaraoM, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Parcelamento)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(aVista)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Boleto)))
                .addGap(150, 150, 150))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(aVista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Parcelamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(voltaraoM)
                .addContainerGap())
        );

        abas.addTab("Selecionar Pagamento", jPanel7);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Total da Compra:");

        vista.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vista.setForeground(new java.awt.Color(0, 102, 0));
        vista.setText("0,00");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("R$:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Agradeçemos a Compra!!!");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Desconto:");

        desc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        desc.setForeground(new java.awt.Color(0, 102, 0));
        desc.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("%");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        sair.setBackground(new java.awt.Color(0, 0, 0));
        sair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(0, 102, 0));
        sair.setText("Voltar ao Menu Inicial");
        sair.setToolTipText("Retorna ao Menu Inicial");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        encerrar.setBackground(new java.awt.Color(0, 0, 0));
        encerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        encerrar.setForeground(new java.awt.Color(0, 102, 0));
        encerrar.setText("Encerrar");
        encerrar.setToolTipText("Encerra sua Compra e Retorna a Zona de Login");
        encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(encerrar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sair)
                    .addComponent(encerrar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 103, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(desc))
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vista)
                                        .addGap(24, 24, 24)))
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(167, 167, 167)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(vista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abas.addTab("À Vista", jPanel8);

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Selecione o No de Parcelas:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner1.setToolTipText("Altere o Campo para Selecionar as Parcelas\\n MAX: 12");
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("R$:");

        subtotal.setForeground(new java.awt.Color(0, 102, 0));
        subtotal.setText("0,00");
        subtotal.setToolTipText("Valor Total de Cada Parcela");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 0));
        jButton4.setText("Confirmar");
        jButton4.setToolTipText("Confirmar o Pagamento de Parcelas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        painelparc.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Agradeçemos a Compra!");

        nparc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nparc.setForeground(new java.awt.Color(0, 102, 0));
        nparc.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Parcelas de:");

        vparc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vparc.setForeground(new java.awt.Color(0, 102, 0));
        vparc.setText("0,00");

        voltar1.setBackground(new java.awt.Color(0, 0, 0));
        voltar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        voltar1.setForeground(new java.awt.Color(0, 102, 0));
        voltar1.setText("Voltar ao Menu Inicial");
        voltar1.setToolTipText("Retorna ao Menu Inicial");
        voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar1ActionPerformed(evt);
            }
        });

        enc.setBackground(new java.awt.Color(0, 0, 0));
        enc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enc.setForeground(new java.awt.Color(0, 102, 0));
        enc.setText("Encerrar");
        enc.setToolTipText("Encerra sua Compra e Retorna a Zona de Login");
        enc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelparcLayout = new javax.swing.GroupLayout(painelparc);
        painelparc.setLayout(painelparcLayout);
        painelparcLayout.setHorizontalGroup(
            painelparcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelparcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(enc)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelparcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelparcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelparcLayout.createSequentialGroup()
                        .addComponent(nparc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vparc)
                        .addGap(8, 8, 8))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(61, 61, 61))
        );
        painelparcLayout.setVerticalGroup(
            painelparcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelparcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelparcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nparc)
                    .addComponent(jLabel6)
                    .addComponent(vparc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(painelparcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar1)
                    .addComponent(enc)))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton4))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelparc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(3, 3, 3)
                                .addComponent(subtotal)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(subtotal))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelparc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abas.addTab("Parcelado", jPanel10);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Com Cristo Vamos ao Banco");

        jboleto.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Código do Boleto MCP:");

        code.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        code.setForeground(new java.awt.Color(0, 102, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Conduza-se a unidade Bancária mais Próxima e Scaneie o Código.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("OBS: Aceitamos todos os tipos de Banco, Inclusive PIX");

        voltar.setBackground(new java.awt.Color(0, 0, 0));
        voltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        voltar.setForeground(new java.awt.Color(0, 102, 0));
        voltar.setText("Voltar ao Menu Inicial");
        voltar.setToolTipText("Retorna ao Menu Inicial");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        encerr.setBackground(new java.awt.Color(0, 0, 0));
        encerr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        encerr.setForeground(new java.awt.Color(0, 102, 0));
        encerr.setText("Encerrar");
        encerr.setToolTipText("Encerra sua Compra e Retorna a Zona de Login");
        encerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jboletoLayout = new javax.swing.GroupLayout(jboleto);
        jboleto.setLayout(jboletoLayout);
        jboletoLayout.setHorizontalGroup(
            jboletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jboletoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jboletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jboletoLayout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encerr))
                    .addGroup(jboletoLayout.createSequentialGroup()
                        .addGroup(jboletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jboletoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jboletoLayout.setVerticalGroup(
            jboletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jboletoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jboletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jboletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(encerr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(0, 102, 0));
        jButton5.setText("Gerar Boleto");
        jButton5.setToolTipText("Gera seu Boleto Bancário");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton5)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        abas.addTab("Boleto Bancário", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParcelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParcelamentoActionPerformed
        
        //Inicializa a zona de pagamento parcelado
       this.setAbasSelectible(2);
       this.initParcelado();
        
    }//GEN-LAST:event_ParcelamentoActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
       
        //calcula o valor das parcelas        
       this.Parcelar();
        
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //finaliza as compras
       this.finalizar();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        //gera um código aleatório para um boleto
        this.setCodeBoleto();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoletoActionPerformed
        //Inicializa a zona de pagamento via boleto bancário
        this.initBoleto();
        this.setAbasSelectible(3);
        
    }//GEN-LAST:event_BoletoActionPerformed

    private void aVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aVistaActionPerformed
        //Inicializa a zona de pagamento a vista
        this.initaVista();
           
        
    }//GEN-LAST:event_aVistaActionPerformed

    // Configura os botões de retorno ao Menu e ao Login 
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        
        this.InitMenu();
        
    }//GEN-LAST:event_voltarActionPerformed

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
        
        this.InitMenu();
        
    }//GEN-LAST:event_voltar1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        
        this.InitMenu();
       
    }//GEN-LAST:event_sairActionPerformed

    private void encActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encActionPerformed
        
        this.InitLogin();
       
    }//GEN-LAST:event_encActionPerformed

    private void encerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrActionPerformed
        
        this.InitLogin();
       
    }//GEN-LAST:event_encerrActionPerformed

    private void encerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarActionPerformed
        
        this.InitLogin();
       
    }//GEN-LAST:event_encerrarActionPerformed

    private void voltaraoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaraoMActionPerformed

        // Caso especial caso o cliente retorne ao Menu sem finalizar o pagamento
        for(int cc  = 0;cc < AreadeVendas.single.length;cc++){
            
            if(AreadeVendas.single[cc] != null){
               
                AreadeVendas.quant[cc] -= AreadeVendas.INTE[cc];
            }
                           
        }
        this.initVendas();
        
    }//GEN-LAST:event_voltaraoMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        // finaliza a compra realizada a vista
        this.jPanel2.setVisible(true);
        this.encerrado = true;       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // salva as alterações no Banco de Dados 
        BancoDeDados.cadastrarBancoDeDados();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ZonadePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZonadePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZonadePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZonadePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZonadePagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boleto;
    private javax.swing.JButton Parcelamento;
    private javax.swing.JButton aVista;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JLabel code;
    private javax.swing.JLabel desc;
    private javax.swing.JButton enc;
    private javax.swing.JButton encerr;
    private javax.swing.JButton encerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel jboleto;
    private javax.swing.JLabel nparc;
    private javax.swing.JPanel painelparc;
    private javax.swing.JButton sair;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel vista;
    private javax.swing.JButton voltar;
    private javax.swing.JButton voltar1;
    private javax.swing.JButton voltaraoM;
    private javax.swing.JLabel vparc;
    // End of variables declaration//GEN-END:variables

    //Implementação dos Métodos 
    public void InitLogin(){
         
        TelaLogin v = new TelaLogin();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
        BancoDeDados.cadastrarBancoDeDados();
    }
    
    public void initVendas(){
        AreadeVendas v = new AreadeVendas();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
        BancoDeDados.cadastrarBancoDeDados();
    }
    
    public void InitMenu(){
        MenuPrincipal v = new MenuPrincipal();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();
        BancoDeDados.cadastrarBancoDeDados();
    }
    
    public void SetVisibleComponents(){
        this.jboleto.setVisible(false);
        this.painelparc.setVisible(false);
        this.jPanel2.setVisible(false);
        this.subtotal.setText(Double.toString(tempValor));       
    }
    
    public void setCodeBoleto(){
        this.jboleto.setVisible(true);
        Random r = new Random();
        long c = r.nextLong();       
        
        while(c < 0){
            c = r.nextLong();     
        }
        this.code.setText(Long.toString(c));
        ZonadePagamento.encerrado = true;
    }
    
    public void Parcelar(){
         int parcela = Integer.parseInt(this.jSpinner1.getValue().toString());  
       
        String valorfinalparc = new DecimalFormat("###,##0.00").format(AreadeVendas.total/parcela);
        this.subtotal.setText(valorfinalparc);
    }
    
    public void finalizar(){
        
        this.painelparc.setVisible(true);
        this.nparc.setText(this.jSpinner1.getValue().toString());
        this.vparc.setText(this.subtotal.getText());
        ZonadePagamento.encerrado = true;
        
    }
    
    public void initaVista(){
        for(int cc = 0;cc < AreadeVendas.comprado.length;cc++){
            
            if(AreadeVendas.comprado[cc]){
                
                this.parc[cc] = false;
                
            }           
        }
         
        this.jboleto.setVisible(true);
        
        this.setAbasSelectible(1);
        
        Random r = new Random();        
        int c = r.nextInt(13) + 1;
        
        this.desc.setText(Integer.toString(c));      
        String v = new DecimalFormat("###,##0.00").format(AreadeVendas.total - ((AreadeVendas.total * c)/100));
        this.vista.setText(v);
    }
    
    public void initParcelado(){
        
         for(int cc = 0;cc < AreadeVendas.comprado.length;cc++){
            
            if(AreadeVendas.comprado[cc]){
                
                this.parc[cc] = true;
                
            }            
        }       
    }
    
    public void initBoleto(){
        
        for(int cc = 0;cc < AreadeVendas.comprado.length;cc++){
            
            if(AreadeVendas.comprado[cc]){
                
                this.parc[cc] = false;
                
            }           
        }
        
    }
    
    public void setAbasSelectible(int p){
        
        for(int cc = 0;cc < 4;cc++){
          
            if(cc != p){
                
               this.abas.setEnabledAt(cc, false); 
                
            }else{
               
                this.abas.setSelectedIndex(p);
                
            }
            
        }
        
       
        
    }
}
