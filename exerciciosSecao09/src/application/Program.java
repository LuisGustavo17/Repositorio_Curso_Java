package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		Bank b = null;
		
		System.out.print("Enter account number: ");
		int numberAccount = ed.nextInt();
		
		ed.nextLine(); //Limpa o buffer do scanner
		System.out.print("Enter account holder: ");
		String titularName = ed.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char resultado = ed.next().charAt(0);
		if(resultado == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = ed.nextDouble();
			 b = new Bank(numberAccount, titularName, initialDeposit);
			System.out.println("Account data: ");
			System.out.println(b);
		}else if(resultado == 'n') {
			 b = new Bank(numberAccount, titularName);
			System.out.println();
			System.out.println("Account data: ");
			System.out.println(b);
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = ed.nextDouble();
		b.deposito(deposit);
		
		System.out.println();
		System.out.println();
		System.out.print("Updated account data: ");
		System.out.println(b);
		
		
		System.out.print("Enter a withdraw value: ");
		double saque = ed.nextDouble();
		b.saque(saque);
		System.out.println();
		System.out.print("Updated account data: ");
		System.out.println(b);
		
		
		ed.close();
	}

}
