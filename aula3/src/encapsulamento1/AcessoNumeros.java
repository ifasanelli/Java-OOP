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
		System.out.println("N�mero a: " + a);
		System.out.println("N�mero b: " + b);
		System.out.println("N�mero c: " + c);
		System.out.println("N�mero d: " + d);
	}
}
