package Heranca;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public void SetCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String GetCNPJ() {
		return cnpj;
	}
}
