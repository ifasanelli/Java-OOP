
public class SIquartoCiclo {
	// Atributos
	String nome_aluno;
	String nome_disciplina;
	String nome_professor;
	String dia_semana;
	double nota_prova;
	
	// Métodos relacionados aos atributos
	public void nome (String nome) {
		System.out.println("O nome do aluno é: " + nome);
	}
	
	public void disciplina (String disciplina) {
		System.out.println("O nome da disciplina é: " + disciplina);
	}
	
	public void professor (String professor) {
		System.out.println("O nome do professor é: " + professor);
	}
	
	public void dia (String dia) {
		System.out.println("O dia da semana é: " + dia);
	}
	
	public void nota (Double nota) {
		System.out.println("Nota da prova: " + nota);
	}
}
