package aula_0605.composicao;

public class FinanciamentoCaloteiro extends Financiamento {

	public static final double FINANCIAVEL_CAL = 300.0;
	
	public FinanciamentoCaloteiro(){
		super();
	}
	
	public double financiamento(boolean isEstudante, double renda){
		return super.financiamento(isEstudante, renda) - FINANCIAVEL_CAL;
	}
	
}
