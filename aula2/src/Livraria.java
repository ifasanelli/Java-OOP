import javax.swing.JOptionPane;
public class Livraria {
	String editora;
	String autor;
	String livro;
	int quantidade;
	double preco;
	
	public void InformaLivro(int codigo) {
		
		switch(codigo) {
		case 1: JOptionPane.showMessageDialog(null, "Categoria Romance \n" + 
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor + 
				"\n Quantidade: " + quantidade +
				"\n Preço: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;
		
		case 2: JOptionPane.showMessageDialog(null, "Categoria Espírita \n" + 
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor + 
				"\n Quantidade: " + quantidade +
				"\n Preço: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;
		
		case 3: JOptionPane.showMessageDialog(null, "Categoria Informática \n" + 
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor + 
				"\n Quantidade: " + quantidade +
				"\n Preço: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;
		
		default: System.out.println("Código não corresponde a nenhuma categoria de livro");
		}
	}	
}
