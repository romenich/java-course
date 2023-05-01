package controlefluxo;
//controle de fluxo fazendo o uso de condicional simples. Apenas um if

public class CaixaEletronico2 {

	public static void main(String[] args) {
		double saldo = 25.0, valorSolicitado = 17.0;
		if (valorSolicitado < saldo ) 
			saldo = saldo - valorSolicitado;
			
		
		System.out.println(saldo);
	}

}
