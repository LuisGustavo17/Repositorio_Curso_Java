package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ed = new Scanner(System.in);
		
		Student student ;
		student = new Student();
		
		student.name = ed.nextLine();
		student.primeiroSemestre = ed.nextDouble();
		student.segundoSemestre = ed.nextDouble();
		student.terceiroSemestre = ed.nextDouble();
		
		student.media();
		
		
		student.resultado(student.status(student.media()));
		
		
		
		
		ed.close();
	}

}
