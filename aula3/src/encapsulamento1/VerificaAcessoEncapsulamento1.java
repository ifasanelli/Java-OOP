package encapsulamento1;

public class VerificaAcessoEncapsulamento1 {
	public static void main(String args[]) {
		
		AcessoNumeros chave = new AcessoNumeros();
		
		chave.a = 10;	// (int a;)
		
		chave.b = 20;	// (public int b;)
		
	 // chave.c = 30; (private int c;) N�o � poss�vel acessar vari�vel PRIVATE diretamente.
		chave.SetNumero("c",30);
		
		chave.d = 40;	// (protected int d;)
		
		chave.MostraNumero();		
	}
}
