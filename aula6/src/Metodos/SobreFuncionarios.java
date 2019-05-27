package Metodos;
import java.awt.Container;
import javax.swing.*;

public class SobreFuncionarios extends JApplet{
	
	FichaFuncionarios funcionarios = new FichaFuncionarios(22, 2888.09, "Mariana", "RP");
	
	MetodoPrincipal a = new MetodoPrincipal();
	
	public void init() {
		
		JTextArea saida = new JTextArea();
		Container container = getContentPane();
		container.add(saida);
		saida.setText(funcionarios.mostraFuncionarios());
	}
}
