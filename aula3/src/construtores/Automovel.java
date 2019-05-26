package construtores;

public class Automovel {
	
	private int ano;
	private String marca;
	private String modelo;
	private static String cor;
	private double preco;
	
	// Método construtor
	Automovel() { }
	
	// Método construtor
	Automovel (int ano, String marca, String modelo, double preco){
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	static {
		cor = "verde";
	}
	
	public void MostraCarro() {
		System.out.println("\n" + "Marca do carro: " + "\t" + marca + "\n" + 
						   "Modelo do carro: " + "\t" + modelo + "\n" +
						   "Ano: " + "\t" + ano + "\n" + "Cor: " + "\t" + cor + "\n" +
						   "Preço: " + "\t" + preco );
	}
	
}
