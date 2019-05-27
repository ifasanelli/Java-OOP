package Heranca;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCNPJ() {
		return cnpj;
	}
	
	public void mostraClasse() {
		System.out.println("Classe PessoaJuridica");
	}
}
