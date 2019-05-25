
public class informacoes_SI {
	
	public static void main(String args[]) {
		// objeto do tipo SIquarto_ciclo
		SIquarto_ciclo si = new SIquarto_ciclo();
		
		// setando as variáveis do objeto do tipo SIquarto_ciclo
		si.nome_aluno = "Italo";
		si.nome_disciplina = "Programação Orientada à objeto";
		si.nome_professor = "Maurício";
		si.dia_semana = "Segunda-feira";
		si.nota_prova = 9.5;
		
		// setando parâmetros dos métodos do objeto do tipo SIquarto_ciclo
		si.nome(si.nome_aluno);
		si.disciplina(si.nome_disciplina);
		si.professor(si.nome_professor);
		si.dia(si.dia_semana);
		si.nota(si.nota_prova);
	};
	
}
