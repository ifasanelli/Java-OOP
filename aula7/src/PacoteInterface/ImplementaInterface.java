package PacoteInterface;

public class ImplementaInterface implements ClasseInterface{
	protected String frutaVermelha;
	protected String frutaCitrica;
	
	public String identificaFruta(String fruta) {
		return fruta;
	}
	
	public int quantidadeFrutas(int f) {
		return f;
	}
	
	public double precoKilo(double k) {
		return k;
	}
}
