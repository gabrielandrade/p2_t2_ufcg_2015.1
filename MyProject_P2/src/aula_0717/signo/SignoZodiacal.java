package aula_0717.signo;

import java.time.LocalDate;
import java.time.Month;

public class SignoZodiacal implements SignoCalculavel {

	public String calculaMeuSigno(LocalDate nascimento){
		
		int dia = nascimento.getDayOfMonth();
		Month mes = nascimento.getMonth();
		
		if(dia <= 20){
			return getSigno(mes);			
		
		}else if(dia > 20){
			return getSigno(mes.plus(1));
		}else{
			return "";
		}
	}

	private String getSigno(Month mes) {
		switch (mes) {
		case APRIL:
			return "Aries";

		case MAY:
			return "Touro";

		case JUNE:
			return "Gemeos";

		case JULY:
			return "Cancer";

		case AUGUST:
			return "Leao";
			
		case SEPTEMBER:
			return "Virgem";

		case OCTOBER:
			return "Libra";

		case NOVEMBER:
			return "Escorpiao";

		case DECEMBER:
			return "Sagitario";

		case JANUARY:
			return "Capricornio";

		case FEBRUARY:
			return "Aquario";

		case MARCH:
			return "Peixes";

		default:
			break;
		}
		return "";
	}

	
	public static void main(String[] args) {
		SignoCalculavel signo = new SignoChines();
		System.out.println(signo.calculaMeuSigno(LocalDate.of(1962, 03, 31)));
	}
}
