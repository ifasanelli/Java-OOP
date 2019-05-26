package encapsulamento1;

public class AcessoNumeros {
	
	int a;
	public int b;
	private int c;
	protected int d;
	
	public void SetNumero(String id, int numero) {
		if (id == "a")
			this.a = numero;
		
		if (id == "c")
			this.c = numero;
		
		if (id == "d")
			this.d = numero;
	}
	
	public void MostraNumero() {
		System.out.println("Número a: " + a);
		System.out.println("Número b: " + b);
		System.out.println("Número c: " + c);
		System.out.println("Número d: " + d);
	}
}
