package exercicios.lista1.ex4;

public abstract class Funcionario {
	private int registro;
	private String Nome;
	private String dataAdmissao;
	private double salarioBase;

	public Funcionario(int registro, String nome, String dataAdmissao, double salarioBase) {
		this.registro = registro;
		this.Nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();
	
	public abstract void exibirRelatorio();

	public int getRegistro() {
		return registro;
	}

	public String getNome() {
		return Nome;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

}
