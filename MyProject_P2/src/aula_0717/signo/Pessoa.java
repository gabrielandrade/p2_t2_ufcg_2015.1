package aula_0717.signo;

import java.time.LocalDate;

/*
 * Note que essa classe possui dois encapsulamentos para a troca do Strategy.
 * Considerando os principios do GRASP... qual o melhor encapsulamento e por que?
 */
public class Pessoa {

	private static final String SIGNO_CHINES = "Chines";
	private static final String SIGNO_ZODIACAL = "Zodiaco";
	
	private String nome;
	private LocalDate dataNascimento;
	private SignoCalculavel signo;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		signo = new SignoZodiacal();
	}
	
	//ENCAPSULAMENTO 1: 1 metodo
	public String calculaSigno(String tipoSigno){
		if(tipoSigno.equals(SIGNO_CHINES)){
			signo = new SignoChines();
			
		}else if(tipoSigno.equals(SIGNO_ZODIACAL)){
			signo = new SignoZodiacal();
		}
		//Encapsulamento da interface permite o forwarding. Note
		// que o encapsulamento de pessoa permite que o mundo nem
		// precisa passar a data de nascimento... ela ja esta no
		// wrapper (Pessoa).
		return signo.calculaMeuSigno(getDataNascimento());				
	}
	
	
	//ENCAPSULAMENTO 2: 3 metodos
	public String calculaSigno(){
		return signo.calculaMeuSigno(getDataNascimento());
	}
	
	public void usaSignoZodiacal(){
		signo = new SignoZodiacal();
	}
	
	public void usaSignoChines(){
		signo = new SignoChines();
	}
	//GETTERS AND SETTERS	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	
	public static void main(String[] args) {
		Pessoa waltDisney = new Pessoa("Walt Disney", LocalDate.of(1901, 12, 5));
		//Encapsulamento 1
		System.out.println(waltDisney.calculaSigno("Chines"));
		System.out.println(waltDisney.calculaSigno("Zodiaco"));
		
		//Encapsulamento 2
		waltDisney.usaSignoChines();
		System.out.println(waltDisney.calculaSigno());
		waltDisney.usaSignoZodiacal();
		System.out.println(waltDisney.calculaSigno());
	}
}
