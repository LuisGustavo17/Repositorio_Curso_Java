package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		
		Triangle x , y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = ed.nextDouble();
		x.b = ed.nextDouble();
		x.c = ed.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = ed.nextDouble();
		y.b = ed.nextDouble();
		y.c = ed.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area do triangulo X: " + areaX);
		System.out.println("Area do triangulo X: " + areaY);

	}

}
