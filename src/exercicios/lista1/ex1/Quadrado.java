package exercicios.lista1.ex1;

public class Quadrado extends FiguraGeometrica {
	private double lado;

	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * this.lado;
	}

}
