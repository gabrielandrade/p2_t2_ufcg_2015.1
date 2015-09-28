package aula_0605.composicao.delegation;

public class Pessoa {

	private String nome;
	private String email;
	private Estado estadoPessoa;
	
	public void ficaPreguicoso(){
		estadoPessoa = new Preguica();
	}
	
	public void ficaAlerta(){
		estadoPessoa = new Alerta();
	}
	
	public void comoVcEsta(){
		String estado = estadoPessoa.verificaEstado(this);
		
		System.out.println(estado);
	}
	
	/**
	 * Esta classe é o Construtor de uma Pessoa.
	 * @param nome O nome da pessoa
	 * @param email  
	 */
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	//GETTERS AND SETTERS	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
