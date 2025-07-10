package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		Double x, y;
		
		System.out.println("Informe o valor x:");
		x = ed.nextDouble();
		System.out.println("Informe o valor y:");
		y = ed.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("ORIGEM");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		

	}

}
