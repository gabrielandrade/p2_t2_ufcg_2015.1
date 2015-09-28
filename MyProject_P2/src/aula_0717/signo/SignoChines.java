package aula_0717.signo;

import java.time.LocalDate;

public class SignoChines implements SignoCalculavel {

	@Override
	public String calculaMeuSigno(LocalDate nascimento) {
		int ano = nascimento.getYear();
		int animal = ano % 12;
		switch (animal) {
		case 0:			
			return "Macaco";
		case 1:			
			return "Galo";
		case 2:			
			return "Cachorro";
		case 3:			
			return "Porco";
		case 4:			
			return "Rato";
		case 5:			
			return "Boi";
		case 6:			
			return "Tigre";
		case 7:			
			return "Coelho";
		case 8:			
			return "Dragao";
		case 9:			
			return "Serpente";
		case 10:			
			return "Cavalo";
		case 11:			
			return "Cabra";

		default:
			break;
		}
		return null;
	}
	
	public static void main(String[] args) {
		//Serpente, Cavalo, Cabra, Macaco, Galo, Cachorro, Porco, Rato, Boi, Tigre, Coelho, Dragao 
		System.out.println(1929.0 % 12);
		System.out.println(1932.0 % 12);
		System.out.println(1941.0 % 12);
		
		SignoCalculavel signo = new SignoChines();
		System.out.println(signo.calculaMeuSigno(LocalDate.of(1984, 03, 10)));
	}

}
