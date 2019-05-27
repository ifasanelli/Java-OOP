package Metodos;

public class FichaFuncionarios {
	
	private String nome;
	private int idade;
	private String profissao;
	private double salario;
	
	FichaFuncionarios e;
	
	FichaFuncionarios(String nome, String profissao, int idade, double salario){
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.salario = salario;
	}
	
	FichaFuncionarios(int idade, double salario, String nome, String profissao){
		this.idade = idade;
		this.salario = salario;
		this.nome = nome;
		this.profissao = profissao;
	}
	
	FichaFuncionarios(FichaFuncionarios e){
		this.e = e;
		mostraFuncionarios(e);
	}
	
	public void mostraFuncionarios(FichaFuncionarios f) {
		System.out.println("Nome: " + f.nome + "\nIdade: " + 
		f.idade + "\nProfissão: " + f.profissao + "\nSalário: " + f.salario);
	}
	
	public String mostraFuncionarios() {
		return ("Nome: " + nome + "\nIdade: " + idade + "\nProfissão: " + profissao + 
				"\nSalário: " + salario);
	}
	
}
