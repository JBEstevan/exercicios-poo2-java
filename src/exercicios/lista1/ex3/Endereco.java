package exercicios.lista1.ex3;

public class Endereco {
	private String logradouro;
	private int numeroResidencia;
	private String bairro;
	private String cep;
	private String cidade;
	private String unidadeFederativa;

	public Endereco(String logradouro, int numeroResidencia, String bairro, String cep, String cidade,
			String unidadeFederativa) {
		this.logradouro = logradouro;
		this.numeroResidencia = numeroResidencia;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

}
