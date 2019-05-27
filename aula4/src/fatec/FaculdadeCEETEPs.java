package fatec;

public class FaculdadeCEETEPs extends CentroPaulaSouza {
	
	private String faculdade;
	
	public FaculdadeCEETEPs() {
		super("Santos"); // O método super() acesso o método da classe com hierarquia 
						//imediatamente superior na relação de herança.
	}
	
	public void SetFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	public String GetFaculdade() {
		return faculdade;
	}
}
