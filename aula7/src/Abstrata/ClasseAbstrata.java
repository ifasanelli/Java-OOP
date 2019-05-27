package Abstrata;

public abstract class ClasseAbstrata {
	
	private String nomeCondominio;
	private double despesasCondominio;
	
	protected String getNomeCondominio() {
		return nomeCondominio;
	}
	
	protected double calculaCondominio(double despesasCondominio) {
		this.despesasCondominio = despesasCondominio;
		return despesasCondominio;
	}
	
	// M�todo abstrato n�o pode ser implementado na pr�pria classe 
	// o fato de haver um m�todo abstrato na classe obriga a mesma a ser abstrata.
	public abstract void enderecoCondominio();
}
