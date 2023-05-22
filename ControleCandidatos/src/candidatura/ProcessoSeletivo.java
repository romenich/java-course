package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		/*analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000);*/
		selecaoCandidatos();
		

	}
	
	
	static void selecaoCandidatos(
			) {
		String [] candidatos = { "Luiz","Marcolino", "Jucelia", "Clodoaldo", "Aline", "Augusto", "Cleonice", "Julio", "Peixoto", "Luiz Augusto"};
		int candidatosSelecionados = 0;
		int candidatosAtual=0;
		double salarioBase=2000.0;
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double SalarioPretendido = valorPretendido();
			System.out.println("O candidato " +candidato + " solicitou este valor de salário "+SalarioPretendido);
			if (salarioBase>=SalarioPretendido)
			{   System.out.println("O candidato "+candidato+ " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}else {
				System.out.println("O candidato "+candidato+ " não foi selecionado para a vaga.");
			}
			candidatosAtual++;
			System.out.println("Número de candidatos selecionados: " +candidatosSelecionados);
		}
	}
	static double valorPretendido () {
		return ThreadLocalRandom.current().nextDouble(1500,2500);
	}
	
	static void analisarCandidato(double salarioPredentido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPredentido) {
		
		System.out.println("Ligar para o candidato.");}
		else if (salarioBase==salarioPredentido) {
			System.out.println("Ligar para o candidato com contra proposta.");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos.");}
		}
	

}
