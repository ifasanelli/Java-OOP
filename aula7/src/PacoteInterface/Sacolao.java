package PacoteInterface;

public class Sacolao {
	
	public static void main(String args[]) {
		ImplementaInterface a = new ImplementaInterface();
		a.frutaCitrica = "Laranja";
		a.frutaVermelha = "Maçã";
		
		System.out.print("Frutas Cítricas: " + a.identificaFruta(a.frutaCitrica));
		System.out.print("Frutas vermelhas: " + a.identificaFruta(a.frutaVermelha));
		System.out.print("Quantidade de frutas: " + a.quantidadeFrutas(12));	
		System.out.print("Preço do kilo da fruta: R$ " + a.precoKilo(5.66));	
	}
}
