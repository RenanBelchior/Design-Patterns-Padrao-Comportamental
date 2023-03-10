package Strategy;

public class AlgoritmosOrdenarVetor {

	public static void main(String[] args) {
        Vetor v = new Vetor(new BubbleSort());
        v.ordenar();
        
        v.setAlgoritmo(new QuickSort());
        v.ordenar();
	}
}