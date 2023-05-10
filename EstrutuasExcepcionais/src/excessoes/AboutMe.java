package excessoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		//criação do objeto scanner
		try {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nome: ");
		String nome = scanner.next();
		System.out.println("Sobrenome: ");
		String sobrenome = scanner.next();
		System.out.println("Altura: ");
		double altura = scanner.nextDouble();
		System.out.println("Idade: ");
		int idade = scanner.nextInt();
		
		//imprimindo os dados obtidos pelo usuário
		System.out.println("Olá, me chamo " + nome.toUpperCase() +" " +sobrenome);
		System.out.println("Tenho " +idade + " anos");
		System.out.println("Minha altura é " +altura + "cm");
		}
		catch(InputMismatchException e) {
			System.out.println("ERRO: Os campos idade e altura precisam ser numéricos.");
		} 

	}

}
