package exercicios.lista2.ex1;

public class Sessao {
	private String data;
	private String horario;
	private int ingressosDisponiveis; // nrIngresso do enunciado
	private int ingressosVendidos; // Atributo auxiliar para o relatório
	private Sala sala;
	private Filme filme;

	// Corrigido: Não recebe a quantidade de ingressos por parâmetro!
	public Sessao(String data, String horario, Sala sala, Filme filme) {
		this.data = data;
		this.horario = horario;
		this.sala = sala;
		this.filme = filme;
		// Inicia com a capacidade máxima da sala
		this.ingressosDisponiveis = sala.getCapacidadeMax();
		this.ingressosVendidos = 0;
	}

	public void venderIngresso(int quantidade) {
		if (quantidade <= this.ingressosDisponiveis) {
			this.ingressosDisponiveis -= quantidade;
			this.ingressosVendidos += quantidade;
			System.out.println(quantidade + " ingresso(s) vendido(s) com sucesso para o filme: " + filme.getTitulo());
		} else {
			System.out.println("Erro: Não há " + quantidade + " ingresso(s) disponível(is). Restam apenas "
					+ this.ingressosDisponiveis);
		}
	}

	public void exibirRelatorio() {
		System.out.println("=========================================");
		System.out.println("Data: " + this.data + " | Horário: " + this.horario);
		System.out.println("Filme: " + filme.getTitulo() + " (" + filme.getMinutos() + " min)");
		System.out.println("Sala: " + sala.getNumeroId());
		System.out.println("Ingressos Vendidos: " + this.ingressosVendidos);
		System.out.println("Ingressos Disponíveis: " + this.ingressosDisponiveis);
		System.out.println("=========================================");
	}

	// Getters para a classe gerenciadora usar
	public Filme getFilme() {
		return filme;
	}

	public Sala getSala() {
		return sala;
	}
}