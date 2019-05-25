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
				"\nPreço:  R$" + preco, "", JOptionPane.PLAIN_MESSAGE); break;
		
		case 2: JOptionPane.showMessageDialog(null, "Categoria espírita \n" +
				"Livro: " + livro + 
				"\nEditora: " + editora +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nPreço: R$" + preco, "", JOptionPane.PLAIN_MESSAGE); break;
				
		case 3: JOptionPane.showMessageDialog(null, "Categoria informática \n" +
				"Livro: " + livro + 
				"\nEditora: " + editora +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nPreço: R$" + preco, "", JOptionPane.PLAIN_MESSAGE); break;
				
		default: System.out.println("Código não corresponde a nenhuma categoria de livro!");
		};
	};
}
