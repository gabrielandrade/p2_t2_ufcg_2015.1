package aula_0506;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import aula_0417.Produto;

public class Main {

	
	public static void main(String[] args) {
		
		Pessoa italo = new Pessoa("Italo", 19);
		Pessoa helvis = new Pessoa("Helvis", 22);
		Pessoa pessoa = new Pessoa("Aline", 18);
		Pessoa aline = new Pessoa("Aline", 25);
		
		System.out.println(aline.hashCode() == pessoa.hashCode());		
		System.out.println(aline.equals(pessoa));
		
		Produto ellen = null;  
		
		italo.setNome("Tainah");
		italo.setIdade(30);
		
		System.out.println(pessoa.fala());
		System.out.println(helvis.fala());
		System.out.println(italo.fala());
		boolean b = italo.equals(ellen);
		System.out.println(b);
		
		HashMap<String, Object> mapa = new HashMap();
		ArrayList lista = new ArrayList();
		HashSet conjunto = new HashSet();
		
	}
}
