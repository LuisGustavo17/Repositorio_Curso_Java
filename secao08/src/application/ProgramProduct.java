package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		
		Product p;
		p = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		p.name = ed.next();
		System.out.print("Price: ");
		p.price = ed.nextDouble();
		System.out.print("Quantity in stock: ");
		p.quantity = ed.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + p);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = ed.nextInt();
		p.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + p + "Total: " + p.totalValueInStock());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = ed.nextInt();
		p.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + p);
		
		ed.close();
		
	}

}
