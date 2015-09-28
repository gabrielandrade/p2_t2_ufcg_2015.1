package aula_0417;

import java.util.Scanner;

public class Supermercado {

	
	static Produto[] produtos;
	
	// vende
	// cadastra
	// repooe estoque
	// possui produtos
	
	public void vende(){
		
	}
	
	public static void cadastra(){
		Scanner entrada = new Scanner(System.in);
		int qtd = 2;
		
		
		produtos = new Produto[qtd];		
		for (int i = 0; i < qtd; i++) {
			String nomeProduto = entrada.nextLine();
			double precoProduto = entrada.nextDouble();
			entrada.nextLine();
			String tipo = entrada.nextLine();
			
			System.out.println(nomeProduto+" "+precoProduto+" "+tipo);
			
			Produto produto = new Produto(nomeProduto, precoProduto, tipo);
			
			produtos[i] = produto;
			
			//produtos[i].nome = "novo nome";
		}
		
		
		
		System.out.println("Imprime produtos:");
		for (int i = 0; i < produtos.length; i++) {
			
			Produto umaReferencia = produtos[i];
			
			//System.out.println(umaReferencia.nome+" "+umaReferencia.preco);
			System.out.println( umaReferencia );
		}

		
		
		
		
	}
	
	public void repoeEstoque(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("Bem vindo ao Economiza P2");
		cadastra();
	}
	
}
