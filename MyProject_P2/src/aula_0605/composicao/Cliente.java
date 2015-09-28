package aula_0605.composicao;

public class Cliente {

	//objeto composto 1	
	private Pessoa pessoa;
	private boolean isEstudante;
	private double renda;
	//objeto composto 2
	private Financiamento objetoFinanciamento;
	
	public Cliente(String nome, String email, double renda, boolean isEstudante){
		this.renda = renda;
		this.isEstudante = isEstudante;
		this.pessoa = new Pessoa(nome, email);
		
		objetoFinanciamento = new Financiamento();
	}
	
	
	public double financiamento(){
		//delegation
		//evitar, pode causar problemas nas chamadas.
		//return objetoFinanciamento.financiamento(this);
		
		//forwarding:
		return objetoFinanciamento.financiamento(this.isEstudante(), this.getRenda());
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
	
	public void setFinanciamento(Financiamento financiamento){
		this.objetoFinanciamento = financiamento;
	}
	
	public String toString() {	
		return this.getNome()+" pode financiar "+this.financiamento();

	}
	
	public void viraCaloteiro(){		
		this.objetoFinanciamento = new FinanciamentoCaloteiro();		
	}
	
	public void viraFiel(){
		this.objetoFinanciamento = new FinanciamentoFiel();
	}
	

	public String getNome() {
		return pessoa.getNome();
	}
	
	public void setNome(String nome){
		pessoa.setNome(nome);
	}

	public String getEmail() {
		return pessoa.getEmail();
	}
	
	public void setEmail(String email) {
		pessoa.setEmail(email);
	}
}
