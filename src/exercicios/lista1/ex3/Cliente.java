package exercicios.lista1.ex3;

public abstract class Cliente {
	private String nome;
	private String dataNascimento;
	private String telefone;
	private Endereco endereco;

	public Cliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
