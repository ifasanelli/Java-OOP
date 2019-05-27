package ConstrucaoCivil;

public class Apartamento extends Construcao {
	
	Construcao apto = new Construcao();
	
	public Apartamento() {
		apto.setTipo("APARTAMENTO");
	}
	
	public void constroi() {
		System.out.println("Faz-se " + apto.getTipo());
	}

}
