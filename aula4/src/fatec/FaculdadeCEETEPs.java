package fatec;

public class FaculdadeCEETEPs extends CentroPaulaSouza {
	
	private String faculdade;
	
	public FaculdadeCEETEPs() {
		super("Santos"); // O m�todo super() acesso o m�todo da classe com hierarquia 
						//imediatamente superior na rela��o de heran�a.
	}
	
	public void SetFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	public String GetFaculdade() {
		return faculdade;
	}
}
