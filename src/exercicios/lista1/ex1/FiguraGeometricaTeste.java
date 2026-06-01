package exercicios.lista1.ex1;

public class FiguraGeometricaTeste {

	public static void main(String[] args) {
		FiguraGeometrica quadrado = new Quadrado("Preto", 7.0);
		FiguraGeometrica circulo = new Circulo("Azul", 3.0);
		FiguraGeometrica losango = new Losango("Verde", 6.0, 4.0, 5.0);
		FiguraGeometrica retangulo = new Retangulo("Vermelho", 22.0, 11.0);
		FiguraGeometrica trapezio = new Trapezio("Branco", 7.0, 3.7, 3.0, 7.2, 7.2);

		System.out.println("===== Quadrado =====");
		System.out.println("Cor: " + quadrado.getCor());
		System.out.println("Área: " + quadrado.calcularArea());
		System.out.println("Perímetro: " + quadrado.calcularPerimetro());
		System.out.println("===== =====\n");

		System.out.println("===== Círculo =====");
		System.out.println("Cor: " + circulo.getCor());
		System.out.println("Área: " + circulo.calcularArea());
		System.out.println("Perímetro: " + circulo.calcularPerimetro());
		System.out.println("===== =====\n");

		System.out.println("===== Losango =====");
		System.out.println("Cor: " + losango.getCor());
		System.out.println("Área: " + losango.calcularArea());
		System.out.println("Perímetro: " + losango.calcularPerimetro());
		System.out.println("===== =====\n");

		System.out.println("===== Retângulo =====");
		System.out.println("Cor: " + retangulo.getCor());
		System.out.println("Área: " + retangulo.calcularArea());
		System.out.println("Perímetro: " + retangulo.calcularPerimetro());
		System.out.println("===== =====\n");

		System.out.println("===== Trapézio =====");
		System.out.println("Cor: " + trapezio.getCor());
		System.out.println("Área: " + trapezio.calcularArea());
		System.out.println("Perímetro: " + trapezio.calcularPerimetro());
		System.out.println("===== =====\n");

	}

}
