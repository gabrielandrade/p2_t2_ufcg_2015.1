package aula_0605.composicao.delegation;

public class MainEstado {

	
	public static void main(String[] args) {
		Pessoa hiago = new Pessoa("Hiago", "hiago@email.com");
		hiago.ficaPreguicoso();
		hiago.comoVcEsta();
		
		hiago.ficaAlerta();
		hiago.comoVcEsta();		
	}
}
