
public class SIquartoCiclo {
	// Atributos
	String nome_aluno;
	String nome_disciplina;
	String nome_professor;
	String dia_semana;
	double nota_prova;
	
	// M�todos relacionados aos atributos
	public void nome (String nome) {
		System.out.println("O nome do aluno �: " + nome);
	}
	
	public void disciplina (String disciplina) {
		System.out.println("O nome da disciplina �: " + disciplina);
	}
	
	public void professor (String professor) {
		System.out.println("O nome do professor �: " + professor);
	}
	
	public void dia (String dia) {
		System.out.println("O dia da semana �: " + dia);
	}
	
	public void nota (Double nota) {
		System.out.println("Nota da prova: " + nota);
	}
}
