
package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {
	
    //Read
    public static String Read(String caminho) {
            String conteudo = "";

            try {
                    FileReader arq = new FileReader(caminho);
                    BufferedReader leitorArq = new BufferedReader(arq);

                    String linha = "";
                    try {
                            linha = leitorArq.readLine();
                            while(linha != null) {
                                    conteudo += linha;
                                    linha = leitorArq.readLine();
                            }

                            arq.close();

                            return conteudo;
                    } catch(Exception e) {
                            e.printStackTrace();

                    }
            } catch(Exception e) {
                    e.printStackTrace();
            }
            return "";
    }

    //Write
    public static boolean Write(String caminho, String nomes) {

            try {
                    FileWriter arq = new FileWriter(caminho);
                    PrintWriter gravarArq = new PrintWriter(arq);

                    gravarArq.println(nomes);
                    gravarArq.close();
                    return true;
            } catch(Exception e) {
                    e.printStackTrace();
                    return false;
            }

    }
	
}
