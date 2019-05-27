package Figuras;

public class FigurasGeometricas {
	
	private double ladoA;
	private static double ladoB;
	private double ladoC;
	private double area;
	
	FigurasGeometricas(){
		ladoA = 2.0;
		ladoB = 3.0;
		ladoC = 1.0;
	}
	
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	public double getLadoA() {
		return ladoA;
	}
	
	public double getLadoB() {
		return ladoB;
	}
	
	public double getArea(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		area = ladoA * ladoB;
		return area;
	}
	
	public double getArea() {
		area = ladoC * ladoC;
		return area;
	}
}
