package OrganizaCidade;

public class BairroDeSantos extends RegiaoDeSantos {
	
	BairroDeSantos(){
		super("b");
	}
	
	private String rua;
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return rua;
	}
}
