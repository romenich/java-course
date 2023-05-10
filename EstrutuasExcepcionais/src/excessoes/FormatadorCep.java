package excessoes;

public class FormatadorCep {
public static void main(String[] args) {
	try {
		String meuCepFormatado = formatarCep("2376504");
		System.out.println(meuCepFormatado);
	} catch (CepInalidoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("O CEP não corresponde com as regras de negócio.");
	}
	
}
static String formatarCep (String cep) throws CepInalidoException{
	if (cep.length() !=8)
		throw new CepInalidoException();
	//simulando um CEP formatado
	return "23.765-064";
	
	
}
}
