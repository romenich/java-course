package metodos;

public class Usuario {

	public static void main(String[] args) {
		Metodos metodosTv = new Metodos ();
		
		System.out.println("TV ligada: " +metodosTv.ligada);
		System.out.println("Canal atual: " +metodosTv.canal);
		System.out.println("Volume atual: " +metodosTv.volume);
		
		
		metodosTv.ligar();
		System.out.println("Agora a TV está ligada? " +metodosTv.ligada);
		
		metodosTv.mudarCanal(15);
		System.out.println("Canal atual : " +metodosTv.canal);
		
		metodosTv.aumentarVolume();
		System.out.println("Após ligar a tv o volume foi aumentado para? " +metodosTv.volume);
		
		metodosTv.diminuirVolume();
		metodosTv.diminuirVolume();
		metodosTv.diminuirVolume();
		metodosTv.diminuirVolume();
		metodosTv.diminuirVolume();
		metodosTv.diminuirVolume();
		System.out.println("Os vizinhos reclamaram da altura e o volume foi reduzido para? " +metodosTv.volume);
		
		
		metodosTv.desligar();
		System.out.println("Após uma hora a TV continua ligada? " +metodosTv.ligada);
		
		
		
		

	}

}
