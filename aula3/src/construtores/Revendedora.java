package construtores;

public class Revendedora {
	
	public static void main(String args[]) {
		// Permite construir objeto Automovel vazio.
		Automovel car = new Automovel();
		car.MostraCarro();
		
		Automovel car1 = new Automovel(1977, "Volkswagen", "Fusca", 3888.00);
		car1.MostraCarro();
		
	}
}
