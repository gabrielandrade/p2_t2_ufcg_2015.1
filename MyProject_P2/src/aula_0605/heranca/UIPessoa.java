package aula_0605.heranca;

import java.util.ArrayList;

public class UIPessoa {


	
	public static void main(String[] args) {
		Cliente neto = new ClienteFiel("Neto", "neto@email.com", 4000, false);
		Cliente raquel = new ClienteFiel("Raquel","raquel@email.com", 2200,true);
		
		Cliente tainah = new ClienteCaloteiro("Tainah", "tainah@email.com", 500, true);
		Cliente adson = new ClienteCaloteiro("Adson", "adson@email.com", 1000, false);		
		
		System.out.println(neto);
		System.out.println(raquel);
		System.out.println(adson);	
		System.out.println(tainah);
		
		//Design seboso para usar Heranca.
		tainah = new ClienteFiel(tainah.getNome(), tainah.getEmail(), tainah.getRenda(), tainah.isEstudante());

		System.out.println();
		System.out.println(tainah);
		
	}
}
