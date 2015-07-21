package aula_0717.pokemon;

import aula_0717.pokemon.business_logic.Heroi;

public class Facade {

	//Note que o Heroi encapsula o poder por composicao.
	// A facade nao conhece a interface Poder, nem
	// suas implementacoes.
	private Heroi mestrePokemon;
	private int poderAtual;
	
	public Facade(){
		mestrePokemon = new Heroi("Red.");
		poderAtual = 0;
	}
	
	private void trocaPoderHeroi(String tipoPoder){
		//Note que a ideia eh trocar o ataque e junto, o pokemon.
		// No jogo real o Strategy eh mais complexo, possibilitando
		// a troca do pokemon E do ataque.
		// Como separar comportamento de estado para definir os ataques
		// que sao "super effective"?
		if(tipoPoder.equals("Gelo")){
			mestrePokemon.aprendeGelo();
			
		}else if(tipoPoder.equals("Fogo")){
			mestrePokemon.aprendeFogo();
			
		}else if(tipoPoder.equals("Arcano")){
			mestrePokemon.aprendeEletrico();
		
		}else{
			//Ha um risco nesse codigo. Qual e como tratar com Exception? 
		}
	}
	
	public String usaPoder(){
		return mestrePokemon.usaPoder();
	}

	public String chamaProxPokemon() {
		//Esse metodo tambem pode ser melhorado. Como?
		String[] poderesString = {"Gelo", "Fogo", "Arcano"};
		poderAtual++;
		trocaPoderHeroi(poderesString[poderAtual % poderesString.length]);
		return mestrePokemon.getPokemon();
	}
}
