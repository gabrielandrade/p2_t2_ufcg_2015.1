package aula_0612;

public class Carro implements Alugavel, Comparable<Carro> {

	private String nome;
	private double preco;
	
	public Carro(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}	
	
	public double calculaAluguel(int numDias){
		return numDias * this.preco;
	}

	public double getPreco(){
		return this.preco;
	}
	
	@Override
	public int compareTo(Carro outroCarro) {
		if(this.getPreco() < outroCarro.getPreco()){
			return -1;
			
		}else if(this.getPreco() == outroCarro.getPreco()){
			return 0;
			
		}else{//if(this.getPreco() > outroCarro.getPreco())
			return 1;
		}
	}

	
	
}
