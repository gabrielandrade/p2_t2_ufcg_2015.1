package aula_0605.heranca;

public class ClienteCaloteiro extends Cliente {

	private static final double FINANCIAMENTO = 300.0;
	
	public ClienteCaloteiro(String nome, String email, double renda, boolean isEstudante){
		super(nome,email,renda,isEstudante);
	}
	
	@Override
	public double financiamentoMaximo(){
		// Se for estudante, metade da renda.
		// Financiamento - 300 reais.
		return super.financiamentoMaximo() - FINANCIAMENTO;
	}
	
	@Override
	public String toString() {
		return "Cliente Caloteiro: "+super.toString();
	}
}
