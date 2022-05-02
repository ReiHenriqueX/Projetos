
package Classes;

    
import java.util.Scanner;

public class Rascunho {
	
/*
	public static void main(String[] args) {
            
		Scanner in = new Scanner(System.in);
		//Atributos
		//Arrays
		double preco[] = new double[6], quant[] = new double[6], valorTotalCP[] = new double[6];
		String nomes[] = new String[6];
		//Nomes dos Produtos
		nomes[0] = "Balas";
		nomes[1] = "Chicletes";
		nomes[2] = "Chocolates";
		nomes[3] = "Suco de laranja";
		nomes[4] = "Suco de uva";
		nomes[5] = "Sanduíche";
		//Leitura
		int resp = - 1;
		int code = - 1;
		int codeIndex = - 1;
		//Espaços
		String space = "";
		while(true) {
			System.out.println("MENU: ");
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Vender Produto");
			System.out.println(" 2 - Quantidade vendida no dia por produto em REAIS");
			System.out.println(" 3 - Quantidade vendida no dia por produto em UNIDADES");
			System.out.print("> ");
			code = in.nextInt();
			if(code == 0) {
				//Sair
				break;
			} else if(code == 1) {
				//Vender Produto
				//Setar os valores dos produtos
				preco[0] = 0.20;  
				preco[1] = 0.30;  
				preco[2] = 2.00;  
				preco[3] = 5.00;  
				preco[4] = 6.00;  
				preco[5] = 10.00; 
				System.out.println();
				while(resp != 0) {
					System.out.println("Índice       Produto       Preço (R$)");
					for(int i = 0; i < 6; i++) {
						if(i != 3) {
							System.out.println("   " + i + "           " + nomes[i] + "      " + preco[i]);
						} else {
							System.out.println("   " + i + "         " + nomes[i] + "     " + preco[i]);
						}
					}
					System.out.println("Qual o índice do produto que você deseja comprar? ");
					System.out.print("> ");
					codeIndex = in.nextInt();
					if(codeIndex > 5) {
						System.out.println("Não existe produto com índice " + codeIndex);
						break;
					}
					System.out.println();
					for(int i = 0; i < preco.length; i++) {
						if(i == codeIndex) {
							System.out.println("Qual a quantidade de " + nomes[i] + " que você deseja comprar? ");
							System.out.print("> ");
							quant[i] += in.nextDouble();
							System.out.println();
							valorTotalCP[i] = quant[i] * preco[i];
							System.out.println();
							System.out.printf("O valor total a ser cobrado por %.0f %s é de R$: %.2f", quant[i], nomes[i], valorTotalCP[i]);
							System.out.println();
							System.out.println("O sr. deseja comprar mais algum produto? 1 - SIM e 0 - NÂO: ");
							System.out.print("> ");
							resp = in.nextInt();
							System.out.println();
							while(true) {
								if(resp != 1 && resp != 0) {
									System.out.println("Por favor! Digite apenas 1 ou 0: ");
									resp = in.nextInt();
								} else {
									break;
								}
							}
						}
					}
				}
			} else if(code == 2) {
				//Quantidade em REAIS
				for(int i = 0; i < preco.length; i++) {
					System.out.printf("%s R$: %.2f", nomes[i], valorTotalCP[i]);
					System.out.println();
				}
			} else if(code == 3) {
				//Quantidade em UNIDADES
				for(int i = 0; i < preco.length; i++) {
					System.out.printf("%s quantidade: %.0f", nomes[i], quant[i]);
					System.out.println();
				}
			} else {
				System.out.println("Não existe código " + code + ".");
				break;
			}
		}
		
		//Fim do Programa
		System.out.println("Obrigado por usar o nosso sitema!");
	

	}
	*/

	
}

