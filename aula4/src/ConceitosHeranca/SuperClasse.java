package ConceitosHeranca;

public class SuperClasse {
	
	private String atributo;
	
	SuperClasse(){
		System.out.println("Acesso � SuperClasse atrav�s do m�todo super()");
	}
	
	public void SetAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	public String GetAtributo() {
		return atributo;
	}
}
