package lab03;

import java.text.DecimalFormat;

public class Estoque {
	private static final int TAM_INICIAL = 5; 
	private Produto[] produtos;
	private int produtosAdicionados;
	private double totalArrecadado;
	private DecimalFormat formatador;
	
	public Estoque(){
		produtos = new Produto[TAM_INICIAL];
		produtosAdicionados = 0;
		totalArrecadado = 0.0;
		formatador = new DecimalFormat("#0.00");
	}
	
	public boolean adicionaProduto(String nome, String tipo, double preco, int quantidade){
		if(this.consultaProduto(nome).equals("")){ //se nao estiver cadastrado.
			Produto produto = new Produto(nome,tipo,preco,quantidade);
			
			if(produtosAdicionados >= produtos.length - 1){
				dobraTamanhoArray();
			}
			
			this.produtos[produtosAdicionados] = produto;
			produtosAdicionados = produtosAdicionados + 1;			
			return true;
			
		}else{
			return false;
		}
	}

	public String consultaProduto(String nome) {
		String produtoStr = "";
				
		Produto produtoEmEstoque = getProduto(nome);
		if(produtoEmEstoque != null){
			produtoStr = produtoEmEstoque.toString();
		}
		return produtoStr;
	}
	
	private void dobraTamanhoArray() {
		Produto[] novoArray = new Produto[2*this.produtos.length];
		for (int i = 0; i < produtos.length; i++) {
			novoArray[i] = this.produtos[i];			
		}
		this.produtos = novoArray;
	}
	
	public String vendeProduto(String nome, int quantidade){
		String valorString = "";
		Produto produtoEmEstoque = getProduto(nome);
		
		if(produtoEmEstoque != null && produtoEmEstoque.temDisponivel(quantidade)){
			double valor = produtoEmEstoque.getPreco() * quantidade;
			produtoEmEstoque.dinimuiQuantidade(quantidade);
			totalArrecadado =  totalArrecadado + valor;
			valorString = formatador.format(valor);
		}
		return valorString;
	}
	
	private Produto getProduto(String nomeProduto){
		Produto produtoEmEstoque = null;
		int contador = 0;
		while(contador < this.produtos.length){
			Produto atual = this.produtos[contador];
			if(atual == null){
				//O resto do array está vazio, preenchido com null.
				contador = this.produtos.length;
				
			}else if(atual.getNome().equals(nomeProduto)){
				produtoEmEstoque = atual;
				contador = this.produtos.length;
			}
			contador = contador + 1;
		}
		return produtoEmEstoque;
	}
	
	public String toString(){
		double totalParaArrecadar = 0.0;

		final String FIM_LINHA = System.getProperty("line.separator");
		String balanco = "";
		balanco += "Produtos Cadastrados:"+FIM_LINHA;
		int contador = 0;
		while(contador < this.produtos.length){
			Produto temp = this.produtos[contador];
			if(temp == null){
				contador = this.produtos.length; //chegou ao null, pode pular fora do laco.
			}else{
				totalParaArrecadar = totalParaArrecadar + temp.lucroMaximo();
				balanco += temp.toString()+FIM_LINHA;				
			}
			contador++;
		}
		balanco += FIM_LINHA;
		balanco += "Total arrecadado em vendas: R$"+formatador.format(totalArrecadado)+FIM_LINHA;
		balanco += "Total que pode ser arrecadado: R$"+formatador.format(totalParaArrecadar)+FIM_LINHA;
		return balanco;
	}
}
