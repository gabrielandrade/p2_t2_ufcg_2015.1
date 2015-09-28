package aula_0717.pokemon.business_logic;

public class PoderEletrico implements Poder{

	public String usaPoder() {
		return "Raio do Trovão!";
	}
	
	public String getPokemon(){
		return "resources/eletrico.png";
	}
}
