package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/
		
		int senha = 2002;
		System.out.println("Digite a senha: ");
		int senhaInformada = ed.nextInt();
		
		while(senhaInformada != senha) {
			System.out.println("Aceso Negado");
			System.out.println("Digite a senha: ");
			senhaInformada = ed.nextInt();
		}
		System.out.println("Acesso permitido");
	}

}
