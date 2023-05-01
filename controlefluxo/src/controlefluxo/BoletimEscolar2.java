package controlefluxo;
import java.util.Scanner;
//controle de fluxo com condições encandeadas

public class BoletimEscolar2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double nota1, nota2, media;
		System.out.println("1ª nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("2ª nota: ");
		nota2 = scanner.nextDouble();
		media = (nota1+nota2)/2;
		if (media > 7) {
			System.out.println("Aluno aprovado com média: "+media);
		}else if (media >= 5 && media < 7) {
			System.out.println("A média do aluno foi " +media +"," +" será necessário fazer a recuperação final.");
			
		}else {
			System.out.println("Aluno reprovado com média: "+media);

		}
		

	}

}
