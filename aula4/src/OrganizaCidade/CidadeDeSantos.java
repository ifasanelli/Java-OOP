package OrganizaCidade;

public class CidadeDeSantos {
	
	private String regiao;
	private int populacao;
	
	CidadeDeSantos(){}
	
	CidadeDeSantos(String s){
		if(s == "r")
			System.out.println("Secretaria de regionais");
		if(s == "b")
			System.out.println("Secretaria de bairros");
	}
	
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	public int getPopulacao() {
		return populacao;
	}
}
