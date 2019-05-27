package OrganizaCidade;

public class RegiaoDeSantos extends CidadeDeSantos {
	
	RegiaoDeSantos(){
		super("r");
	}
	
	RegiaoDeSantos(String f){
		super("f");
	}
	
	private String bairro;
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
}
