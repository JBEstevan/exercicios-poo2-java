package exercicios.lista1.ex4;

public class Disciplina {
	private int codDisciplina;
	private String nomeDisciplina;
	private String ementa;
	private int cargaHoraria;

	public Disciplina(int codDisciplina, String nomeDisciplina, String ementa, int cargaHoraria) {
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public String getEmenta() {
		return ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

}
