package PadraoTemplateMethod;

public class MinhaAplicacao {

	public static void main(String[] args) {
		Game game = new Futebol();
		Game game2 = new Basquete();
		
		game.play();
		game2.play();

	}

}
