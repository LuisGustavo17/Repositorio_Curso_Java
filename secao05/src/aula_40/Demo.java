package aula_40;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		double preco = 34.50;
		double desconto = (preco < 20) ? preco *0.1 : preco * 0.05;
		System.out.println(desconto);
	}

}
