package aula_45;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		int x = ed.nextInt();
		
		int soma = 0;
		while(x!=0) {
			soma += x;
			x = ed.nextInt();
		}
		System.out.println(soma);
		ed.close();
	}

}
