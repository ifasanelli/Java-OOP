package fatec;

public class AcessaFaculdade {
	public static void main(String args[]) {
		
		FaculdadeCEETEPs ceeteps = new FaculdadeCEETEPs();
		// A variável de instância tem acesso às classes
		// de relação de herança de hierarquia superior
		
		DisciplinasCEETEPs disciplinas = new DisciplinasCEETEPs();
		
		ceeteps.SetFatec("Fatec Baixada Santista");
		System.out.println("Fatec: " + ceeteps.GetFatec());
		
		ceeteps.SetFaculdade("Administração e Desenvolvimento de Sistemas");
		System.out.println("Faculdade: " + ceeteps.GetFaculdade());
		
		disciplinas.SetDisciplina("Programação orientada a objetos");
		System.out.println("Disciplina: " + disciplinas.GetDisciplina());
	}
}
