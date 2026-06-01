package exercicios.lista1.ex2;

public class Pix extends Pagamento {
	private String chavePix;
	private String nomeDestinatario;

	public Pix(double valorTotalCompra, String chavePix, String nomeDestinatario) {
		super(valorTotalCompra);
		this.chavePix = chavePix;
		this.nomeDestinatario = nomeDestinatario;
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("===== Compra realizada no Pix =====");
		System.out.println("Valor total da Compra: " + this.getValorTotalCompra());
		System.out.println("Nome do destinatário: " + this.nomeDestinatario);
		System.out.println("Chave pix: " + this.chavePix);
		System.out.println("===== ===== ===== ===== ===== =====\n");

	}

}
