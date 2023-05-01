//controle de fluxo fazendo o uso de switch case

package controlefluxo;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double saldo, valorSaque, valorDeposito;
		int escolha;
		saldo = 1000.00;
		System.out.println("Digite 1 para depósito ou 2 para saque: ");
		escolha = scanner.nextInt();
		switch (escolha) {
			case 1: 
				System.out.println("Digite o valor do depósito: ");
				valorDeposito = scanner.nextDouble();
				saldo = saldo + valorDeposito;break;
			case 2:
				System.out.println("Digite o valor do saque: ");
				valorSaque = scanner.nextDouble();
				saldo = saldo - valorSaque;break;
			default:
				System.out.println("Nenhuma operação foi realizada.");
		}
		System.out.println("Saldo atual: "+saldo);
		

	}

}
