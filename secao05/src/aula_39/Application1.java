package aula_39;

import java.util.Locale;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		
		int x = ed.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Segunda";
			break;
		case 2:
			dia = "Terça";
			break;
		case 3: 
			dia = "Quarta";
			break;
		case 4:
			dia = "Quinta";
		break;
		case 5:
			dia = "Sexta";
			break;
		case 6:
			dia = "Sábado";
			break;
		case 7:
			dia = "Domingo";
			break;
			default :
				System.out.println("Valor inválido");
				break;
		}
		

	}

}
