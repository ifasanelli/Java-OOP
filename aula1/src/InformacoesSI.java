
public class InformacoesSI {
	public static void main (String args[]) {
		
		// Objeto do tipo SIquartoCiclo
		SIquartoCiclo si = new SIquartoCiclo();
		
		si.nome_aluno = "Mariana";
		si.nome_disciplina = "Programa��o Orientada a Objetos";
		si.nome_professor = "Maur�cio";
		si.dia_semana = "Segunda-feira";
		si.nota_prova = 10.0;
		
		si.nome(si.nome_aluno);
		si.disciplina(si.nome_disciplina);
		si.professor(si.nome_professor);
		si.dia(si.dia_semana);
		si.nota(si.nota_prova);				
	}
}
