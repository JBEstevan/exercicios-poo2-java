package exercicios.lista1.ex4;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
	private Titulacao titulacao;
	private List<Disciplina> disciplinas;

	public Professor(int registro, String nome, String dataAdmissao, double salarioBase, Titulacao titulacao) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.titulacao = titulacao;
		disciplinas = new ArrayList<Disciplina>();

	}

	public void atribuirDisciplina(int codDisciplina, String nomeDisciplina, String ementa, int cargaHoraria) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getCodDisciplina() == codDisciplina) {
				System.out.println("Aviso: O código " + codDisciplina + " já está ocupado pela disciplina '" 
                        + disciplina.getNomeDisciplina() + "'. Não foi possível adicionar '" + nomeDisciplina + "'.");
				return;
			}
		}

		Disciplina novaDisciplina = new Disciplina(codDisciplina, nomeDisciplina, ementa, cargaHoraria);
		this.disciplinas.add(novaDisciplina);
		System.out.println("Disciplina " + nomeDisciplina + " atribuída com sucesso.");
	}

	public void removerDisciplina(int codDisciplina) {
		Disciplina disciplinaParaRemover = null;
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getCodDisciplina() == codDisciplina) {
				disciplinaParaRemover = disciplina;
				break;
			}
		}
		if (disciplinaParaRemover != null) {
			this.disciplinas.remove(disciplinaParaRemover);
			System.out.println("Disciplina removida com sucesso!");
		} else {
			System.out.println("Disciplina não encontrada!");
		}
	}

	@Override
	public double calcularSalario() {
		double gratificacao = 0.0;
		if (this.titulacao == Titulacao.MESTRE) {
			gratificacao = 1000.0;
		} else if (this.titulacao == Titulacao.DOUTOR) {
			gratificacao = 2000.0;
		}

		int totalHoras = 0;
		for (Disciplina disciplina : disciplinas) {
			totalHoras += disciplina.getCargaHoraria();
		}

		double valorHorasAula = totalHoras * 15.0;

		return this.getSalarioBase() + gratificacao + valorHorasAula;

	}

	@Override
	public void exibirRelatorio() {
		System.out.println("===== RELATÓRIO =====");
		System.out.println("Registro: " + this.getRegistro());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Titulação: " + this.titulacao);
		System.out.println("Data de admissão: " + this.getDataAdmissao());
		System.out.println("Salário base: R$" + this.getSalarioBase());
		System.out.println("Salário total: R$" + calcularSalario());
		System.out.println("===== ===== ===== =====\n");

	}

}
