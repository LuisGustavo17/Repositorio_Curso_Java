package aula_35;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner ed = new Scanner(System.in);
		
		System.out.println("Digite que horas são: ");
		int hora = ed.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		} else {
			if(hora >= 12 && hora <= 18) {
				System.out.println("Boa tarde");
			}else {
				System.out.println("Boa noite");
			}
		}
		
		
	}

}
