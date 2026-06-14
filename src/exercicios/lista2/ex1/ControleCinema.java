package exercicios.lista2.ex1;

public interface ControleCinema {
	void adicionarSessao(Sessao sessao);

	void listarTodasAsSessoes();

	void mapearFilmeNaSala(Filme filme, Sala sala);

	void mostrarMapaSalas();
}