package fatec;

public class AcessaFaculdade {
	public static void main(String args[]) {
		
		FaculdadeCEETEPs ceeteps = new FaculdadeCEETEPs();
		// A vari�vel de inst�ncia tem acesso �s classes
		// de rela��o de heran�a de hierarquia superior
		
		DisciplinasCEETEPs disciplinas = new DisciplinasCEETEPs();
		
		ceeteps.SetFatec("Fatec Baixada Santista");
		System.out.println("Fatec: " + ceeteps.GetFatec());
		
		ceeteps.SetFaculdade("Administra��o e Desenvolvimento de Sistemas");
		System.out.println("Faculdade: " + ceeteps.GetFaculdade());
		
		disciplinas.SetDisciplina("Programa��o orientada a objetos");
		System.out.println("Disciplina: " + disciplinas.GetDisciplina());
	}
}
