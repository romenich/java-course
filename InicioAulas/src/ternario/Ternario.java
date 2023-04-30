package ternario;

public class Ternario {

	public static void main(String[] args) {
	int a,b;
	a = 10;
	b = 25;
	String resultado;
	// condicional usando a estrutura i/else
	if (a==b) {
		resultado = "Os valores são iguais.";
	}else {
		resultado = "Os valores não são iguais.";
	}
	System.out.println(resultado);
	
	//uso do operador ternario
	String resultado2 = a==b?"Os valores são iguais." : "os valores não são iguais";
	System.out.println(resultado);

	}

}
