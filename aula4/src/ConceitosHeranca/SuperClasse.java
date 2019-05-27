package ConceitosHeranca;

public class SuperClasse {
	
	private String atributo;
	
	SuperClasse(){
		System.out.println("Acesso à SuperClasse através do método super()");
	}
	
	public void SetAtributo(String atributo) {
		this.atributo = atributo;
	}
	
	public String GetAtributo() {
		return atributo;
	}
}
