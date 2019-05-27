package Heranca;
import javax.swing.JOptionPane;

public class UsaFuncionario {
	
	public static void main(String args[]) {
		
		// Objetos
		Funcionario funcionario = new Funcionario();
		PessoaJuridica funcJur = new PessoaJuridica();
		
		String u, v, t, z;
		int x;
		
		z = JOptionPane.showInputDialog("Digite 1 para pessoa física\nDigite 2 para pessoa jurídica");
		
		// String para int
		x = Integer.parseInt(z);
		
		if(z.length() == 1) {
			switch(x) {
			case 1: {
				u = JOptionPane.showInputDialog("Digite o nome do contribuinte: ");
				v = JOptionPane.showInputDialog("Digite o RG do contribuinte: ");
				t = JOptionPane.showInputDialog("Digite o número do cartão do contribuinte: ");
				
				funcionario.SetNome(u);
				funcionario.SetRg(v);
				funcionario.SetCartao(t);
				
				System.out.println("Nome:" + funcionario.GetNome());
				System.out.println("RG:" + funcionario.GetRg());
				System.out.println("Cartão do contribuinte:" + funcionario.GetCartao());
				
				break;
			}
			
			case 2: {
				u = JOptionPane.showInputDialog("Digite o nome do contribuinte: ");
				v = JOptionPane.showInputDialog("Digite o CJPJ do contribuinte: ");
				t = JOptionPane.showInputDialog("Digite o número do cartão do contribuinte: ");
				
				funcionario.SetNome(u);
				funcJur.SetCNPJ(v);
				funcionario.SetCartao(t);
				
				System.out.println("Nome:" + funcionario.GetNome());
				System.out.println("RG:" + funcJur.GetCNPJ());
				System.out.println("Cartão do contribuinte:" + funcionario.GetCartao());
				
				break;
			}
			}
		}
		
	}
}
