package aula_0417;

public class GovernoFederal {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
				
		Pessoa italo = new Pessoa("Italo", "Masculino");
		Pessoa ellen = new Pessoa("Ellen", "Feminino");
		Pessoa volney = new Pessoa("Volney", "Masculino");
		
		
		pessoas[0] = italo;
		pessoas[1] = ellen;
		pessoas[2] = volney;
		
	}
	
}
