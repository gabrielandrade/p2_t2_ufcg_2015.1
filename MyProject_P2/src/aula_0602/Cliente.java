package aula_0602;

public abstract class Cliente {

	private String nome;
	private double renda;
	private boolean isEstudante;
	
	public Cliente(String nome, double renda, boolean isEstudante) {
		this.nome = nome;
		this.renda = renda;
		this.isEstudante = isEstudante;
	}

	//Exercicio: implemente uma parcela com juros de 10% para o cliente caloteiro.
	public double calculaParcela(double precoVenda, int numparcelas){
		double parcela = precoVenda / numparcelas;
		return parcela;		
	}
	
	public double getFinanciamentoMax(){
		double financiamento = getRenda();
		if(isEstudante()){
			financiamento = financiamento / 2.0;
		}
		return financiamento;
	}
	
	//GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public boolean isEstudante() {
		return isEstudante;
	}

	public void setEstudante(boolean isEstudante) {
		this.isEstudante = isEstudante;
	}
}
