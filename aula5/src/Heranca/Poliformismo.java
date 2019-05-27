package Heranca;
import javax.swing.*;

public class Poliformismo {
	
	public static void main(String args[]) {
		// Declaração do objeto do tipo da Superclasse inicializado como vazio
		Contribuinte pessoa = null;
		
		// Leitura da variável que definirá como o objeto será instanciado
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite de 1 para Contribuinte\n"
		+ "Digite 2 para Pessoa Física\nDigite 3 para Pessoa Jurídica\nDigite 4 para Funcionário"));
		
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
			System.out.println("Tipo não existente");
		}
		pessoa.mostraClasse();
	}
}
