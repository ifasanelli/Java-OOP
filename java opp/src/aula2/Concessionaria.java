package aula2;
import javax.swing.JOptionPane;

public class Concessionaria {
	public static void main(String args[]){
		
		Automovel car1 = new Automovel();
		
		String mr, md, cr, pr;
		double pc;
		
		mr = JOptionPane.showInputDialog("Digite a marca: ");
		md = JOptionPane.showInputDialog("Digite o modelo: ");
		cr = JOptionPane.showInputDialog("Digite a cor: ");
		pr = JOptionPane.showInputDialog("Digite o preço: ");
		
		pc = Double.parseDouble(pr);
		
		car1.marca = mr;
		car1.modelo = md;
		car1.cor = cr;
		car1.preco = pc;
		
		car1.informa_automovel();
	};
}
