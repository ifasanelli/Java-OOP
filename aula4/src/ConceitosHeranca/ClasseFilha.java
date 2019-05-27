package ConceitosHeranca;

public class ClasseFilha extends SuperClasse {
	ClasseFilha(){
		super();
		SetAtributo("Teste herança");
		System.out.println("Valor do atributo: " + GetAtributo());
	}
}
