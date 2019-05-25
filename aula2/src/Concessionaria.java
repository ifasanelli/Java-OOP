import javax.swing.JOptionPane;
public class Concessionaria {
	public static void main (String args[]) {
		
		Automovel e = new Automovel();
		
		String mr, md, cr, pr;
		double pc;
		
		mr = JOptionPane.showInputDialog("Digite a marca:");
		md = JOptionPane.showInputDialog("Digite o modelo:");
		cr = JOptionPane.showInputDialog("Digite a cor:");
		pr = JOptionPane.showInputDialog("Digite o preço:");
		
		pc = Double.parseDouble(pr);
		
		e.marca = mr;
		e.modelo = md;
		e.cor = cr;
		e.preco = pc;
		
		e.InformaAutomovel();
	}
}
