package aula_0424.grasp;

import aula_0424.Aluno;

public class Turma {

	public static final int QTD_MINIMA_ALUNOS = 10;
	private Aluno[] alunos;
	//Este contador controla a adicao de alunos no array: alunos.
	private int contadorAlunos;

	/**
	 * Construtor para disciplinas que comecam vazias
	 * e permite a matricula de alunos.
	 */
	public Turma(){
		alunos = new Aluno[QTD_MINIMA_ALUNOS];
		contadorAlunos = 0;
	}
	
	/**
	 * Metodo para matricular um aluno nessa disciplina. O aluno sera criado
	 * com o nome e a matricula especificada.
	 * @param nome O nome do Aluno.
	 * @param Matricula A matricula do Aluno
	 * @return Um valor booleano indicando se foi possivel matricular o aluno.
	 */
	public boolean matriculaAluno(String nome, String matricula, String curso){
		Aluno aluno = new Aluno(nome,matricula,curso);
		if(this.contadorAlunos < alunos.length){
			alunos[contadorAlunos] = aluno;
			this.contadorAlunos++;
			return true;
			
		}else{
			//Nao ha mais vagas para novos alunos. 
			return false;
		}
	}
	
	/**
	 * Solicita novas vagas para a turma.
	 * @param vagasExtras
	 */
	public void solicitaNovasVagas(int vagasExtras){
		int totalVagas = alunos.length + vagasExtras;
		Aluno[] turmaMaior = new Aluno[totalVagas];
		
		for (int i = 0; i < this.alunos.length; i++) {
			turmaMaior[i] = alunos[i];
		}
		this.alunos = turmaMaior;
	}
	
	/**
	 * Fornece a representacao em String da Turma. Qualquer objeto que precisar imprimir
	 * a turma fará: System.out.println(turma);
	 */
	public String toString(){
		final String FIM_DE_LINHA = System.getProperty("line.separator");
		String turmaString = "Alunos da Turma: "+FIM_DE_LINHA;
		
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null){ //turmas nao preenchidas terao posicao vazia, no caso: Alunos null.
				turmaString += (i+1)+") ";
				turmaString += alunos[i].toString();
				turmaString += FIM_DE_LINHA;
			}
		}
		return turmaString;
	}
	
	/**
	 * Calcula a média aritmetica da turma baseada nas notas de todos os alunos da turma.
	 * @return Uma media aritmetica das notas dos alunos matriculados.
	 */
	public double mediaDaTurma(){
		double qtdAlunos = 0.0;
		double somaNotas = 0.0;
		
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null){ //turmas nao preenchidas terao posicao vazia, no caso: Alunos null.
				somaNotas += alunos[i].getNota();
				qtdAlunos += 1.0;
			}
		}
		//nao posso dividir pelo tamanho do array, porque ele 
		//    talvez nao esteja completamente preenchido
		return somaNotas/qtdAlunos; 
	}

	/**
	 * Atribui nota a um aluno com a matricula especificada.
	 * @param matricula A matricula do aluno.
	 * @param nota A nota do aluno especificado.
	 * @return Um valor booleano indicando se a avaliacao foi realizada com sucesso.
	 */
	public boolean avaliaAluno(String matricula, double nota) {
		for (int i = 0; i < alunos.length; i++) {
			//A ordem das comparacoes nesse if importa: Por que?
			//Teste: Troque a ordem e veja o que acontece.
			if(alunos[i] != null && alunos[i].getMatricula().equals(matricula)){
				alunos[i].setNota(nota);
				return true;
			}
		}
		//Aluno nao encontrado.
		return false;
	}
}
