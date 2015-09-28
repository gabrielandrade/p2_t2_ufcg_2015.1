package aula_0513;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Item adagaItem = new Item("Adaga", 5.0, 15);
		Item pocaoItem = new Item("Pocao Cura", 5.0, 20);
		
	
		/*
		Arma adaga = new Arma("Adaga", 5.0, 15);
		Pocao pocao = new Pocao("Pocao", 5.0, 20);*/
		
		Item ref1 = new Arma("Adaga", 5.0, 15,80);
		Item ref2 = new Pocao("Adaga", 5.0, 15);
		Item ref3 = new Pocao("Pocao Cura", 7, 10);
		
		ArrayList<Item> itens = new ArrayList<Item>();
		itens.add(ref1);
		itens.add(ref2);
		itens.add(ref3);
		
		
		for(Item item : itens){
			System.out.println(item.usa());
		}
		
		
		
		
		
		
		
		
		/*
		int valorVida = 100;
		System.out.print("Uso uma adaga e tenho vida: "+adaga.usaItem(valorVida));
		System.out.print("Uso uma pocao e tenho vida: "+pocao.usaItem(valorVida));
		*/
	}
}
