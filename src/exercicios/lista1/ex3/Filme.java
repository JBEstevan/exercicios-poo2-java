package exercicios.lista1.ex3;

public class Filme {
	private String titulo;
	private int duracao;
	private double precoLocacao;
	private double valorPorDiaAtraso;
	private int diaLocacao;
	private int diaPrevistoDevolucao;
	private int diaDevolucao;
	private Cliente clienteLocado;
	private double valorTotalLocacao;
	private double valorMulta;

	public Filme(String titulo, int duracao, double precoLocacao, double valorPorDiaAtraso) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.precoLocacao = precoLocacao;
		this.valorPorDiaAtraso = valorPorDiaAtraso;
		this.diaLocacao = 0;
		this.diaPrevistoDevolucao = 0;
		this.diaDevolucao = 0;
		this.clienteLocado = null;
	}

	public void locarFilme(Cliente cliente, int diaLocacao) {
		if (this.diaLocacao != 0) {
			System.out.println("Falha na locação: o Filme " + this.titulo + " já está alugado.");
		} else {
			this.clienteLocado = cliente;
			this.diaLocacao = diaLocacao;
			this.diaPrevistoDevolucao = diaLocacao + 3;
			System.out.println("Filme: " + this.titulo + ", locado com sucesso!");
		}
	}

	public void devolverFilme(int diaDevolucao) {
		if (diaLocacao == 0) {
			System.out.println("Esse filme não está alugado no momento.");
		} else {
			this.diaDevolucao = diaDevolucao;
			if (diaDevolucao > this.diaPrevistoDevolucao) {
				int diaMulta = diaDevolucao - this.diaPrevistoDevolucao;
				this.valorMulta = diaMulta * this.valorPorDiaAtraso;
				this.valorTotalLocacao = this.precoLocacao + this.valorMulta;
			} else {
				this.valorMulta = 0.0;
				this.valorTotalLocacao = precoLocacao;
			}
			exibirRelatorio();
			this.clienteLocado = null;
			this.diaLocacao = 0;
		}
	}

	public void exibirRelatorio() {
		System.out.println("===== ===== ===== =====\n");
		System.out.println("Título do filme: " + this.titulo);
		System.out.println("Nome do cliente: " + this.clienteLocado.getNome());
		System.out.println("Dia da locação: " + this.diaLocacao);
		System.out.println("Dia previsto para devolução: " + this.diaPrevistoDevolucao);
		System.out.println("Dia da devolução: " + this.diaDevolucao);
		System.out.println("Valor do filme: R$ " + this.precoLocacao);
		System.out.println("Valor da multa: R$ " + this.valorMulta);
		System.out.println("Valor total da locação: R$ " + this.valorTotalLocacao);
		System.out.println("\n===== ===== ===== =====\n");
	}

	public void exibirRelatorioFilme() {
		System.out.println("===== ===== Dados do Filme ===== =====\n");
		System.out.println("Título do filme: " + this.titulo);
		System.out.println("Duração do filme: " + this.duracao + " minutos");
		System.out.println("Preço da locação: R$ " + this.precoLocacao);
		System.out.println("Valor da multa por dia de atraso: R$ " + this.valorPorDiaAtraso);

		if (this.diaLocacao == 0) {
			System.out.println("Status: Disponível");
		} else {
			System.out.println("Status: Locado");
			System.out.println("\n===== Dados do Cliente =====\n");
			System.out.println("Nome: " + this.clienteLocado.getNome());
			System.out.println("Data de nascimento: " + this.clienteLocado.getDataNascimento());
			System.out.println("Telefone: " + this.clienteLocado.getTelefone());
			System.out.println("Logradouro: " + this.clienteLocado.getEndereco().getLogradouro());
			System.out.println("Número: " + this.clienteLocado.getEndereco().getNumeroResidencia());
			System.out.println("Bairro: " + this.clienteLocado.getEndereco().getBairro());
			System.out.println("CEP: " + this.clienteLocado.getEndereco().getCep());
			System.out.println("Cidade: " + this.clienteLocado.getEndereco().getCidade());
			System.out.println("Estado: " + this.clienteLocado.getEndereco().getUnidadeFederativa());
		}
		System.out.println("\n===== ===== ===== =====\n");
	}
}
