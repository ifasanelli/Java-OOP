package Abstrata;

public class AdministraCondominio {
	
	public static void main(String args[]) {
		
		Condominio b = new Condominio();
		ClasseAbstrata c = new Condominio();
		
		// Vari�vel do tipo 'final' equivale a uma constante
		final double a = 234.08;
		
		System.out.println("Nome condom�nio: " + b.getNomeCondominio());
		System.out.println("Valor comdom�nio: " + b.calculaCondominio(a));
		
		c.enderecoCondominio();
	}
}
