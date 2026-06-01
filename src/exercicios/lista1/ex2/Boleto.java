package exercicios.lista1.ex2;

public class Boleto extends Pagamento {
	private String dataVencimento;
	private String codigoBarras;

	public Boleto(double valorTotalCompra, String dataVencimento, String codigoBarras) {
		super(valorTotalCompra);
		this.dataVencimento = dataVencimento;
		this.codigoBarras = codigoBarras;
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("===== Compra realizada no Boleto =====");
		System.out.println("Valor total da Compra: " + this.getValorTotalCompra());
		System.out.println("Data de vencimento: " + this.dataVencimento);
		System.out.println("Código de barras: " + this.codigoBarras);
		System.out.println("===== ===== ===== ===== ===== =====\n");

	}

}
