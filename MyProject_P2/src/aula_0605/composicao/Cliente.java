package aula_0605.composicao;

public class Cliente {

	private Pessoa pessoa;
	private boolean isEstudante;
	private double renda;
	
	public Cliente(String nome, String email, double renda, boolean isEstudante){
		this.renda = renda;
		this.isEstudante = isEstudante;
		this.pessoa = new Pessoa(nome, email);
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
		String clienteStr = "";
		
		return this.getNome()+" "+this.getRenda()+" estudante: "+this.isEstudante();
	}
}
