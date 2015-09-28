package aula_0612;

import java.util.ArrayList;
import java.util.List;

public class MainUI {

	public static void main(String[] args) {
		
		Locadora locadora = new Locadora();
		
		DVD vingadores = new DVD("Os Vingadores", 5.00);
		DVD chihiro = new DVD("A viagem de Chihiro", 3.00);
		DVD batman = new DVD("Batman: The Dark Knight", 4.00);
		DVD cassiaEller = new DVDLancamento("Doc. Cassia Eller", 10.0);
		Carro celta = new Carro("Celta",50.0);
		Carro hb20 = new Carro("HB20", 150.0);
		
		System.out.println(celta.compareTo(hb20));
		if(celta.compareTo(hb20) == -1){// carro < hb20
			System.out.println("Carro é mais barato.");
		}
		
		List<Alugavel> produtos = new ArrayList<Alugavel>();
		
		produtos.add(vingadores);
		produtos.add(chihiro);
		produtos.add(batman);
		produtos.add(cassiaEller);
		produtos.add(celta);
		
		System.out.println(locadora.informaAluguel(5, produtos));
	}
	
}
