package Command;

public class MinhaAplicacao {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		Invoker invoker = new Invoker();
		
		invoker.compute(new Soma(calculadora, 10));
		invoker.compute(new Soma(calculadora, 10));
		invoker.compute(new Soma(calculadora, 5));
		//Desfazer as duas últimas operações
		invoker.undo(2);

	}

}