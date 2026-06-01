package exercicios.lista1.ex1;

public class Trapezio extends FiguraGeometrica {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double lado1;
	private double lado2;

	public Trapezio(String cor, double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
		super(cor);
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double calcularArea() {
		return ((this.baseMaior + this.baseMenor) * this.altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return this.baseMaior + this.baseMenor + lado1 + lado2;
	}

}
