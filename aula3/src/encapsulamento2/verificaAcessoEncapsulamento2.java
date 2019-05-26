package encapsulamento2;
import encapsulamento1.AcessoNumeros;

public class verificaAcessoEncapsulamento2 {
	public static void main(String args[]) {
		
		AcessoNumeros chave = new AcessoNumeros();
		
	//  chave.a = 10; (int a;) Encapsulamento public não explícito, 
   	//  não permite acesso de fora do pacote
		chave.SetNumero("a",10);
		
		chave.b = 20;	// (public int b;)
		
	 // chave.c = 30; (private int c;) Não é possível acessar variável PRIVATE diretamente.
		chave.SetNumero("c",30);
		
	//  chave.d = 40; (protected int d;) Não é possível acessar variável PROTECTED diretamente.
		chave.SetNumero("d",40);
		chave.MostraNumero();
	}
}
