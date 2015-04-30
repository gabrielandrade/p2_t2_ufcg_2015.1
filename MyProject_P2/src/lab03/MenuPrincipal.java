package lab03;

import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

	private static final int CADASTRAR = 1;
	private static final int VENDER = 2;
	private static final int IMPRIMIR = 3;
	private static final int SAIR = 4;

	public void imprimeMenuPrincipal(){
		System.out.println("=== Economiza P2 ===");
		System.out.println("= = = = Bem-vindo(a) ao EconomizaP2 = = = =");
		System.out.println("Digita a opção desejada:");
		System.out.println("1 - Cadastrar um Produto");
		System.out.println("2 - Vender um Produto");
		System.out.println("3 - Imprimir Balanço");
		System.out.println("4 - Sair");
		System.out.println();
				
		
	}
	
	public void iniciaMenu(){
		Scanner entrada = new Scanner(System.in);
		Supermercado supermercado = new Supermercado(entrada);
		
		int opcao = 0;		
		do {
			imprimeMenuPrincipal();
			System.out.print("Opção: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcao) {
			case CADASTRAR:
				supermercado.cadastraProduto();
				break;

			case VENDER:
				supermercado.vendeProduto();
				break;

			case IMPRIMIR:
				supermercado.imprimeBalanco();
				break;
			
			case SAIR:
				System.out.println("Obrigado por ter usado o LojaoEconomizaP2");
				break;
			
			default:
				System.out.println("Opcao Invalida. Tente novamente.");
				break;
			}
		} while (opcao != SAIR);
	}
	
	public static void main(String[] args) {
		
		MenuPrincipal menu = new MenuPrincipal();
		menu.iniciaMenu();
	}
	
}
