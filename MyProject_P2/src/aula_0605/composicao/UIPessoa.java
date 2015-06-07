package aula_0605.composicao;

import aula_0605.heranca.Cliente;
import aula_0605.heranca.ClienteCaloteiro;
import aula_0605.heranca.ClienteFiel;

public class UIPessoa {
	
	public static void main(String[] args) {
		
		Cliente manoel = new Cliente("Manoel","manoel@gmail.com",1500,true);
		
		Cliente neto = new Cliente("Neto", "neto@email.com", 4000, false);
		Cliente raquel = new Cliente("Raquel","raquel@email.com", 2200,true);
		
		Cliente tainah = new Cliente("Tainah", "tainah@email.com", 500, true);
		Cliente adson = new Cliente("Adson", "adson@email.com", 1000, false);		
		
		System.out.println(manoel);
		System.out.println(neto);
		System.out.println(raquel);
		System.out.println(adson);	
		System.out.println(tainah);
				
		//Proxima Aula:
		//Como mudar dinamicamente o comportamento usando Composicao?

	}
}
