package aula_0605.composicao;

public class UIPessoa {
	
	public static void main(String[] args) {		
		Cliente neto = new Cliente("Neto", "neto@email.com", 4000, false);
		Cliente raquel = new Cliente("Raquel","raquel@email.com", 2200,true);
		
		Cliente adson = new Cliente("Adson", "adson@email.com", 1000, false);		
		Cliente tainah = new Cliente("Tainah", "tainah@email.com", 500, true);
		
		System.out.println(neto);   
		System.out.println(raquel); 
		System.out.println(adson);	
		System.out.println(tainah);
		System.out.println();
		
		//mudanca dinamica de comportamento no Cliente.
		raquel.viraCaloteiro();		
		System.out.println(raquel);		
		raquel.viraFiel();
		System.out.println(raquel);
	}
}
