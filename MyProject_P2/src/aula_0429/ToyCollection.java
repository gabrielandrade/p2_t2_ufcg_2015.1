package aula_0429;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import aula_0424.Aluno;

public class ToyCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Criacao de varios alunos.
		Aluno aluno1 = new Aluno("Aline","1","Computacao");
		Aluno aluno2 = new Aluno("Aline","1","Computacao");
		Aluno aluno3 = new Aluno("Laybson","2","Computacao");
		Aluno aluno4 = new Aluno("Gerson","3","Computacao");
		
		//Uma colecao pode conter elementos quaisquer, de diversos tipos.
		// A garantia é que voce tenha uma colecoes de Object (objetos).
		ArrayList listaLivre = new ArrayList();
		listaLivre.add("Ytalo");
		listaLivre.add("Tainah");
		listaLivre.add(5);
		listaLivre.add(aluno1);
		
		listaLivre.remove(2);//<- Remove na posicao 3. Indice comeca em 0.
		//Tambem podemos remover passando o objeto. ArrayLista vai buscar o 
		//   objeto usando .equals E hashcode para enconrar o objeto desejado.
		listaLivre.remove("Tainah"); 
		
		listaLivre.add("Joao Marcos");
		System.out.println("Lista sem Generics: ");
		System.out.println(listaLivre);
		
		//Lista com generics. Nesse caso, vc permite apenas
		// que instances da classe Aluno pertençam a Lista.
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();		
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno3);
		listaAlunos.add(aluno4);
		listaAlunos.add(aluno2);
		System.out.println(listaAlunos);
		
		//Como iterar usando um Iterator
		Iterator<Aluno> iterator = listaAlunos.iterator();
		while(iterator.hasNext()){
			Aluno aluno = iterator.next();
			aluno.setNota(10.0);
		}
		//Usando o foreach. Tambem itera, porem
		// eh mais legivel. A diferença é o uso do while e do for.
		for(Aluno aluno : listaAlunos){
			aluno.setNota(8.0);
		}
		
		//Verifica se um elemento pertence a colecao.
		boolean contem = listaAlunos.contains(aluno2);
		System.out.println(contem);
		contem = listaAlunos.contains(aluno3);
		System.out.println(contem);
		
		//Imprime a lista de alunos. Note que houve mudanca nas notas.
		System.out.println(listaAlunos);		
		
		//Uso de Conjuntos
		System.out.println("----- Conjuntos -----");
		HashSet<Aluno> conjunto = new HashSet<Aluno>();
		
		//dois alunos iguais pelo equals e hashcode.
		boolean adicao1 = conjunto.add(aluno1);
		boolean adicao2 = conjunto.add(aluno2);
		System.out.println(adicao1);
		System.out.println(adicao2);
		
		//note que apenas 1 foi adicionado. Ao adicionar o segundo
		//hashset verifica que já possui aluno de matricula 1, dai
		//não insere.
		System.out.println(conjunto);
		
		//Inserir uma colecao dentro de outra:
		conjunto.addAll(listaAlunos);
		System.out.println(conjunto);
	}
	
}
