package PadraoInterpreter;

public class Contexto {

	private String input;
	private int output;
	
	public Contexto(String input) {
		this.input = input;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public int getOutput() {
		return output;
	}
	
	public void setOuput(int output) {
		this.output = output;
	}
}