package State;

public class MeuPrograma {

	public static void main(String[] args) {

		Pato p = new Pato();
		
		//Altera o comportamento
		p.setComportamentoVoar(new NaoVoar());
		
		p.voar();
		p.grasnar();
	}
}