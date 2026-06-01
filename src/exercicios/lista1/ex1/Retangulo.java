package exercicios.lista1.ex1;

public class Retangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (this.base + this.altura);
	}

}
