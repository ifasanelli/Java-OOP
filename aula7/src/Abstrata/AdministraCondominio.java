package Abstrata;

public class AdministraCondominio {
	
	public static void main(String args[]) {
		
		Condominio b = new Condominio();
		ClasseAbstrata c = new Condominio();
		
		// Variável do tipo 'final' equivale a uma constante
		final double a = 234.08;
		
		System.out.println("Nome condomínio: " + b.getNomeCondominio());
		System.out.println("Valor comdomínio: " + b.calculaCondominio(a));
		
		c.enderecoCondominio();
	}
}
