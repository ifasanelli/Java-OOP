package OrganizaCidade;

public class Prefeitura {
	public static void main(String args[]) {
		
		RegiaoDeSantos r = new RegiaoDeSantos();
		BairroDeSantos b = new BairroDeSantos();
		CidadeDeSantos c = new CidadeDeSantos();
		
		// Classe de hierarquia inferior d� acesso a todos os atributos
		b.setBairro("Ponta da Praia");
		b.setRegiao("Zona Leste");
		b.setRua("Rua Maria M�ximo");
		b.setPopulacao(100000);
		System.out.println("Bairro: " + b.getBairro());
		System.out.println("Regi�o: " + b.getRegiao());
		System.out.println("Rua: " + b.getRua());
		System.out.println("Popula��o: " + b.getPopulacao());
		
		// N�o d� acesso aos atributos da classe inferior
		r.setBairro("Ponta da Praia");
		r.setRegiao("Zona Leste");
		r.setPopulacao(100000);
		System.out.println("Bairro: " + r.getBairro());
		System.out.println("Regi�o: " + r.getRegiao());
		System.out.println("Popula��o: " + r.getPopulacao());
		
		c.setRegiao("Zona Leste");
		c.setPopulacao(100000);
		System.out.println("Regi�o: " + c.getRegiao());
		System.out.println("Popula��o: " + c.getPopulacao());
	}
}
