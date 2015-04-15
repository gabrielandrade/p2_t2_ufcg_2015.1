package aula_0415;

public class Pessoa {

	String cabeca;
	String nome;
	int idade;
	String cpf;

	public Pessoa(){
		this.nome = "Ninguem ";
		this.cabeca = "";
		this.cpf = "";
		this.idade = 0;
	}
	
	public Pessoa(String nome){
		this.nome = nome;
		cabeca = "Grande";
		idade = 15;
		cpf = "000.000.000-01";
	}
	
	public void fazAtividadeFisiologica(){
		System.out.println("Depois conversamos mais.");
	}
	
	public void come(){
		System.out.println("Huuuuum.");
	}
}
