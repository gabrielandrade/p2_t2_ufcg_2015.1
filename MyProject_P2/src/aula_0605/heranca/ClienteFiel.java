package aula_0605.heranca;

public class ClienteFiel extends Cliente {

	private static final double FINANCIAMENTO = 500.0;
	
	public ClienteFiel(String nome, String email, double renda, boolean isEstudante) {
		super(nome, email, renda, isEstudante);
	}
	
	public double financiamentoMaximo(){
		// Se o cliente for estudante metade da renda. 
		// Se o cliente for fiel, + 500 reais. 
		return super.financiamentoMaximo() + FINANCIAMENTO;
	}
		
	public String toString() {
		return "Cliente Fiel: "+super.toString();
	}
}
