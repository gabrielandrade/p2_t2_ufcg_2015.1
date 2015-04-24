package aula_0410;
import java.util.Scanner;

public class Cadastro {
	
	public static final int LE_NOME = 1;
	public static final int LE_DATA = 2;
	
	public static void imprimeMenu(){
		
		System.out.print("Digite o comando que deseja: ");
		System.out.println("Digite o comando que deseja realizar: ");
		System.out.println("1 - Definir nome.");
		System.out.println("2 - Definir idade.");
		System.out.println("3 - Imprimir pessoa.");
		System.out.println("4 - Sair.");
		System.out.println();
		System.out.print("Comando: ");
		
		
		/* Este menu pede a forma de pagamento.
		 * Comentarios sao importantes mesmo que o codigo pareca obvio
		 * a principio.
		System.out.println("Hur vill du betalla: ");
		System.out.println("1 - Med ett kort.");
		System.out.println("2 - Med kontanter.");
		System.out.println("3 - Skriv ut kvitto.");
		System.out.println();
		System.out.print("Comando: ");
		*/
	}
	
	public static String lerNome(Scanner scanner){
		System.out.print("Digite o nome da pessoa: ");
		String outroNome = scanner.nextLine();
		return outroNome;
	}
	
	public static int lerData(Scanner scanner){
		System.out.print("Digite a idade da pessoa: ");			
		int nascimentoPessoa = scanner.nextInt();
		return nascimentoPessoa;
	}	
	
	public static void main(String[] args){
		String nomePessoa = "";
		int nascimentoPessoa = 0;
		
		Scanner ler = new Scanner(System.in);
		
		int escolha = 0;
		do{			
			imprimeMenu();
			
			escolha = ler.nextInt();
			ler.nextLine();
			
			switch (escolha) {
			case LE_NOME:
				nomePessoa = lerNome(ler);							
				break;
			
			case LE_DATA:
				nascimentoPessoa = lerData(ler);
				break;
				
			case 3:
				System.out.println(nomePessoa+" nasceu em "+nascimentoPessoa);
				break;
				
			case 4:
				//Vai fechar o laco.
				System.out.println("Fim do programa.");
				break;
				
			default:
				System.out.println("Opcao invalida.");
				break;
			}
			
			System.out.println(nomePessoa);
			
			
		}while(escolha != 4);
		
		ler.close();		
	}
	
}
