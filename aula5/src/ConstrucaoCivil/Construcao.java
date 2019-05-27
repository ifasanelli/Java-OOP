package ConstrucaoCivil;

public class Construcao {

	private String tipo;
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void constroi() {
		System.out.println("Faz-se qualquer tipo de construção");
	}
}