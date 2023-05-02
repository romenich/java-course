package exercicios;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Faça um algoritmo que leio os valores A, B, C e imprima na tela se a soma de A+B é menor que c.
		Scanner scanner = new Scanner (System.in);
		int a, b, c;
		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();
		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();
		System.out.println("Digite um valor para C: ");
		c = scanner.nextInt();
		if ((a+b)>c)
			System.out.println("A soma de " +a +" e " +b +" é maior do que " +c);

	}

}
