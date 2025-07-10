package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		
		
		System.out.println("Digite o código do produto e a quantidade:");
		
		int cod = ed.nextInt();
		int quant = ed.nextInt();
		
		double preco;
		double valorTotal;
		
		switch (cod) {
		case 1:
			preco = 4.00;
			valorTotal = preco * quant;
		    System.out.println("Cachorro quente" + " Total: R$ "+ valorTotal);
			break;
			
		case 2:
			 preco = 5.00;
			 valorTotal = preco * quant;
	         System.out.println("X-Salda " + "Total: R$ "+ valorTotal);
			break;
		case 3:
			preco = 5.0;
			valorTotal = preco * quant;
			System.out.println("X-Bacon "+"Total: R$ " + valorTotal);
			break;
		case 4:
			preco = 2.0;
			valorTotal = preco * quant;
			System.out.println("Torrada Simples "+"Total: R$ " + valorTotal);
			break;
		case 5:
			preco = 1.5;
			valorTotal = preco * quant;
			System.out.println("Refrigerante "+"Total: R$ " + valorTotal);
			break;
		}
		
		
	}

}
