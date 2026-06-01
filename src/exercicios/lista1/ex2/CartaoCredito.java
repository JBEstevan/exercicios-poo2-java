package exercicios.lista1.ex2;

public class CartaoCredito extends Pagamento {
	private String numeroCartao;
	private String nomeTitular;
	private String dataValidade;
	private int codigoSeguranca;

	public CartaoCredito(double valorTotalCompra, String numeroCartao, String nomeTitular, String dataValidade,
			int codigoSeguranca) {
		super(valorTotalCompra);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.dataValidade = dataValidade;
		this.codigoSeguranca = codigoSeguranca;
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("===== Compra realizada no Cartão de Crédito =====");
		System.out.println("Valor total da Compra: " + this.getValorTotalCompra());
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("Número do cartão: " + this.numeroCartao);
		System.out.println("Data de validade: " + this.dataValidade);
		System.out.println("Código de segurança: " + this.codigoSeguranca);
		System.out.println("===== ===== ===== ===== ===== ===== ===== =====\n");

	}

}
