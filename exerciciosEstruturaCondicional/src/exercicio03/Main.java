package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		System.out.println("Digite dois números");
		int a = ed.nextInt();
		int b = ed.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos");
		}else {
			System.out.println("Não são Múltiplos");
		}
	}

}
