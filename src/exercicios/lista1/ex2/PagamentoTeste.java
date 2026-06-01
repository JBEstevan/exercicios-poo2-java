package exercicios.lista1.ex2;

public class PagamentoTeste {

	public static void main(String[] args) {
		Pagamento cartaoCredito = new CartaoCredito(279.99, "0010030040050061", "Elon Musk", "03/03/2033", 333);
		Pagamento pix = new Pix(99.90, "001.002.003-98", "Roberto De Niro");
		Pagamento boleto = new Boleto(2000.00, "12/06/2026", "0001 00002 003 0004 5 67");

		cartaoCredito.efetuarPagamento();
		pix.efetuarPagamento();
		boleto.efetuarPagamento();

	}

}
