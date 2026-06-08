package exercicios.lista1.ex4;

public class Processo {
	private int numeroProcesso;
	private String dataCriacao;
	private String descricao;

	public Processo(int numeroProcesso, String dataCriacao, String descricao) {
		this.numeroProcesso = numeroProcesso;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	public int getNumeroProcesso() {
		return numeroProcesso;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public String getDescricao() {
		return descricao;
	}

}
