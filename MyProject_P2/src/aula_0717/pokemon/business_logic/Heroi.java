package aula_0717.pokemon.business_logic;

public class Heroi {

	//Mude bastante essa classe, e depois mude as implementacoes dos poderes.
	// Veja que nao ha consequencias graves devido as modificacoes.
	private String nome;
	private Poder habilidade;
	
	public Heroi(String nome) {
		this.nome = nome;
		//Gelo foi escolhido como default. Como mudar
		// para tratar o caso em que nao ha pokemon/poder 
		// na jogada. 
		this.habilidade = new PoderGelo();
	}
	
	public String getNome(){
		return nome;
	}
	
	public String usaPoder(){		
		return habilidade.usaPoder();
	}

	public String getPokemon() {		
		return habilidade.getPokemon();
	}

	public void aprendeEletrico() {
		habilidade = new PoderEletrico();
	}
	public void aprendeFogo() {
		habilidade = new PoderFogo();
	}
	
	public void aprendeGelo() {
		habilidade = new PoderGelo();
	}

}
