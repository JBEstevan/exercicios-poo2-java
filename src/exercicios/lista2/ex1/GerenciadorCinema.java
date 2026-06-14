package exercicios.lista2.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorCinema implements ControleCinema {
	// Uso de Coleções: Lista
	private List<Sessao> sessoes = new ArrayList<>();

	// Uso de Coleções: Mapa (Chave: Filme, Valor: Sala)
	private Map<Filme, Sala> mapaFilmeSala = new HashMap<>();

	@Override
	public void adicionarSessao(Sessao sessao) {
		this.sessoes.add(sessao);
		mapearFilmeNaSala(sessao.getFilme(), sessao.getSala());
	}

	@Override
	public void listarTodasAsSessoes() {
		System.out.println("\n--- LISTA DE SESSÕES (Via Expressão Lambda) ---");
		// Método de iteração moderno com Expressão Lambda
		sessoes.forEach(sessao -> sessao.exibirRelatorio());
	}

	@Override
	public void mapearFilmeNaSala(Filme filme, Sala sala) {
		this.mapaFilmeSala.put(filme, sala);
	}

	@Override
	public void mostrarMapaSalas() {
		System.out.println("\n--- MAPA DE OCUPAÇÃO ATUAL (Filme -> Sala) ---");
		// Método de iteração em Mapas usando Expressão Lambda (BiConsumer)
		mapaFilmeSala.forEach((filme, sala) -> {
			System.out.println("O Filme '" + filme.getTitulo() + "' está alocado na Sala " + sala.getNumeroId());
		});
	}
}