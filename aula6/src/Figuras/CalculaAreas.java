package Figuras;

public class CalculaAreas {
	public static void main(String args[]) {
		FigurasGeometricas u = new FigurasGeometricas();
		System.out.println("�rea do ret�ngulo: " + u.getArea(u.getLadoA(),u.getLadoB()));
		System.out.println("�rea do quadrado: " + u.getArea());
		u.setLadoA(4.0);
		System.out.println("�rea do ret�ngulo: " + u.getArea(u.getLadoA(),u.getLadoB()));
		System.out.println("�rea do quadrado: " + u.getArea());
	}
}
