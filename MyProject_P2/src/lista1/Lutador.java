package lista1;

public class Lutador {

	private final int TOTAL_MANA = 100;
	private final int TOTAL_VIDA = 100;
	
	private String nomeLutador;
	private int vida;
	private Habilidade habilidade;
	private int energia;

	public Lutador(String nomeLutador, Habilidade habilidade){
		this.nomeLutador = nomeLutador;
		this.habilidade = habilidade;

		this.vida = TOTAL_VIDA;
		this.energia = TOTAL_VIDA;
	}
	
	public String getNomeLutador(){
		return nomeLutador;
	}
	
	public void setNomeLutador(String nomeLutador){
		this.nomeLutador = nomeLutador;
	}
	
	public int getVida(){
		return vida;
	}
	
	public void recebeDano(int dano){
		if(dano >= this.vida){
			System.out.println(this.nomeLutador+" morreu.");
		}
		this.vida -= dano;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomeLutador == null) ? 0 : nomeLutador.hashCode());
		return result;
	}

	public int getEnergia(){
		return this.energia;
	}
	
	public void ataca(Lutador outroLutador) {
		if(getEnergia() < habilidade.getCustoMana() ){
			System.out.println("Out of mana!");
		}else{
			
			habilidade.usaHabilidade();
			outroLutador.recebeDano(habilidade.getDano());
			this.energia = this.energia - habilidade.getCustoMana();
			
		}
		
	}
	
}
