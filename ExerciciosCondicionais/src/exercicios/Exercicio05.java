package exercicios;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo,
		imprimindo o resultado.*/
		Scanner scanner = new Scanner (System.in);
		int num, resultado;
		System.out.println("Digite um número inteiro: ");
		num = scanner.nextInt();
		if (num > 0)
			resultado = num*2;
		else 
			resultado = num*3;
		System.out.println(resultado);
	}
		
}
