
public class informacoes_SI {
	
	public static void main(String args[]) {
		// objeto do tipo SIquarto_ciclo
		SIquarto_ciclo si = new SIquarto_ciclo();
		
		// setando as vari�veis do objeto do tipo SIquarto_ciclo
		si.nome_aluno = "Italo";
		si.nome_disciplina = "Programa��o Orientada � objeto";
		si.nome_professor = "Maur�cio";
		si.dia_semana = "Segunda-feira";
		si.nota_prova = 9.5;
		
		// setando par�metros dos m�todos do objeto do tipo SIquarto_ciclo
		si.nome(si.nome_aluno);
		si.disciplina(si.nome_disciplina);
		si.professor(si.nome_professor);
		si.dia(si.dia_semana);
		si.nota(si.nota_prova);
	};
	
}
