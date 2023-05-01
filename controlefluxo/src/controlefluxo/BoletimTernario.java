package controlefluxo;
import java.util.Scanner;
//controle de fluxo usando condição ternária
public class BoletimTernario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double nota1, nota2, media;
		System.out.println("1ª nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("2ª nota: ");
		nota2 = scanner.nextDouble();
        media = (nota1+nota2)/2;
        String resultado = media >=7?"Aluno aprovado.":media >5&& media<7? "Aluno de recuperação.":"Aluno reprovado.";
        System.out.println(resultado);
        System.out.println("Média: "+media);
	}

}
