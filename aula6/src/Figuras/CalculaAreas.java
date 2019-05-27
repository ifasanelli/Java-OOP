package Figuras;

public class CalculaAreas {
	public static void main(String args[]) {
		FigurasGeometricas u = new FigurasGeometricas();
		System.out.println("Área do retângulo: " + u.getArea(u.getLadoA(),u.getLadoB()));
		System.out.println("Área do quadrado: " + u.getArea());
		u.setLadoA(4.0);
		System.out.println("Área do retângulo: " + u.getArea(u.getLadoA(),u.getLadoB()));
		System.out.println("Área do quadrado: " + u.getArea());
	}
}
