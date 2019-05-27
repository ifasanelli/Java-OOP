package OrganizaCidade;

public class Prefeitura {
	public static void main(String args[]) {
		
		RegiaoDeSantos r = new RegiaoDeSantos();
		BairroDeSantos b = new BairroDeSantos();
		CidadeDeSantos c = new CidadeDeSantos();
		
		// Classe de hierarquia inferior dá acesso a todos os atributos
		b.setBairro("Ponta da Praia");
		b.setRegiao("Zona Leste");
		b.setRua("Rua Maria Máximo");
		b.setPopulacao(100000);
		System.out.println("Bairro: " + b.getBairro());
		System.out.println("Região: " + b.getRegiao());
		System.out.println("Rua: " + b.getRua());
		System.out.println("População: " + b.getPopulacao());
		
		// Não dá acesso aos atributos da classe inferior
		r.setBairro("Ponta da Praia");
		r.setRegiao("Zona Leste");
		r.setPopulacao(100000);
		System.out.println("Bairro: " + r.getBairro());
		System.out.println("Região: " + r.getRegiao());
		System.out.println("População: " + r.getPopulacao());
		
		c.setRegiao("Zona Leste");
		c.setPopulacao(100000);
		System.out.println("Região: " + c.getRegiao());
		System.out.println("População: " + c.getPopulacao());
	}
}
