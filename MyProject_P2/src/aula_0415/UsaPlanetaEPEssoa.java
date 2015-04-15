package aula_0415;

public class UsaPlanetaEPEssoa {

	public static void main(String[] args) {
		
		Pessoa volney = new Pessoa("Volney");
		Pessoa virginia = new Pessoa("Virginia");
		Pessoa hiago = new Pessoa("Hiago");
		Pessoa aline = new Pessoa("Aline");
		Pessoa ninguem = new Pessoa();

		ninguem = volney;
		ninguem.nome = "Outra Pessoa";
		
		synchronized (ninguem) {
			System.out.println(volney.nome);  //Volney  | Ninguem
			System.out.println(ninguem.nome); //Volney  | Ninguem
			System.out.println(ninguem.idade);//15      | 0			
		}
		
		//System.out.println(virginia.nome);
		
		volney.fazAtividadeFisiologica();
		virginia.come();

		Planeta planeta = new Planeta();
	}
	
}
