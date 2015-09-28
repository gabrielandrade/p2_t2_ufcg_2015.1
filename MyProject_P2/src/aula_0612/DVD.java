package aula_0612;

public class DVD implements Alugavel {

	private String titulo;
	private double precoDiario;
	
	public DVD(String titulo, double precoDiario){
		this.titulo = titulo;
		this.precoDiario = precoDiario;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPrecoDiario() {
		return precoDiario;
	}
	
	public double calculaAluguel(int numDias){
		return numDias * this.getPrecoDiario();
	}
	
}
