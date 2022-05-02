
package core;

import static Telas.AreadeVendas.nomes;
import static Telas.AreadeVendas.preco;
public class BancoDeDados {
    public static String arqNomes = "C:/src/Nomes.txt";
    public static String arqNuns = "C:/src/Nuns.txt";
    private static String itens = Arquivo.Read(arqNomes);
    public static int tam = itens.split(";").length;
    
    public static void main(String[] args) {
        

        
    }
    public static void cadastrarBancoDeDados() {
        cadastrarNomes();
        cadastrarNuns();
    }
    
    public static void iniciaBancoDeDados() {
        retornaNomes();
        retornaNuns();
    }
      public static void cadastrarNomes() {
        String arquivo = Arquivo.Read(arqNomes);
        //if(arquivo.isEmpty()) {	
                String[] denomes = new String[nomes.length];
                String print = "";
                if(denomes.length <= 6) {
                        print = "";
                } else {
                        for(int i = 0; i < 6; i++) {
                                print += nomes[i] + ";";
                        }
                }
                String print2 = "";
                if(denomes.length <= 6) {
                        denomes[0] = "Balas;";
                        denomes[1] = "Chicletes;";
                        denomes[2] = "Chocolates;";
                        denomes[3] = "Suco de laranja;";
                        denomes[4] = "Suco de uva;";
                        denomes[5] = "Sanduíche;";

                        for(int i = 0; i < denomes.length; i++) {
                                print += denomes[i];
                        }

                } else {
                        if(denomes.length > 6) {
                                int index = 0;
                                for(index = 6; index < denomes.length; index++) {
                                        denomes[index] = nomes[index] + ";";
                                }
                                for(index = 6; index < denomes.length; index++) {
                                        print2 += denomes[index];
                                }
                        }
                }
                Arquivo.Write(arqNomes, print + print2);
                if(denomes.length > 0) {
                        System.out.println("Arquivo de Nomes salvo com sucesso!");
                        
                }
        //} else {
                //System.out.println("O arquivo de nomes já existe!");
        //}
    }
    
      public static void cadastrarNuns() {
            String arquivo = Arquivo.Read(arqNuns);
            double[] depreco = new double[preco.length];
            String print = "";
            if(depreco.length <= 6) {
                    print = "";
            } else {
                    for(int i = 0; i < 6; i++) {
                            print += preco[i] + ";";
                    }
            }
            String print2 = "";
            if(depreco.length <= 6) {
                    depreco[0] = 0.20;  
                    depreco[1] = 0.30;  
                    depreco[2] = 2.00;  
                    depreco[3] = 5.00;  
                    depreco[4] = 6.00;  
                    depreco[5] = 10.00; 

                    for(int i = 0; i < depreco.length; i++) {
                            print += depreco[i] + ";";
                    }
            } else {
                    if(depreco.length > 6) {
                            int index = 0;
                            
                            for(index = 6; index < depreco.length; index++) {
                                    depreco[index] = preco[index];
                            }

                            for(index = 6; index < depreco.length; index++) {
                                    print2 += depreco[index] + ";"; 
                            }
                    }
            }

            Arquivo.Write(arqNuns, print + print2);
            if(depreco.length > 0) {
                    System.out.println("Arquivo de números salvo com sucesso!");
                    
            } else {
                    System.out.println("Falha ao tentar salvar os dados!");
            }
    }
      
      
      public static void gravarNomes() {
        String arquivo = Arquivo.Read(arqNomes);
        //if(arquivo.isEmpty()) {	
                String[] denomes = new String[nomes.length];
                String print = "";
                if(denomes.length <= 6) {
                        print = "";
                } else {
                        for(int i = 0; i < 6; i++) {
                                print += arquivo.split(";")[i] + ";";
                        }
                }
                String print2 = "";
                if(denomes.length <= 6) {
                        denomes[0] = "Balas;";
                        denomes[1] = "Chicletes;";
                        denomes[2] = "Chocolates;";
                        denomes[3] = "Suco de laranja;";
                        denomes[4] = "Suco de uva;";
                        denomes[5] = "Sanduíche;";

                        for(int i = 0; i < denomes.length; i++) {
                                print += denomes[i];
                        }

                } else {
                        if(arquivo.split(";").length > 6) {
                                int index = 0;
                                for(index = 6; index < denomes.length; index++) {
                                        denomes[index] = arquivo.split(";")[index] + ";";
                                }
                                for(index = 6; index < denomes.length; index++) {
                                        print2 += denomes[index];
                                }
                        }
                }
                Arquivo.Write(arqNomes, print + print2);
                if(denomes.length > 0) {
                        System.out.println("Arquivo salvo com sucesso!");
                        
                }
        //} else {
                //System.out.println("O arquivo de nomes já existe!");
        //}
    }
     
     
    public static void gravarNuns() {
            String arquivo = Arquivo.Read(arqNuns);
            double[] depreco = new double[preco.length];
            String print = "";
            if(depreco.length <= 6) {
                    print = "";
            } else {
                    for(int i = 0; i < 6; i++) {
                            print += arquivo.split(";")[i] + ";";
                    }
            }
            String print2 = "";
            if(depreco.length <= 6) {
                    depreco[0] = 0.20;  
                    depreco[1] = 0.30;  
                    depreco[2] = 2.00;  
                    depreco[3] = 5.00;  
                    depreco[4] = 6.00;  
                    depreco[5] = 10.00; 

                    for(int i = 0; i < depreco.length; i++) {
                            print += depreco[i] + ";";
                    }
            } else {
                    if(arquivo.split(";").length > 6) {
                            int index = 0;
                           
                            for(index = 6; index < depreco.length; index++) {
                                    depreco[index] = Double.parseDouble(arquivo.split(";")[index].replace(";", ""));
                            }

                            for(index = 6; index < depreco.length; index++) {
                                    print2 += depreco[index] + ";"; 
                            }
                    }
            }

            Arquivo.Write(arqNuns, print + print2);
            if(depreco.length > 0) {
                    System.out.println("Arquivo de números salvo com sucesso!");
                    
            } else {
                    System.out.println("Falha ao tentar salvar os dados!");
            }
    }

    public static void retornaNomes() {
            String conteudo = Arquivo.Read(arqNomes);
            for(int i = 0; i < nomes.length; i++) {
                    nomes[i] = conteudo.split(";")[i].replace(";", ""); 
            }

    }

    public static void retornaNuns() {
            String conteudo = Arquivo.Read(arqNuns);
            for(int i = 0; i < preco.length; i++) {
                    preco[i] = Double.parseDouble(conteudo.split(";")[i].replace(";", ""));
            }
    }
}
