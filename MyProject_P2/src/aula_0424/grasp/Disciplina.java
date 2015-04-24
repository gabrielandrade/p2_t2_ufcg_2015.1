package aula_0424.grasp;

public class Disciplina {

	private String nome;
	private int creditos;
	private Turma turma;
	
	public Disciplina(String nome, int creditos) {
		this.nome = nome;
		this.creditos = creditos;
		//inicializa a turma. Note que a quantidade de 
		//    alunos esta 'transparente', ou seja, nao 
		//    importa porque quem controla a quantidade eh a Turma. 
		turma = new Turma(); 
	}

	/**
	 * Realiza a matricula de um Aluno na Disciplina
	 * @param nome O nome do Aluno.
	 * @param matricula A matricula do aluno.
	 * @param curso O curso ao qual o aluno pertence.
	 * @return Um boolean indicando se foi possivel matricular aquele aluno.
	 */
	public boolean matriculaAluno(String nome, String matricula, String curso){
		//isso se chama 'delegacao'. Nao eh responsabilidade da disciplina matricular alunos.
		// Os alunos devem pertencer a uma turma. Precisamos saber se conseguimos matricular ou nao
		return turma.matriculaAluno(nome, matricula, curso);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String imprimeAlunos(){
		final String FIM_DE_LINHA = System.getProperty("line.separator");
		String disciplinaString = "Disciplina: "+this.nome+FIM_DE_LINHA;		
		disciplinaString += "Creditos: "+this.creditos+FIM_DE_LINHA;
		disciplinaString += FIM_DE_LINHA;
		
		disciplinaString += turma.toString();
		
		return disciplinaString;
	}
	
	
	public boolean avaliaAluno(String matricula, double nota){
		return this.turma.avaliaAluno(matricula, nota);
	}
	
	public void solicitaNovasVagas(int vagasExtras){
		turma.solicitaNovasVagas(vagasExtras);
	}
}
