package aula_0417;

public class Produto {

	final int CODIGO_BARRA = 445;
	
	//variaveis	
	private String nome;
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	private double preco;
	private String tipo;
	private int quantidade;
	
	// metodos
	public Produto(String nome, double preco, String tipo){
		
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		quantidade = 0;
	}
	
	public Produto(String nome, String tipo){
		
		
		this.nome = nome;
		this.preco = 0.0;
		this.tipo = tipo;
		quantidade = 0;
	}

	private void destroiProduto(){
		nome = "";
		preco = 0;		;
		
	}
	
	/**
	 * Essa classe seta o nome da variavel. mas se vc passar
	 * uma palavra chave, ele destroi o produto.
	 * 
	 */
	void setNome(String novoNome){
		/*
		if(novoNome.equals("Se destroi Xuxa")){
			destroiProduto();
		}*/

		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String toString(){
		return "Sou um produto de nome "+this.nome+" de preco "+this.preco;
	}
	
	public boolean equals(Object outroObjeto){
		
		if(outroObjeto instanceof Produto){
			Produto outroProduto = (Produto)outroObjeto;
			return this.nome.equals(outroProduto.getNome()) && this.preco == outroProduto.getPreco();
			
		}else{
			return false;
		}
					

	}
	
	public static void main(String[] args) {
		Produto umProduto = new Produto("A",5.00,"Alimento");		
		Produto outroProduto = new Produto("A",5.00,"Alimento");
		
		Pessoa italo = new Pessoa("Italo","Masculino");
		
		String intruso = "Volney";
		
		boolean resultado = umProduto.equals(outroProduto);
		
		System.out.println(resultado);
		//System.out.println(umProduto == outroProduto);
		
		//umProduto.equals(intruso.e);
	}
}
