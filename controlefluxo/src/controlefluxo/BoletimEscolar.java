package controlefluxo;
import java.util.Scanner;
//controle de fluxo usando condicional composta

public class BoletimEscolar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double nota1, nota2, media;
		System.out.println("1ª nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("2ª nota: ");
		nota2 = scanner.nextDouble();
		media = (nota1+nota2)/2;
		if (media >=7) {
			System.out.println("Aluno aprovado.");
		}else {
			System.out.println("Aluno reprovado.");
		}
		System.out.println("Média final: "+media);

	}

}
