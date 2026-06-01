package exercicios.lista1.ex1;

public class Losango extends FiguraGeometrica {
	private double diagonalMaior;
	private double diagonalMenor;
	private double lado;

	public Losango(String cor, double diagonalMaior, double diagonalMenor, double lado) {
		super(cor);
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (this.diagonalMaior * this.diagonalMenor) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * this.lado;
	}

}
