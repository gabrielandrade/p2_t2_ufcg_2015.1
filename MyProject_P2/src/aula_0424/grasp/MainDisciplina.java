package aula_0424.grasp;

public class MainDisciplina {

	private Disciplina disciplina;
	
	public MainDisciplina(){
		disciplina = new Disciplina("Programacao II",8);
	}
	
	public void tentaMatricular(String nome, String matricula, String curso){
		if(disciplina.matriculaAluno(nome, matricula, curso)){
			System.out.println(nome+" matriculado com sucesso.");
		}else{
			System.out.println("Nao foi possivel matricular "+nome);
		}
	}
	
	
	public void inicia(){
		//Matricula alunos e Imprime
		tentaMatricular("Gabriela", "1", "Computacao");
		tentaMatricular("Volney", "2", "Computacao");
		tentaMatricular("Lucas Wilker", "3", "Computacao");
		tentaMatricular("Aline", "4", "Computacao");
		tentaMatricular("Lucas Pierre", "5", "Computacao");
		tentaMatricular("Francisco Neto", "666", "Computacao");
		tentaMatricular("Tainah", "7", "Computacao");
		tentaMatricular("Raquel", "8", "Computacao");
		tentaMatricular("Williamberg", "9", "Medicina");
		tentaMatricular("Italo", "10", "Computacao");
		tentaMatricular("Joao Marcos", "11", "Computacao");
		System.out.println();
		System.out.println(disciplina.imprimeAlunos());
		
		//Atribui Notas
		disciplina.avaliaAluno("1", 9.0);
		disciplina.avaliaAluno("2", 8.5);
		disciplina.avaliaAluno("3", 7.8);
		disciplina.avaliaAluno("4", 7.4);
		disciplina.avaliaAluno("666", 3.2);
		disciplina.avaliaAluno("10", 10);
		
		//Aumenta a turma
		disciplina.solicitaNovasVagas(5);
		tentaMatricular("Joao Marcos", "11", "Computacao");
		tentaMatricular("Marcus", "12", "Engenharia Eletrica");
		tentaMatricular("Dyego", "13", "Computacao");
		tentaMatricular("Adson", "14", "Computacao");
		tentaMatricular("Saulo", "15", "Computacao");
		System.out.println();
		System.out.println(disciplina.imprimeAlunos());
		
		
	}
	
	public static void main(String[] args) {		
		MainDisciplina main = new MainDisciplina();
		main.inicia();
	}
}
