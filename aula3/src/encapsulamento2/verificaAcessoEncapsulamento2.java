package encapsulamento2;
import encapsulamento1.AcessoNumeros;

public class verificaAcessoEncapsulamento2 {
	public static void main(String args[]) {
		
		AcessoNumeros chave = new AcessoNumeros();
		
	//  chave.a = 10; (int a;) Encapsulamento public n�o expl�cito, 
   	//  n�o permite acesso de fora do pacote
		chave.SetNumero("a",10);
		
		chave.b = 20;	// (public int b;)
		
	 // chave.c = 30; (private int c;) N�o � poss�vel acessar vari�vel PRIVATE diretamente.
		chave.SetNumero("c",30);
		
	//  chave.d = 40; (protected int d;) N�o � poss�vel acessar vari�vel PROTECTED diretamente.
		chave.SetNumero("d",40);
		chave.MostraNumero();
	}
}
