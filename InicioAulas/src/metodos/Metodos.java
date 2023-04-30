package metodos;

public class Metodos {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	// para mudar o canal da tv
	public void mudarCanal ( int novoCanal) {
		canal = novoCanal;
	}
	// para aumentar o canal da tv
	public void aumentarCanal() {
		canal++;
		
	}
	
	//para diminuir o canal da tv
	public void diminurCanal() {
		canal--;
		
	}
	
    // para aumentar o volume da tv
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " +volume);
	}
	//para diminur o volume da tv
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o volume para: " +volume);
	}
	
	//para ligar a tv
	public void ligar () {
		ligada = true;
	}
	
	//para desligar a tv
	public void desligar () {
		ligada = false;
	}
	
		

	

}
