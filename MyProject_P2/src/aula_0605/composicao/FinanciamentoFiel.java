package aula_0605.composicao;

public class FinanciamentoFiel extends Financiamento{

	public FinanciamentoFiel(){
		super();
	}
	
	public double financiamento(boolean isEstudante, double renda){		
		return super.financiamento(isEstudante, renda) + 500.0;
	}
	
}
