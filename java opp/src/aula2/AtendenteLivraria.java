package aula2;
import javax.swing.JOptionPane;

public class AtendenteLivraria {
	public static void main(String args[]) {
		
		Livraria cultura = new Livraria();
		
		String a, b, c, d, e, i;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null, "Categoria: \nDigite 1 para Romance\n Digite 2 para Espírita\n Digite 3 para Informática");
		a = JOptionPane.showInputDialog(null, "Código");
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		e = JOptionPane.showInputDialog(null, "Quantidade");
		i = JOptionPane.showInputDialog(null, "Preço");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		
		cultura.editora = b;
		cultura.autor = c;
		cultura.livro = d;
		cultura.quantidade = g;
		cultura.preco = h;
		
		cultura.InformaLivros(f);
	};
}
