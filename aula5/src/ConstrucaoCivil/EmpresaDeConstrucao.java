package ConstrucaoCivil;
import javax.swing.*;

public class EmpresaDeConstrucao {
	
	public static void main(String args[]) {
		
		Construcao pedreiro = null;
		
		int tipoConstrucao = Integer.parseInt(JOptionPane.showInputDialog("Digitar o tipo de construção:\n" + 
		"1 para casa\n 2 para apartamento\n 3 para ambos"));
		
		switch(tipoConstrucao) {
		
		case 1: 
			pedreiro = new Casa(); break;
		
		case 2:
			pedreiro = new Apartamento(); break;
			
		case 3:
			pedreiro = new Construcao(); break;
			
		default:
			System.out.println("Construção indefinida");
			System.exit(0);
		}
		
		pedreiro.constroi();
	}
}
