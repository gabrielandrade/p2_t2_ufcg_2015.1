package lab03;

import java.text.DecimalFormat;

public class Produto {

	private String nome;
	private String tipo;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, String tipo, double preco, int quantidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void dinimuiQuantidade(int quantidadeExtra){
		setQuantidade(this.quantidade - quantidadeExtra);
	}
		
	public String toString() {
		DecimalFormat df = new DecimalFormat("#0.00");
		String produto = "";
		produto += this.nome+" ";
		produto += "("+this.tipo+"). ";
		produto += "R$ "+df.format(this.preco);
		produto += " Restante: "+this.getQuantidade();
		return produto;
	}
	
	/*
	public boolean equals(Object outroObjeto){
		if(outroObjeto instanceof Produto){
			Produto outroProduto = (Produto)outroObjeto;
			return outroProduto.getNome().equalsIgnoreCase(this.nome);
			
		}else{
			return false;
		}
	}*/

	public boolean temDisponivel(int quantidade) {
		return (quantidade <= this.getQuantidade());
	}
	
	public double lucroMaximo(){
		return this.getPreco() * this.getQuantidade();
	}
}
