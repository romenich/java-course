package contadorcarneiro;

public class EexemploForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String carneirosNomes[] = { "Felipe", "Jonas", "Julia", "Marcos"}; 
		
		for (int x=0; x<carneirosNomes.length; x++) {System.out.println("O carneiro no indice x=" + x + " é " +carneirosNomes[x]);
		}
	
		for ( String carneiro : carneirosNomes ) {
			System.out.println("Nome do carneiro é > " + carneiro);
		}
}

}