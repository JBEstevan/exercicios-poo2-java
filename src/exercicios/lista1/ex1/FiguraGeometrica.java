package exercicios.lista1.ex1;

public abstract class FiguraGeometrica {
	private String cor;

	public FiguraGeometrica(String cor) {
		this.cor = cor;
	}

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public String getCor() {
		return cor;
	}

}
