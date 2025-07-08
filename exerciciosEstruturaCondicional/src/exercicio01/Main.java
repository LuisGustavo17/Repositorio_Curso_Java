package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		int n = ed.nextInt();
		
		if(n < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("POSITIVO");
		}
	}

}
