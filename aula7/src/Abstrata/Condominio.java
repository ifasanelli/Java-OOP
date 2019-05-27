package Abstrata;

public class Condominio extends ClasseAbstrata{
	
	protected String getNomeCondominio() {
		return "Vila Nova";
	}
	
	protected double calculaCondominio(double a) {
		return a * 1.066;
	}
	
	// Implementa��o do m�todo abstrato
	public void enderecoCondominio() {
		System.out.println("Rua A, n�22");
	}
}
