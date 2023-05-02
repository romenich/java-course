package exercicios;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Faça um algoritmo que receber um número qualquer e informar na tela se é par ou ímpar;
		Scanner scanner = new Scanner (System.in);
		int num;
		System.out.println("Digite um número inteiro qualquer: ");
		num = scanner.nextInt();
		if (num%2 == 0  )
			System.out.println(num +" é par.");
		else 
			System.out.println(num +" é ímpar.");

	}

}
