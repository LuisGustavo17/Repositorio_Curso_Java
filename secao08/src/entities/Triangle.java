package entities; // Pacote da Classe

public class Triangle { // Nome da classe 
	public double a; // Atributos da classe
	public double b;
	public double c;
	
	//Tipo do dado que o método retorna + nome + Lista de parametros
	public double area() {
		double p = (a+b+c) / 2.0; // Corpo do método
		return Math.sqrt(p * (p - a ) * (p - b) * (p - c));
	}
}

