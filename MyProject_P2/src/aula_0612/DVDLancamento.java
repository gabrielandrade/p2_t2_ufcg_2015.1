package aula_0612;


public class DVDLancamento extends DVD {

	public DVDLancamento(String nome, double preco){
		super(nome,preco);
	}
	
	public double getPrecoDiario() {
		return super.getPrecoDiario() + 5.0;
	}
}
