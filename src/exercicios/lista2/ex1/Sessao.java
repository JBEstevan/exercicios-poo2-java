package exercicios.lista2.ex1;

public class Sessao {
	private String data;
	private String horario;
	private int nrIngresso;
	private Sala sala;
	private Filme filme;

	public Sessao(String data, String horario, Sala sala, Filme filme) {
		this.data = data;
		this.horario = horario;
		this.nrIngresso = sala.getCapacidadeMax();
		this.sala = sala;
		this.filme = filme;
	}

}
