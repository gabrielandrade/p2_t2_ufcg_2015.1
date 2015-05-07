package revisao_0506;

public class Pessoa {
	
	//corpo da classe
	
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {	
		this.nome = nome;
		this.idade = idade;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public  void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
		
	}

	public String fala(){
		return "Meu nome é: "+getNome()+" e tenho "+getIdade()+" anos de idade.";
	}
		/*
	public boolean equals(Object objeto){
		if(objeto instanceof Pessoa){
			
			Pessoa pessoa = (Pessoa)objeto;		
			if(pessoa.getNome().equals(this.getNome()) && pessoa.getIdade() == this.getIdade()){
				return true;
			
			}else{
				
				return false;
			}			
		}
		return false;
	}	*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	}
