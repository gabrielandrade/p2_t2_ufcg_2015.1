package aula_0602;

public class MainArmazem {

	
	
	
	public static void main(String[] args) {
		Cliente neto = new ClienteFiel("Neto",4000,false);
		Cliente raquel = new ClienteFiel("Raquel",2200,true);
		
		Cliente tainah = new ClienteCaloteiro("Tainah", 500, true);
		Cliente adson = new ClienteCaloteiro("Adson", 1000, false);		
		
		System.out.println(neto.getFinanciamentoMax());
		System.out.println(raquel.getFinanciamentoMax());
		System.out.println(tainah.getFinanciamentoMax());
		System.out.println(adson.getFinanciamentoMax());	
	}
}
