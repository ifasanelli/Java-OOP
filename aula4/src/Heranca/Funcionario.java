package Heranca;

public class Funcionario extends PessoaFisica {
	
	private String cartao;
	
	public void SetCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String GetCartao() {
		return cartao;
	}
}
