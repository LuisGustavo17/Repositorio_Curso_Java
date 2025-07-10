package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		System.out.println("Digite o número.");
		int n = ed.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Par");
			
		}else {
			System.out.println("Impar");
		}
		
		
	}

}
