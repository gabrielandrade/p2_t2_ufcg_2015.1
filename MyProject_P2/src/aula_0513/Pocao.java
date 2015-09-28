package aula_0513;

public class Pocao extends Item {

	public Pocao(String nome, double peso, int efeito){
		super(nome, peso, efeito);
	}
	
	public int usa(){
		return 2 * super.getEfeito();
	}
	
}
