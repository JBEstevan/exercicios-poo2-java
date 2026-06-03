package exercicios.lista1.ex3;

public class FilmeTeste {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco("Rua dos Bobos", 123, "Centro", "84010-000", "Ponta Grossa", "PR");

		Cliente socio1 = new Socio("Fausto Silva", "15/08/1985", "(42) 92233-1122", endereco1, "111.222.333-44");

		Filme filme1 = new Filme("O Poderoso Chefão", 200, 10.00, 2.50);

		filme1.exibirRelatorioFilme();

		// Alugando o filme no dia 5. A devolução prevista será dia 8.
		filme1.locarFilme(socio1, 5);
		System.out.println();

		filme1.exibirRelatorioFilme();
		// Deve mostrar o Status como LOCADO e exibir a ficha completa do João e seu
		// endereço

		filme1.devolverFilme(10);
		// Devolvendo no dia 10 (Ocorrerão 2 dias de atraso, gerando R$ 5,00 de multa)
		// Deve exibir o "Relatório de Locação" com o valor final cobrado

	}

}
