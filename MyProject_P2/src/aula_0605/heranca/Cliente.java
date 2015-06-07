package aula_0605.heranca;

public class Cliente extends Pessoa {

	private boolean isEstudante;
	private double renda;
	
	public Cliente(String nome, String email, double renda,boolean isEstudante){
		super(nome, email);
		this.isEstudante = isEstudante;
		this.renda = renda;
	}

	public double calculaValorParcela(double valorCompra, int numParcelas){
		double parcelaBruta = valorCompra / numParcelas;
		return parcelaBruta;
	}
	
	public double financiamentoMaximo(){
		double financiamento = renda;
		if(isEstudante()){
			financiamento = financiamento / 2.0;
		}
		return financiamento;
	}
	
	public boolean isEstudante() {
		return isEstudante;
	}

	public void setEstudante(boolean isEstudante) {
		this.isEstudante = isEstudante;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	@Override
	public String toString() {		
		return getNome()+" pode financiar "+financiamentoMaximo();
	}

}
