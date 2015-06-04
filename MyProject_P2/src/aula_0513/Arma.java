package aula_0513;

public class Arma extends Item {
	
	private int preco;
	
	public Arma(String nome, double peso, int efeito, int preco){
		super(nome, peso, efeito);
		this.preco = preco;
	}

	
	public int usa(){
		return -1 * super.getEfeito();
	}
	
	
	
	
	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	
}
