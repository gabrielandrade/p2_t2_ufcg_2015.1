package aula_0605.composicao.delegation;

public class Preguica extends Estado {

	public Preguica(){
		super();
	}
	
	public String verificaEstado(Pessoa pessoa){
		//aqui eu poderia fazer mais coisas com pessoa.
		//e.g. se pessoa tivesse nivelProdutividade, eu poderia
		// reduzir esse nivel no Estado Preguiça
		return pessoa.getNome()+" está com preguiça. Vai usar Herança.";
	}	
}
