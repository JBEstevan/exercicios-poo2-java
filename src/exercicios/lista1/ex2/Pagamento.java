package exercicios.lista1.ex2;

public abstract class Pagamento {
	private double valorTotalCompra;

	public Pagamento(double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

	public abstract void efetuarPagamento();

	public double getValorTotalCompra() {
		return valorTotalCompra;
	}

}
