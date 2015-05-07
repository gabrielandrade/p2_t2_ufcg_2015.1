package lista1;

public class Habilidade {

	private String nomeHabilidade;
	private int dano;
	private int custoMana;
	
	public Habilidade(String nomeHabilidade, int dano, int custoMana){
		this.nomeHabilidade = nomeHabilidade;
		this.dano = dano;
		this.custoMana = custoMana;
	}
	
	public void usaHabilidade(){
		System.out.println("Gastou "+custoMana+" de Energia. "+nomeHabilidade+" causa "+dano+" de dano.");
	}
		
	// GETTERS AND SETTERS
	public String getNomeHabilidade() {
		return nomeHabilidade;
	}

	public void setNomeHabilidade(String nomeHabilidade) {
		this.nomeHabilidade = nomeHabilidade;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getCustoMana() {
		return custoMana;
	}

	public void setCustoMana(int custoMana) {
		this.custoMana = custoMana;
	}

	
	
}
