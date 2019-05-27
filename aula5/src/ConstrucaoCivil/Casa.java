package ConstrucaoCivil;

public class Casa extends Construcao {
	
	Construcao casa = new Construcao();
	
	public Casa() {
		casa.setTipo("CASA");
	}
	
	public void constroi() {
		System.out.println("Faz-se " + casa.getTipo());
	}
}
