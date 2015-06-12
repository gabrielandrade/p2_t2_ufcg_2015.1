package aula_0612;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

	public Locadora(){}
	
	public double informaAluguel(int numDias, List<Alugavel> alugaveis){
		double totalAluguel = 0.0;
		for(Alugavel produto : alugaveis){
			totalAluguel = totalAluguel + produto.calculaAluguel(numDias);
		}
		return totalAluguel;
	}
}
