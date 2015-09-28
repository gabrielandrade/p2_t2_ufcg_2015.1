package aula_0602;

public class ClienteFiel extends Cliente {

	private static final double FINANCIAMENTO = 500.0;
	
	public ClienteFiel(String nome, double renda, boolean isEstudante) {
		super(nome, renda, isEstudante);
	}
	
	public double getFinanciamentoMax(){
		// Se o cliente for estudante metade da renda. 
		// Se o cliente for fiel, + 500 reais. 
		return super.getFinanciamentoMax() + FINANCIAMENTO;
	}
}
