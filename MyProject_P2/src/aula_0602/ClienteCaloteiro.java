package aula_0602;

public class ClienteCaloteiro extends Cliente {

	private static final double FINANCIAMENTO = 300.0;
	
	public ClienteCaloteiro(String nome, double renda, boolean isEstudante){
		super(nome,renda,isEstudante);
	}
	
	@Override
	public double getFinanciamentoMax(){
		// Se for estudante, metade da renda.
		// Financiamento - 300 reais.
		return super.getFinanciamentoMax() - FINANCIAMENTO;
	}
}
