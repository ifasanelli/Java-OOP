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
				"\n Pre�o: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;
		
		case 2: JOptionPane.showMessageDialog(null, "Categoria Esp�rita \n" + 
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor + 
				"\n Quantidade: " + quantidade +
				"\n Pre�o: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;
		
		case 3: JOptionPane.showMessageDialog(null, "Categoria Inform�tica \n" + 
				"Livro: " + livro +
				"\n Editora: " + editora +
				"\n Autor: " + autor + 
				"\n Quantidade: " + quantidade +
				"\n Pre�o: " + preco,"", JOptionPane.PLAIN_MESSAGE);
		break;
		
		default: System.out.println("C�digo n�o corresponde a nenhuma categoria de livro");
		}
	}	
}
