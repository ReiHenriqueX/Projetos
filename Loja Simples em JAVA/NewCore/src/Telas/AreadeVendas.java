package Telas;

//Importações
import core.BancoDeDados;
import Classes.Storage;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class AreadeVendas extends javax.swing.JFrame {
   
    //Atributos Inteiros
    public static int n = BancoDeDados.tam;
    private int selected;
    private int[] j = new int[n];
    public static int[] INTE = new int[n];
    
    //Atributos e Vetores Strings
    public static String[] nomes = new String[n];   
    public static String[] single = new String[n];
    public static String[] singlep = new String[n];
    public static String[] singlev = new String[n];
    private String[] Valor = new String[n];
    private String[] auxn = new String[n];
    private String[] auxq = new String[n];
    public static String[] J = new String[n]; 
    private String x;
    
    //Default Lists
    private DefaultListModel listI = new DefaultListModel();
    public static DefaultListModel listN = new DefaultListModel();
    public static DefaultListModel listP = new DefaultListModel();
    public static DefaultListModel listCar = new DefaultListModel();
    public static DefaultListModel dfpreço = new DefaultListModel();
    public static DefaultListModel qtd = new DefaultListModel();  
    
    //Atributos e Vetores de valor Flutuante  
    public static double preco[] = new double[n];
    public static double[] quant = new double[n];
    public static double[] auxquant = new double[n];
    public static double total;
    private double[] auxp = new double[n];
    
    //Atributos e Vetores de valor Booleano
    private boolean cadastro = false;
    public static boolean apr = false;
    public static boolean[] comprado = new boolean[n];   
    
    //Inicialização do Storage(Estoque)
    private Storage v = new Storage();
		 
    public AreadeVendas() {
        super("Área de Vendas");
        initComponents();               
        
        // Inicializa a Janela o valor de vendas 0
        ZonadePagamento.encerrado = false;
        
        this.apr = true;
        
        // Redefine os Modelos de lista Padrão
        this.CleanDefaultLists();
        
        // Inicializa os itens comprados como null
        this.resetCompras();                          
        
        // Limpa o valor das Listas
        this.CleanList();
        
        // Coloca o ícone da janela
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin.jpg")).getImage());               
       
        //Inicia o Banco de dados
        BancoDeDados.iniciaBancoDeDados();
        
        // Inicializa os Nomes dos Produtos         
        this.InitCatalogue();
        
        // Inicializa o usuário 
        this.initUser();        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineldeFundo1 = new Classes.PaineldeFundo();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        preço = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jpanelfinal = new javax.swing.JPanel();
        finalize = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ValorTotal = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        quantidade = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Remover = new javax.swing.JButton();
        RemoveAll = new javax.swing.JButton();
        painelcadas = new javax.swing.JPanel();
        txtcadas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtcadaspreco = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        painelremove = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        VoltaraoMenu = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        jpanelselectqtd = new javax.swing.JPanel();
        addCarrinho = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        selecionarqtd = new javax.swing.JSpinner();
        totqtd = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listap = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listac = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listan = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        paineldeFundo1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinho.png"))); // NOI18N
        jLabel16.setToolTipText("Hora das Compras!");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register.png"))); // NOI18N
        jLabel17.setToolTipText("Compras em Andamento");

        txtCode.setBackground(new java.awt.Color(0, 0, 0));
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setToolTipText("Digite o índice do Item Desejado");
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });

        preço.setBackground(new java.awt.Color(0, 0, 0));
        preço.setForeground(new java.awt.Color(255, 255, 255));
        preço.setModel(this.dfpreço);
        preço.setToolTipText("Valor em Função da Quantidade Selecionada");
        preço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                preçoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(preço);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Pesquise um Produto por Índice:");

        jpanelfinal.setBackground(new java.awt.Color(51, 51, 51));

        finalize.setBackground(new java.awt.Color(0, 0, 0));
        finalize.setForeground(new java.awt.Color(0, 102, 0));
        finalize.setText("Finalizar Compra");
        finalize.setToolTipText("Finaliza sua Compra baseado no Valor Final");
        finalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizeActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Total a pagarR$:");
        jLabel6.setToolTipText("Total a ser Pago");

        ValorTotal.setForeground(new java.awt.Color(0, 102, 0));
        ValorTotal.setText("0,00");
        ValorTotal.setToolTipText("Total a ser Pago");

        javax.swing.GroupLayout jpanelfinalLayout = new javax.swing.GroupLayout(jpanelfinal);
        jpanelfinal.setLayout(jpanelfinalLayout);
        jpanelfinalLayout.setHorizontalGroup(
            jpanelfinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelfinalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelfinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalize, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelfinalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValorTotal)))
                .addContainerGap())
        );
        jpanelfinalLayout.setVerticalGroup(
            jpanelfinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelfinalLayout.createSequentialGroup()
                .addGroup(jpanelfinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ValorTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalize))
        );

        quantidade.setBackground(new java.awt.Color(0, 0, 0));
        quantidade.setForeground(new java.awt.Color(255, 255, 255));
        quantidade.setModel(this.qtd);
        quantidade.setToolTipText("Quantidade selecionada");
        quantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantidadeMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(quantidade);

        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Valor: R$");

        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Quantidade:");

        Remover.setBackground(new java.awt.Color(0, 0, 0));
        Remover.setForeground(new java.awt.Color(0, 102, 0));
        Remover.setText("Remover um Item");
        Remover.setToolTipText("Remove um Item Selecionado do seu Carrinho");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        RemoveAll.setBackground(new java.awt.Color(0, 0, 0));
        RemoveAll.setForeground(new java.awt.Color(0, 102, 0));
        RemoveAll.setText("Remover Tudo");
        RemoveAll.setToolTipText("Remove todos os Itens do seu Carrinho ");
        RemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAllActionPerformed(evt);
            }
        });

        painelcadas.setBackground(new java.awt.Color(51, 51, 51));

        txtcadas.setBackground(new java.awt.Color(0, 0, 0));
        txtcadas.setForeground(new java.awt.Color(255, 255, 255));
        txtcadas.setToolTipText("Digite no Campo o Nome do Produto");

        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Nome do Produto a ser Registrado:");

        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Preço do Produto a ser Registrado:");

        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("R$:");

        txtcadaspreco.setBackground(new java.awt.Color(0, 0, 0));
        txtcadaspreco.setForeground(new java.awt.Color(255, 255, 255));
        txtcadaspreco.setToolTipText("Digite o Preço que o Produto terá");
        txtcadaspreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadasprecoActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(0, 0, 0));
        Cadastrar.setForeground(new java.awt.Color(0, 102, 0));
        Cadastrar.setText("Cadastrar");
        Cadastrar.setToolTipText("Cadastra o Item baseando-se nos Valores Informados");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        painelremove.setBackground(new java.awt.Color(51, 51, 51));

        remove.setBackground(new java.awt.Color(0, 0, 0));
        remove.setForeground(new java.awt.Color(0, 102, 0));
        remove.setText("Excluir");
        remove.setToolTipText("Exclui o Item Selecionado da Lista de Produtos");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelremoveLayout = new javax.swing.GroupLayout(painelremove);
        painelremove.setLayout(painelremoveLayout);
        painelremoveLayout.setHorizontalGroup(
            painelremoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelremoveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelremoveLayout.setVerticalGroup(
            painelremoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelremoveLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(remove))
        );

        javax.swing.GroupLayout painelcadasLayout = new javax.swing.GroupLayout(painelcadas);
        painelcadas.setLayout(painelcadasLayout);
        painelcadasLayout.setHorizontalGroup(
            painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelcadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelcadasLayout.createSequentialGroup()
                        .addGroup(painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtcadas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelcadasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelcadasLayout.createSequentialGroup()
                                .addGroup(painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(painelcadasLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcadaspreco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelcadasLayout.createSequentialGroup()
                                .addGroup(painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelremove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cadastrar))
                                .addGap(52, 52, 52))))))
        );
        painelcadasLayout.setVerticalGroup(
            painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelcadasLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(7, 7, 7)
                .addGroup(painelcadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcadaspreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelremove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        VoltaraoMenu.setBackground(new java.awt.Color(0, 0, 0));
        VoltaraoMenu.setForeground(new java.awt.Color(0, 102, 0));
        VoltaraoMenu.setText("Voltar ao Menu");
        VoltaraoMenu.setToolTipText("Retorna para o Menu Principal");
        VoltaraoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltaraoMenuActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(0, 0, 0));
        Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 102, 0));
        Search.setText("Buscar");
        Search.setToolTipText("Realiza uma Busca pelo índice informado no Campo de Texto");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Carrinho:");

        carrinho.setBackground(new java.awt.Color(0, 0, 0));
        carrinho.setForeground(new java.awt.Color(255, 255, 255));
        carrinho.setModel(this.listCar);
        carrinho.setToolTipText("Itens do seu Carrinho");
        carrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrinhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(carrinho);

        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Subtotal:");

        subtotal.setForeground(new java.awt.Color(0, 102, 0));
        subtotal.setText("0,00");
        subtotal.setToolTipText("Subtototal");

        jpanelselectqtd.setBackground(new java.awt.Color(51, 51, 51));

        addCarrinho.setBackground(new java.awt.Color(0, 0, 0));
        addCarrinho.setForeground(new java.awt.Color(0, 153, 0));
        addCarrinho.setText("Adicionar ao Carrinho");
        addCarrinho.setToolTipText("Adiciona o item selecionado ao seu Carrino");
        addCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarrinhoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Informe a Quantidade Desejada");

        selecionarqtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        selecionarqtd.setToolTipText("Aumente ou Diminua a Quantidade do Item Desejada");
        selecionarqtd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                selecionarqtdStateChanged(evt);
            }
        });

        totqtd.setForeground(new java.awt.Color(0, 102, 0));
        totqtd.setText("0,00");
        totqtd.setToolTipText("Valor em Função da Quantidade Indicada");

        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("R$");

        javax.swing.GroupLayout jpanelselectqtdLayout = new javax.swing.GroupLayout(jpanelselectqtd);
        jpanelselectqtd.setLayout(jpanelselectqtdLayout);
        jpanelselectqtdLayout.setHorizontalGroup(
            jpanelselectqtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelselectqtdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelselectqtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(addCarrinho)
                    .addGroup(jpanelselectqtdLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(selecionarqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpanelselectqtdLayout.setVerticalGroup(
            jpanelselectqtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelselectqtdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelselectqtdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionarqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totqtd)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCarrinho)
                .addGap(12, 12, 12))
        );

        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Nome do Produto");

        listap.setBackground(new java.awt.Color(0, 0, 0));
        listap.setForeground(new java.awt.Color(255, 255, 255));
        listap.setModel(listP);
        listap.setToolTipText("Tabela de Preços");
        listap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listapMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(listap);

        listac.setBackground(new java.awt.Color(0, 0, 0));
        listac.setForeground(new java.awt.Color(255, 255, 255));
        listac.setModel(listI);
        listac.setToolTipText("Códigos dos Produtos");
        listac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listac);

        listan.setBackground(new java.awt.Color(0, 0, 0));
        listan.setForeground(new java.awt.Color(255, 255, 255));
        listan.setModel(this.listN);
        listan.setToolTipText("Lista com os Nomes dos Produtos");
        listan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listan);

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Código");

        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Preço R$");

        javax.swing.GroupLayout paineldeFundo1Layout = new javax.swing.GroupLayout(paineldeFundo1);
        paineldeFundo1.setLayout(paineldeFundo1Layout);
        paineldeFundo1Layout.setHorizontalGroup(
            paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jpanelselectqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addGap(37, 37, 37)
                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(painelcadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)
                                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)))
                                .addGap(42, 42, 42)
                                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RemoveAll, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Remover)))
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VoltaraoMenu)
                                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(subtotal)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpanelfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(39, 39, 39))))
        );
        paineldeFundo1Layout.setVerticalGroup(
            paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addComponent(jpanelselectqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(painelcadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(88, 88, 88))
                    .addGroup(paineldeFundo1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane5))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldeFundo1Layout.createSequentialGroup()
                                .addComponent(Remover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveAll)
                                .addGap(55, 55, 55)))
                        .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paineldeFundo1Layout.createSequentialGroup()
                                .addGroup(paineldeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(subtotal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VoltaraoMenu))
                            .addComponent(jpanelfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineldeFundo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jMenu1.setForeground(new java.awt.Color(0, 102, 0));
        jMenu1.setText("Ajuda");
        jMenu1.setToolTipText("Abre o Manual do Programa");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jMenuItem1.setText("Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinodow.png"))); // NOI18N
        jMenuItem2.setText("Adicionar ao Carrinho");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cursor.png"))); // NOI18N
        jMenuItem3.setText("Selecionar Itens ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/list.png"))); // NOI18N
        jMenuItem4.setText("Cadastrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/x-button.png"))); // NOI18N
        jMenuItem5.setText("Excluir Itens (da Lista)");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eraser.png"))); // NOI18N
        jMenuItem6.setText("Remover Itens do Carrinho");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-cart.png"))); // NOI18N
        jMenuItem7.setText("Finalizar Compra");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paineldeFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paineldeFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Métodos que definem o item selecionado das Listas de Produtos
    private void listacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listacMouseClicked
        
       this.MouseSelecting(listac.getSelectedIndex(), listan, listap);
        
    }//GEN-LAST:event_listacMouseClicked

    private void listanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listanMouseClicked
        
        this.MouseSelecting(listan.getSelectedIndex(), listac, listap);                
        
    }//GEN-LAST:event_listanMouseClicked

    private void listapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listapMouseClicked
               
       this.MouseSelecting(listap.getSelectedIndex(), listac, listan);
        
    }//GEN-LAST:event_listapMouseClicked

    // Método que dispara o evento de busca poir índice de item na lista de produtos
    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        
       this.Search(evt);
        
    }//GEN-LAST:event_txtCodeKeyPressed

    // Método que define a quantidade de itens selecionados pelo usuário
    private void selecionarqtdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_selecionarqtdStateChanged
        
        this.selected = this.listap.getSelectedIndex();
        j = new int[n];
        
        j[selected] = Integer.parseInt(this.selecionarqtd.getValue().toString()); 
        this.SelecionarQtd(this.listap.getSelectedIndex());
        
    }//GEN-LAST:event_selecionarqtdStateChanged

    // Método que adiciona os itens selecionados ao carrinho
    private void addCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarrinhoActionPerformed
            
        double V = 1;                      
        this.jpanelfinal.setVisible(true);
        
        if (j[selected] == 0) {

            JOptionPane.showMessageDialog(AreadeVendas.this, "Selecione ao Menos um item", "Alerta", JOptionPane.INFORMATION_MESSAGE);

        } else {
           
            this.RegisterLittleCar();
            
        }
       
    }//GEN-LAST:event_addCarrinhoActionPerformed

    // Método que remove os itens selecionados do carrinho
    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        
         this.removerUni();
        
    }//GEN-LAST:event_RemoverActionPerformed

    // Método que remove todos itens do carrinho
    private void RemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAllActionPerformed
        
        this.removerAll();
        
    }//GEN-LAST:event_RemoveAllActionPerformed

    // Método que cadastra itens ao Catálogo de Produtos
    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
            try{       
           this.Cadastrar();
           }catch(Exception e){
           JOptionPane.showMessageDialog(AreadeVendas.this, "Este campo suporta somete Valores Numéricos", "Alerta",JOptionPane.ERROR_MESSAGE);
           n--;
       } 
    }//GEN-LAST:event_CadastrarActionPerformed

    // Método que remove itens ao Catálogo de Produtos
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
               
      this.removerCadastro();
        
    }//GEN-LAST:event_removeActionPerformed

    // Método que finaliza as compras
    private void finalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizeActionPerformed
        if(AreadeVendas.single != null){
        
             this.FinalizarCompra();
        }else{
           
            JOptionPane.showMessageDialog(this, "Adquira pelo menos 1 item", "Alerta",JOptionPane.ERROR_MESSAGE);
            
        }
        BancoDeDados.cadastrarBancoDeDados();
    }//GEN-LAST:event_finalizeActionPerformed

    // Método que retorna ao menu Principal
    private void VoltaraoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltaraoMenuActionPerformed
       
        int resp = JOptionPane.showConfirmDialog(AreadeVendas.this, "Tem Certeza que deseja sair?\nSuas compras serão perdidas", "Alerta", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
             BancoDeDados.cadastrarBancoDeDados();
            this.initMenuPrincipal();  
            
        }
    }//GEN-LAST:event_VoltaraoMenuActionPerformed

    private void txtcadasprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadasprecoActionPerformed
       
    }//GEN-LAST:event_txtcadasprecoActionPerformed

    // Método que realiza a busca de itens através do evento de botão
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        
        this.SearchItem();
        
    }//GEN-LAST:event_SearchActionPerformed

    // Método que define qual é o item selecionado no carrinho
    private void carrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoMouseClicked
        
        this.MouseSelecting(this.carrinho.getSelectedIndex(), quantidade, preço);
        
    }//GEN-LAST:event_carrinhoMouseClicked

    private void quantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantidadeMouseClicked
       
        this.MouseSelecting(this.quantidade.getSelectedIndex(), carrinho, preço);
        
    }//GEN-LAST:event_quantidadeMouseClicked

    private void preçoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preçoMouseClicked
              
       this.MouseSelecting(this.preço.getSelectedIndex(), carrinho, quantidade);
        
    }//GEN-LAST:event_preçoMouseClicked

    // Método que salva as alterações feitas no progrtama após o usuário fechar a janela
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        BancoDeDados.cadastrarBancoDeDados();
    }//GEN-LAST:event_formWindowClosing

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    // Configuração dos Menus de Ajuda
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(AreadeVendas.this, "1- Para realizar a Busca por índice;\n"
                + "digite o índice desejado no campo de texto\n"
                + "e pressione o botão (Buscar),\nou pressione a tecla ENTER do seu Teclado", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(AreadeVendas.this, "2- Para Adicionar Itens ao Carrinho, selecione o Item desejado;\n"
                + "defina sua quantidade através do botão giratório\n"
                + "e pressione o botão Adicionar ao Carrinho", "Ajuda", JOptionPane.INFORMATION_MESSAGE);        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         JOptionPane.showMessageDialog(AreadeVendas.this, "3- Para Selecionar Itens;\n"
                + "clique sobre o nome "
                + "\nou código do item no catálogo", "Ajuda", JOptionPane.INFORMATION_MESSAGE);        
             
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
         JOptionPane.showMessageDialog(AreadeVendas.this, "4- Para Cadastrar Itens: \n"
                + "primeiramente você precisa ter o Cargo de ADM(Administrador) ou Manutenção;\n"
                + "após isso, digite o Nome do Item no campo de Texto Indicado\n"
                + "Informe o preço no campo de texto logo abaixo(somente valores numéricos)\n"
                + "Pressione o Botão Cadastrar", "Ajuda", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       JOptionPane.showMessageDialog(AreadeVendas.this, "5- Para Excluir Itens do Catálogo;\n"
                + "primeiramente você precisa ter o Cargo de ADM(Administrador)"
                + "\nSelecione o Item a ser Excluído"
                + "\npressione o botão excluir", "Ajuda", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        JOptionPane.showMessageDialog(AreadeVendas.this, "6- Para Excluir Itens do carrinho;\n"              
                + "Selecione o Item a ser Removido"
                + "\npressione o botão remover um item"
                + "\nou pressione o botão remover tudo (caso queira remover todos os itens)", "Ajuda", JOptionPane.INFORMATION_MESSAGE);   
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        JOptionPane.showMessageDialog(AreadeVendas.this, "7- Para Finalizar sua Compra;\n"              
                + "Certifique-se que você tenha comprado tudo o que deseja"
                + "\nPressione o botão Finalizar Compra"
                , "Ajuda", JOptionPane.INFORMATION_MESSAGE);  
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(AreadeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreadeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreadeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreadeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreadeVendas().setVisible(true);
            }
        });
    }

    //Componentes da Janela
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton RemoveAll;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Search;
    private javax.swing.JLabel ValorTotal;
    private javax.swing.JButton VoltaraoMenu;
    private javax.swing.JButton addCarrinho;
    private javax.swing.JList<String> carrinho;
    private javax.swing.JButton finalize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel jpanelfinal;
    private javax.swing.JPanel jpanelselectqtd;
    private javax.swing.JList<String> listac;
    private javax.swing.JList<String> listan;
    private javax.swing.JList<String> listap;
    private javax.swing.JPanel painelcadas;
    private Classes.PaineldeFundo paineldeFundo1;
    private javax.swing.JPanel painelremove;
    private javax.swing.JList<String> preço;
    private javax.swing.JList<String> quantidade;
    private javax.swing.JButton remove;
    private javax.swing.JSpinner selecionarqtd;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel totqtd;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtcadas;
    private javax.swing.JTextField txtcadaspreco;
    // End of variables declaration//GEN-END:variables

    // Implementa o método que realiza a selecção de um item na lista Principal
    public void MouseSelecting(int selected, JList list1, JList list2){
        
        list1.setSelectedIndex(selected);
        list2.setSelectedIndex(selected);
        this.jpanelselectqtd.setVisible(true);
        
    }
    
    // Implementa o método que realiza a busca por um item
    public void SearchItem(){
         x = this.txtCode.getText();
                                
            if(Integer.parseInt(x) >= 0 && Integer.parseInt(x) < n){

            this.selected = Integer.parseInt(x);

            this.listac.setSelectedIndex(selected);
            this.listan.setSelectedIndex(selected);
            this.listap.setSelectedIndex(selected);

            }else{
                
                JOptionPane.showMessageDialog(AreadeVendas.this, "Índice " + x + " não encontrado", "Alerta", JOptionPane.WARNING_MESSAGE);
        
            }
    }
    
    // Implementa o método que inicializa o menu principal
    public void initMenuPrincipal(){
        MenuPrincipal v = new MenuPrincipal();
        
        v.pack();
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
               
        this.dispose();          
    }
    
    // Implementa o método que remove apenas um item selecionado do carrinho
    public void removerUni(){
        
        AreadeVendas.dfpreço.setSize(n);
        AreadeVendas.qtd.setSize(n);       
        AreadeVendas.listCar.setSize(n);              
        
        AreadeVendas.listCar.removeElementAt(carrinho.getSelectedIndex());
        AreadeVendas.qtd.removeElementAt(quantidade.getSelectedIndex());
        AreadeVendas.dfpreço.removeElementAt(preço.getSelectedIndex());
        
        this.selected = listan.getSelectedIndex();
        AreadeVendas.total -= Integer.parseInt(J[selected]) * preco[selected];
        AreadeVendas.quant[selected] -= INTE[selected];
        INTE[selected] = 0;
        
        AreadeVendas.single[this.listan.getSelectedIndex()] = null;
        AreadeVendas.J[this.listan.getSelectedIndex()] = null;
        AreadeVendas.singlep[this.listap.getSelectedIndex()] = null;
        AreadeVendas.singlev[this.listap.getSelectedIndex()] = null;
               
        this.subtotal.setText(new DecimalFormat("0.00").format(total));
        this.ValorTotal.setText(subtotal.getText());
        this.repaint();
    }
    
    // Implementa o método que remove todos os itens do carrinho
    public void removerAll(){
        AreadeVendas.listCar.clear();
        AreadeVendas.qtd.clear();
        AreadeVendas.dfpreço.clear();
        
        total = 0;       
        
       for(int cc  = 0;cc < INTE.length;cc++){
           
           AreadeVendas.quant[cc] -= INTE[cc];
           INTE[cc] = 0;
       }
       
        
       for(int cc = 0;cc < single.length;cc++){
        
        AreadeVendas.single[cc] = null;
        AreadeVendas.J[cc] = null;
        AreadeVendas.singlev[cc] = null;
        AreadeVendas.singlep[cc] = null;
        
        }
               
        this.subtotal.setText((new DecimalFormat("0.00").format(total)));
        this.ValorTotal.setText(subtotal.getText());
        this.repaint();
    }
    
    // Implementa o método que cadastra itens no Catálogo
    public void Cadastrar(){
        
        n++;       
       double d;
        String t = this.txtcadas.getText();  

       
        if (this.txtcadaspreco.getText().equals("0") || this.txtcadaspreco.getText().equals(",")) {
               
                JOptionPane.showMessageDialog(this, "Não é possível cadastrar itens com o valor 0\n"
                        + "Alterando o valor para 1,00", "Alerta", JOptionPane.ERROR_MESSAGE);
                d = 1;
        }else{
            
            d = Double.parseDouble(this.txtcadaspreco.getText());
            
        }
               
        String c = new DecimalFormat("###,##0.00").format(d);

        this.listI.removeAllElements();
        for(int cc = 0;cc < n;cc++){

            if(cc > this.listI.getSize()){
                break;
            }else if(cc >= this.listI.getSize()){
                listI.addElement(cc);
            }          

        }    

        AreadeVendas.listN.addElement(t);
        AreadeVendas.listP.addElement(c);

        this.initPreco(n,d);
        this.initNomes(n, t);

        this.cadastro = true;
        v.fileNomes(n, nomes);
        v.filePrices(n, preco);
        v.fileQuant(n, quant);
        v.FileComprado(n);
        this.txtcadas.setText("");
        this.txtcadaspreco.setText("");
       
    }
    
    // Implementa o método que finaliza as compras  
    public void FinalizarCompra(){
         double V = 1; 
        if(V == 1){
            
             v.removeJotinha(n, J);
             v.removeSingleV(n, AreadeVendas.singlev);
             
         }
        v.FileComprado(n);
        for(int cc = 0;cc < single.length;cc++){           
            
            if(single[cc] == null){
                
                comprado[cc] = false;
                
            }else{
                comprado[cc] = true;
            }
                
            
        }
            
        ZonadePagamento payzone = new ZonadePagamento();
        
        payzone.pack();
        payzone.setResizable(false);
        payzone.setLocationRelativeTo(null);
        payzone.setVisible(true);
               
        this.dispose();
        
    }
    // Implementa o método que seleciona a quantidade de itens
    public void SelecionarQtd(int selected){       
        
        double b = preco[selected] * j[selected];
       
        this.totqtd.setText(new DecimalFormat("###,##0.00").format(b));
    }
    
    // Implementa o método que realiza as buscas pelos itens
    public void Search(java.awt.event.KeyEvent evt){
      
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            x = this.txtCode.getText();
                                
            if(Integer.parseInt(x) >= 0 && Integer.parseInt(x) < n){

            this.selected = Integer.parseInt(x);

            this.listac.setSelectedIndex(selected);
            this.listan.setSelectedIndex(selected);
            this.listap.setSelectedIndex(selected);

            }else{
                
                JOptionPane.showMessageDialog(AreadeVendas.this, "Índice " + x + " não encontrado", "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        }
   }
    
    // Implementa o método que inicializa os usuários 
    public void initUser(){
        
         if (TelaLogin.users == 0) {
            
           this.painelcadas.setVisible(false);
            
        } else if(TelaLogin.users == 1){
            
            this.painelremove.setVisible(false);
            
        }
         
    }
    // Implementa o método que limpa os Modelos de Lista Padrão
    public void CleanDefaultLists(){
        
        AreadeVendas.dfpreço.clear();
        AreadeVendas.qtd.clear();
        AreadeVendas.listCar.clear(); 
    }
    
    // Implementa o método que limpa as listas principais
    public void CleanList(){
        
        this.listI.removeAllElements();
        AreadeVendas.listP.removeAllElements();
        AreadeVendas.listN.removeAllElements();
        
    }
    
    // Implementa o método que reinicia os arrays principais
    public void resetCompras(){
        
        AreadeVendas.single = new String[n];
        AreadeVendas.singlep = new String[n];
        AreadeVendas.singlev = new String[n];
        AreadeVendas.J = new String[n];
        AreadeVendas.INTE = new int[n];
        AreadeVendas.total = 0;
        
    }
    
    // Implementa o método que inicializa o catálogo de itens
    public void InitCatalogue(){
        v.fileNomes(n, nomes);
        v.filePrices(n, preco);
        v.fileQuant(n, quant);
        
        for(int cc = 0;cc < n;cc++){
            
            listI.addElement(cc);           
            
        }
        
        for (String nome : nomes) {
            listN.addElement(nome);
        }
        for(int cc = 0;cc < preco.length;cc++){
                        
            listP.addElement(new DecimalFormat("###,##0.00").format((preco[cc])));
        }
        
        this.jpanelfinal.setVisible(false);
        this.jpanelselectqtd.setVisible(false);
    }
    
     // Implementa o método que altera os valores de Arrays para adicionar ao carrinho
    public void Alterations(){
        INTE[selected] += j[selected];
        singlev[selected] = Double.toString(preco[selected] * INTE[selected]);
        singlep[selected] = Double.toString(preco[selected] * INTE[selected]);
        double[] cont = new double[n];
        cont[selected] = (preco[selected] * INTE[selected]);
        singlep[selected] = new DecimalFormat("0.00").format(preco[selected] * INTE[selected]);
        single[selected] = nomes[selected];
    }
    
    // Implementa o método que adiciona itens ao carrinho 
    public void RegisterLittleCar(){
        
        v.fileSingle(n);
        v.fileJ(n);
        v.fileSinglep(n);
        v.removeCarrinho(n);       

        this.cleanDefaultLists();
        
        this.selected = this.listan.getSelectedIndex();

        this.Alterations();

        for (String single1 : single) {
            if (single1 != null) {
                listCar.addElement(single1);
            }
        }

         for(int cc = 0; cc < singlep.length;cc++){

            if(singlev[cc] != null){
            dfpreço.addElement(singlep[cc]);
            }

        }

        J[selected] = Integer.toString(INTE[selected]);

        for (String J1 : J) {
            if (J1 != null) {
                qtd.addElement(J1);
            }
        }
        AreadeVendas.quant[selected] += j[selected];

        total += preco[selected] * j[selected];

        this.subtotal.setText(new DecimalFormat("0.00").format(total));
        this.ValorTotal.setText(subtotal.getText());

        this.selecionarqtd.setValue(0);
        this.totqtd.setText("0,00");
        
    }
    
    // Implementa o método que remove os itens do cadastro 
    public void removerCadastro(){
        this.listI.setSize(n);
        AreadeVendas.listN.setSize(n);
        AreadeVendas.listP.setSize(n);
        AreadeVendas.listCar.setSize(n);
        AreadeVendas.dfpreço.setSize(n);
        AreadeVendas.qtd.setSize(n);

        this.selected = this.listan.getSelectedIndex();
        
        this.listI.removeElementAt(selected);
        AreadeVendas.listN.removeElementAt(selected);
        AreadeVendas.listP.removeElementAt(selected);
        
        n--;
        v.removeFileName(n, nomes, selected);
        v.removeFilePrice(n, preco, selected);
        this.repaint();
    }   
   
    // Implementa o método que inicializa a janela com os noes padrões 
    public void initNomes(int c, String n){
      
        nomes[0] = "Balas";
	nomes[1] = "Chicletes";
	nomes[2] = "Chocolates";
	nomes[3] = "Suco de laranja";
	nomes[4] = "Suco de uva";
	nomes[5] = "Sanduíche";
        
        this.auxn = new String[c];
        
        System.arraycopy(nomes, 0, this.auxn, 0, nomes.length);
        
        AreadeVendas.nomes = new String[c];
        
        System.arraycopy(auxn, 0, AreadeVendas.nomes, 0, auxn.length);
        
        AreadeVendas.nomes[c - 1] = n;
        
    }
    
    // Implementa o método que inicializa a janela com os valores padrão 
    public void initPreco(int n, double v){
        
        preco[0] = 0.20;
        preco[1] = 0.30;
        preco[2] = 2.00;
        preco[3] = 5.00;
        preco[4] = 6.00;
        preco[5] = 10.00;
        
        this.auxp = new double[n];
        System.arraycopy(preco, 0, this.auxp, 0, preco.length);
        AreadeVendas.preco = new double[n];       
       
        System.arraycopy(auxp, 0, preco, 0, auxp.length);
        
        preco[n - 1] = v;
        
    }
    
    // Implementa o método de Limpar modelos de Lista padrão 
    public void cleanDefaultLists(){
        for(String s : single){

            listCar.removeElement(s);

        }

        for(String s : singlep){

            dfpreço.removeElement(s);

        }

         for(String s : J){

            qtd.removeElement(s);

        }
    }

}
