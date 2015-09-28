package aula_0424;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;


public class AlunoTeste {
	
	private String nomeTeste1 = "Volney";
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);			
			Aluno aluno = new Aluno("Tainah","","Computacao");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		sc.close();

	}

	@Test
	public void testAluno(){
		try{
			//AQUI OCORRE A EXCEPTION
		
			Aluno aluno = new Aluno("Italo","1","Computacao");
			Aluno outroAluno = new Aluno("Gerson","2","Computacao");
			Aluno gabriela = new Aluno(nomeTeste1,"3","Computacao");
			
			Aluno tainah = new Aluno("", "5","Computacao");
			
			Aluno raquel = new Aluno("Raquel", "4","Computacao");
			
			Assert.assertEquals("Italo", aluno.getNome());
			Assert.assertEquals("Gerson", outroAluno.getNome());
			Assert.assertEquals(nomeTeste1, gabriela.getNome());
			
			Assert.assertEquals("1", aluno.getMatricula());
			Assert.assertEquals("3", gabriela.getMatricula());
			
			Assert.assertNotEquals(nomeTeste1, raquel.getNome());
			
			Assert.assertNotEquals("", aluno.getNome());
			Assert.assertNotEquals("", outroAluno.getNome());
			Assert.assertNotEquals("", gabriela.getNome());
			Assert.assertNotEquals("", tainah.getNome());

		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
	}
	
}
