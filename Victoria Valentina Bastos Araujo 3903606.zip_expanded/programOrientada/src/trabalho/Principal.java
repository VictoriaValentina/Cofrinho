package trabalho;


// VICTÓRIA VALENTINA BASTOS ARAÚJO 3903606

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	 
		Scanner dinheiro = new Scanner(System.in);
		int escolha;
		
		Cofrinho cofre = new Cofrinho();
		
		System.out.println("COFRINHO"); //MENU PRINCIPAL
		System.out.println("1 - Adicionar moeda");	
		System.out.println("2 - Remover moeda");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Total convertido");
		System.out.println("0 - Encerrar");
		escolha = dinheiro.nextInt(); //ESCOLHA A OPÇÃO
		
		int tipoMoeda;
		double valor;
		Moeda moedas;
		
		//LOOP 
		while(escolha != 0) {
			
			switch(escolha) {
			
			case 1: //CASO ENTRE NA OPÇÃO 1 - ADICIONAR MOEDA
				tipoMoeda = 0;
				while(tipoMoeda>3 || tipoMoeda<=0) { //OPÇÕES PARA ADICIONAR MOEDAS
				System.out.println("Selecione o tipo da moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Euro");
				System.out.println("3 - Dolar");
				tipoMoeda = dinheiro.nextInt();
				
				}
				//ADICIONARÁ O VALOR EM UMA DAS OPÇÕES DO MENU ANTERIOR
				moedas = null;
				if(tipoMoeda == 1) {
					System.out.println("Qual é o valor da moeda: ");
					valor = dinheiro.nextDouble();
					moedas = new Real(valor);
				
				}
					
				if(tipoMoeda == 2) {
					System.out.println("Qual é o valor da moeda: ");
					valor = dinheiro.nextDouble();
					moedas = new Euro(valor);	
				
				}
				
				if(tipoMoeda == 3) {
					System.out.println("Qual é o valor da moeda: ");
					valor = dinheiro.nextDouble();
					moedas = new Dolar(valor);
				
				}	
					
					cofre.adicionar(moedas); //ADICIONARÁ O VALOR NA LISTA QUE SE ENCONTRA NO COFRINHO
				
				break;
				
			case 2: //CASO ENTRE NA OPÇÃO 2 - REMOVER MOEDA
				tipoMoeda = 0;
				while(tipoMoeda>3 || tipoMoeda<=0) {
				System.out.println("Selecione o tipo da moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Euro");
				System.out.println("3 - Dolar");
				tipoMoeda = dinheiro.nextInt();
				
				}
				
				moedas = null;
				if(tipoMoeda == 1) {
					System.out.println("Qual é o valor da moeda: ");
					valor = dinheiro.nextDouble();
					moedas = new Real(valor);
				
				}
					
				if(tipoMoeda == 2) {
					System.out.println("Qual é o valor da moeda: ");
					valor = dinheiro.nextDouble();
					moedas = new Euro(valor);	
				
				}
				
				if(tipoMoeda == 3) {
					System.out.println("Qual é o valor da moeda: ");
					valor = dinheiro.nextDouble();
					moedas = new Dolar(valor);
					
				}
				
					cofre.remover(moedas); //REMOVERÁ ESPECIFICAMENTE O VALOR DA MOEDA ADICIONADO ANTERIORMENTE
				
				break;
				
			case 3: //CASO ENTRAR NA OPÇÃO 3 - LISTAR MOEDAS
				cofre.listas(); //LISTARÁ AS MOEDAS ADICIONADAS
				break;
			
			case 4: //CASO ENTRAR NA OPÇÃO 4 - TOTAL CONVERTIDO
				double total = cofre.totalConvertido();
				System.out.println("O valor total convertido em Real é: R$" + total);
				break; 
				
			default: //AO DIGITAR UM VALOR DIFERENTE DO MENU
				System.out.println("Opção inválida, escolha uma destas opções: ");
				
			}
			
			System.out.println("COFRINHO");
			System.out.println("1 - Adicionar moeda");	
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Total convertido");
			System.out.println("0 - Encerrar");
			escolha = dinheiro.nextInt();
		}
		
	}

}