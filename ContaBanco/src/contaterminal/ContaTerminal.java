package contaterminal;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int numeroConta;
		String agenciaCliente, nomeCliente;
		double saldoConta;
		System.out.println("Por favor digite seu nome: ");
		nomeCliente = scanner.next();
		System.out.println("Por favor digite a agência: ");
		agenciaCliente = scanner.next();
		System.out.println("Por favor digite o número da sua conta: ");
		numeroConta = scanner.nextInt();
		System.out.println("Por favor digite o saldo da conta: ");
		saldoConta = scanner.nextDouble();
		System.out.println("Olá " +nomeCliente +"," +" obrigado por criar uma conta em nosso banco," +" sua agência é " +agenciaCliente +"," +" conta " +numeroConta +" e seu saldo " +saldoConta + " ja está disponível para saque. ");
	}

}
