package aula_0605.composicao;

public class Financiamento {

	public Financiamento(){
		
	}
	
	public double financiamento(boolean isEstudante, double rendaFinanciavel){
		if(isEstudante){
			rendaFinanciavel = rendaFinanciavel / 2.0;
		}
		return rendaFinanciavel;
	}
	
	public double financiamento(Cliente cliente){
		double rendaFinanciavel = 0.0;
		if(cliente.isEstudante()){
			rendaFinanciavel = cliente.getRenda() / 2.0;
		}
		
		return rendaFinanciavel;
	}
	
}
