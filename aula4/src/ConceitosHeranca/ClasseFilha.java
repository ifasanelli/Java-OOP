package ConceitosHeranca;

public class ClasseFilha extends SuperClasse {
	ClasseFilha(){
		super();
		SetAtributo("Teste heran�a");
		System.out.println("Valor do atributo: " + GetAtributo());
	}
}
