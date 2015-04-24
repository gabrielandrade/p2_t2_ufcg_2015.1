package aula_0424;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private double nota;
	
	public Aluno(String nome, String matricula, String curso) throws RuntimeException{
		if(nome.equals("")){
			throw new RuntimeException("Nome nao pode ser vazio.");
		}
		
		if(matricula.equals("")){
			throw new RuntimeException("Matricula nao pode ser vazia.");
		}
		
		if(curso.equals("")){
			throw new RuntimeException("Curso nao pode ser vazio.");
		}
		
		this.nota = 0.0;
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;

	}
		
	public String getNome(){
		return this.nome;
	}
	
	public void setName(String nome){
		this.nome = nome;
	}
	
	public String getMatricula(){
		return this.matricula;
	}

	public String getCurso() {
		return this.curso;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}

	public double getNota() {
		return this.nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		String alunoString = this.nome+". ";
		alunoString += curso;
		alunoString += ". Nota: "+nota;		
		return alunoString;
	}
}
