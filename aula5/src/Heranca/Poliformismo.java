package Heranca;
import javax.swing.*;

public class Poliformismo {
	
	public static void main(String args[]) {
		// Declara��o do objeto do tipo da Superclasse inicializado como vazio
		Contribuinte pessoa = null;
		
		// Leitura da vari�vel que definir� como o objeto ser� instanciado
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite de 1 para Contribuinte\n"
		+ "Digite 2 para Pessoa F�sica\nDigite 3 para Pessoa Jur�dica\nDigite 4 para Funcion�rio"));
		
		switch(tipo) {
		case 1:
			pessoa = new Contribuinte(); break;
			
		case 2:
			pessoa = new PessoaFisica(); break;
			
		case 3:
			pessoa = new PessoaJuridica(); break;
			
		case 4:
			pessoa = new Funcionario(); break;
			
		default:
			System.out.println("Tipo n�o existente");
		}
		pessoa.mostraClasse();
	}
}
