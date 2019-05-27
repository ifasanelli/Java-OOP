package fatec;

public class CentroPaulaSouza {
	
	private String fatec;
	private String cidade;
	
	public CentroPaulaSouza(String cidade) {
		this.cidade = cidade;
		System.out.println("Método construtor da superclasse \n" + "Cidade: " + cidade);
	}
	
	public void SetFatec(String fatec) {
		this.fatec = fatec;
	}
	
	public String GetFatec() {
		return fatec;
	}
}
