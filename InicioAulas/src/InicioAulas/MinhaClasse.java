package InicioAulas;
import java.util.Locale;
import java.util.Scanner;


public class MinhaClasse {

	public static void main(String[] args) {
	//criando o objeto scanner
	Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
	//pedindo dados ao usuário
	System.out.println("Qual é o seu nome? ");
	String nome = scanner.next();
	
	System.out.println("Qual é a sua altura? ");
	double altura = scanner.nextDouble();
	
	System.out.println("Seu sobrenome? ");
	String sobrenome = scanner.next();
	
	System.out.println("Você é o " +nome +" " +sobrenome +" e possui " +altura +" cm de altura");

	}

}
