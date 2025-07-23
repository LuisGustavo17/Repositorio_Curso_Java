package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		Employee employee;
		
		employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = ed.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = ed.nextDouble();
		System.out.print("Tax: ");
		employee.tax = ed.nextDouble();
		
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double perc = ed.nextDouble();
		employee.increaseSalary(perc);
		
		System.out.println("Updated data: " + employee);
		
		
		
		
		ed.close();
	}

}
