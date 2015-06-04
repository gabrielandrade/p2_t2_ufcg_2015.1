package aula_0513;

public class Item {
	
	protected double peso;
	private String nome;
	private int efeito;

	public Item(String nome, double peso, int efeito) {
		this.peso = peso;
		this.nome = nome;
		this.efeito = efeito;
	}
	
	public String toString() {
		return this.nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEfeito() {
		return efeito;
	}

	public void setEfeito(int efeito) {
		this.efeito = efeito;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}
	
	public int usa(){
		return efeito;
	}
	
	
	
	
	
	
	
}
