package aula2;
import javax.swing.JOptionPane;

public class Livraria {
	String editora;
	String autor;
	String livro;
	int quantidade;
	double preco;
	
	public void InformaLivros(int codigo) {
		switch(codigo) {
		case 1: JOptionPane.showMessageDialog(null, "Categoria romance \n" +
				"Livro: " + livro + 
				"\nEditora: " + editora +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nPre�o:  R$" + preco, "", JOptionPane.PLAIN_MESSAGE); break;
		
		case 2: JOptionPane.showMessageDialog(null, "Categoria esp�rita \n" +
				"Livro: " + livro + 
				"\nEditora: " + editora +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nPre�o: R$" + preco, "", JOptionPane.PLAIN_MESSAGE); break;
				
		case 3: JOptionPane.showMessageDialog(null, "Categoria inform�tica \n" +
				"Livro: " + livro + 
				"\nEditora: " + editora +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nPre�o: R$" + preco, "", JOptionPane.PLAIN_MESSAGE); break;
				
		default: System.out.println("C�digo n�o corresponde a nenhuma categoria de livro!");
		};
	};
}
