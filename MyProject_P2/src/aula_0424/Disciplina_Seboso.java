package aula_0424;


public class Disciplina_Seboso {

	private String nome;
	private int creditos;
	private int quantidadeDeAlunos;
	private double[] notas;
	private Aluno[] alunos;
	private int contador = 0;
	
	public Disciplina_Seboso(String nome, int creditos, int quantidadeDeAlunos) {
		this.nome = nome;
		this.creditos = creditos;
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.alunos = new Aluno[quantidadeDeAlunos];
		this.notas = new double[quantidadeDeAlunos];
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

	public int getQuantidadeDeAlunos() {
		return quantidadeDeAlunos;
	}

	public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	public void adicionaAluno(Aluno aluno){
		alunos[contador] = aluno;
		contador = contador + 1;
		if(contador == alunos.length){
			aumentaArray();
		}
	}
	
	public void aumentaArray(){
		Aluno[] novoArray = new Aluno[alunos.length * 2];
		for(int i = 0; i < alunos.length; i++){
			novoArray[i] = alunos[i];
		}
		alunos = novoArray;
	}
	
	public void imprimeAlunos(){
		System.out.println("Alunos: ");
		for(int i = 0; i < alunos.length; i++){
			System.out.println(alunos[i].getNome()+" do curso "+alunos[i].getCurso()+" nota: "+notas[i]);
		}
		System.out.println();
	}
}
