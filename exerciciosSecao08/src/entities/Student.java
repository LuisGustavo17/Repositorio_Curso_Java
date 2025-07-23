package entities;

public class Student {
	public String name;
	public double primeiroSemestre;
	public double segundoSemestre;
	public double terceiroSemestre;
	
	public String status(double media ) {
		
		if(media >= 60.00) {
			return 	"PASS";
		}else {
			return "FAILED";
		}
	}
	
public void resultado(String resultado ) {
		if(resultado == "FAILED") {
			System.out.println("FINAL GRADE = " + media());
			System.out.println(status(media()));
			System.out.println("MISSING " + (media() - 60.00));
		}else {
			System.out.println("FINAL GRADE = " + media());
			System.out.println(status(media()));
		}
	}
	
	public double media() {
		double media = (primeiroSemestre + segundoSemestre + terceiroSemestre);
		return media;
	}
	

}
