package exercicios;
import java.util.Scanner;
import java.util.Objects;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa.
		 * Caso sexo seja "F" e estado civil seja "CASADA", solicitar o tempo de casada (anos).
		*/
		Scanner scanner = new Scanner (System.in);
		String nome, sexo, estadoCivil;
		int tempoCasamento;
		System.out.println("Nome: ");
		nome = scanner.next();
		System.out.println("Sexo? (F) ou (M): ");
		sexo = scanner.next();
		System.out.println("Estado civil (S) ou (C): ");
		estadoCivil = scanner.next();
		if ((sexo.equalsIgnoreCase("F")) && (estadoCivil.equalsIgnoreCase("C"))){
			System.out.println("Tempo de casamento em anos: ");
			tempoCasamento = scanner.nextInt();
			System.out.println("Seu nome é "+nome+" Você é do sexo feminino e está casada há  "+tempoCasamento +" anos");;
	   }else {
		  System.out.println("Seu nome é "+nome +" você é do sexo masculino.");
		  
	  }

}}