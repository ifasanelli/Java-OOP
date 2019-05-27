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
	
	// Método abstrato não pode ser implementado na própria classe 
	// o fato de haver um método abstrato na classe obriga a mesma a ser abstrata.
	public abstract void enderecoCondominio();
}
