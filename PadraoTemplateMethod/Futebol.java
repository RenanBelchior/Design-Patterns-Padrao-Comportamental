package PadraoTemplateMethod;

public class Futebol extends Game {
	
	@Override
	public void initialize() {
		System.out.println("11 jogadores");
	}
	
	public void startPlay() {
		System.out.println("Inicia a partida de futebol");
	}
	
	public void endPlay() {
		System.out.println("Termina a partida futebol");
	}

}
