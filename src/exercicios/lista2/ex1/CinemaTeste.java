package exercicios.lista2.ex1;

public class CinemaTeste {
	public static void main(String[] args) {
		// 1. Criando Salas e Filmes
		Sala sala1 = new Sala(10, 50); // Sala 10, cabe 50 pessoas
		Sala sala2 = new Sala(20, 30); // Sala 20, cabe 30 pessoas

		Filme filme1 = new Filme("Inception", 148);
		Filme filme2 = new Filme("Shrek 2", 93);

		// 2. Criando Sessões (repare que não passamos a quantidade de ingressos!)
		Sessao sessao1 = new Sessao("10/06/2026", "19:00", sala1, filme1);
		Sessao sessao2 = new Sessao("10/06/2026", "21:30", sala2, filme2);

		// 3. Testando as regras de vendas de ingressos
		System.out.println("--- Iniciando Vendas ---");
		sessao1.venderIngresso(15); // Sucesso
		sessao1.venderIngresso(40); // Falha! (Só restam 35)
		sessao2.venderIngresso(30); // Sucesso (Lota a sala)

		// 4. Usando o gerenciador para aplicar Interfaces, Mapas e Lambdas
		GerenciadorCinema cinema = new GerenciadorCinema();
		cinema.adicionarSessao(sessao1);
		cinema.adicionarSessao(sessao2);

		// Exibe os relatórios usando os métodos iterativos com lambdas
		cinema.listarTodasAsSessoes();
		cinema.mostrarMapaSalas();
	}
}