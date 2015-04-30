package lab03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Supermercado {

	private Estoque estoque;
	private Scanner entrada;
	
	//Refatore MAIS o código fornecendo uma classe so para leitura/impressao de dados.
	public Supermercado(Scanner entrada){
		estoque = new Estoque();
		this.entrada = entrada;
	}
	
	public void cadastraProduto(){
		String resposta  = "Sim";
		
		do {
			System.out.println("= = = = Cadastro de Produtos = = = =");
			System.out.print("Digite o nome do produto: ");
			String nomeProduto = entrada.nextLine();
			System.out.print("Digite o preco do produto: ");
			double precoProduto = entrada.nextDouble();
			entrada.nextLine(); //pula o enter digitado pelo usuario.
			
			System.out.print("Digite o tipo do produto: ");
			String tipoProduto = entrada.nextLine();
			System.out.print("Digite a quantidade do produto: ");
			int quantidadeProduto = entrada.nextInt();
			entrada.nextLine(); //pula o enter digitado pelo usuario.
			
			boolean adicaoProduto = estoque.adicionaProduto(nomeProduto, tipoProduto, precoProduto, quantidadeProduto);
			
			if(adicaoProduto){
				System.out.println(nomeProduto+" cadastrado com sucesso.");
			}else{
				System.out.println("Não foi possivel cadastrar "+nomeProduto);
			}			

			System.out.print("Deseja cadastrar outro produto? ");
			resposta = entrada.nextLine();
			System.out.println();
		} while (resposta.equalsIgnoreCase("Sim"));
	}
	
	public void vendeProduto(){
		String resposta  = "Sim";
		
		do {
			System.out.println("= = = = Venda de Produtos = = = =");
			System.out.print("Digite o nome do produto: ");			
			String nomeProduto = entrada.nextLine();
			
			String resultadoConsulta = estoque.consultaProduto(nomeProduto);
			if(resultadoConsulta.isEmpty()){ //produto nao cadastrado.
				System.out.println("===> "+nomeProduto+" nao cadastrado no sistema.");
				
			}else{ //produto encontrado.
				System.out.println("===> "+resultadoConsulta);
				System.out.println();

				System.out.print("Digite a quantidade que deseja vender: ");
				int quantidadeVenda = entrada.nextInt();
				entrada.nextLine();
				
				String valorVenda = estoque.vendeProduto(nomeProduto, quantidadeVenda);
				if(valorVenda.isEmpty()){
					System.out.println("Nao e possivel vender pois nao ha "+nomeProduto+" suficiente.");
				}else{
					System.out.println("Total arrecadado: "+valorVenda);
				}
			}

			System.out.print("Deseja vender outro produto? ");
			resposta = entrada.nextLine();
			System.out.println();
		} while (resposta.equalsIgnoreCase("Sim"));
	}
	
	public void imprimeBalanco(){
		System.out.println("= = = = Impressao de Balanco = = = =");
		System.out.println(estoque);
	}
}
