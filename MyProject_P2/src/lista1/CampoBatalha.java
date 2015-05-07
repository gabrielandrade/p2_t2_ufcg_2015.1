package lista1;

public class CampoBatalha {

	public static void main(String[] args) {
		Habilidade bolaDeFogo = new Habilidade("Bola de Fogo",60,5);
		Habilidade raioDeGelo = new Habilidade("Raio de Gelo",20,3);
		
		Lutador neto = new Lutador("Neto", bolaDeFogo);
		Lutador lucas = new Lutador("Lucas", raioDeGelo);
		
		String a = null;				
		System.out.println(a.toString());
		
		System.out.println(neto.getVida());
		while(neto.getVida() != 0){
			lucas.ataca(neto);
			System.out.println(neto.getVida());			
		}
	}
	
}
