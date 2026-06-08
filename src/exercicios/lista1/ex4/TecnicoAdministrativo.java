package exercicios.lista1.ex4;

import java.util.ArrayList;
import java.util.List;

public class TecnicoAdministrativo extends Funcionario {
	private double adicionalNoturno;
	private List<Processo> processos;

	public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adicionalNoturno = adicionalNoturno;
		processos = new ArrayList<Processo>();
	}

	public void atribuirProcesso(int numeroProcesso, String dataCriacao, String descricao) {
		for (Processo processo : processos) {
			if (processo.getNumeroProcesso() == numeroProcesso) {
				System.out.println("Aviso: O processo número" + numeroProcesso + " já está atribuído a este técnico!");
				return;
			}
		}
		Processo novoProcesso = new Processo(numeroProcesso, dataCriacao, descricao);
		processos.add(novoProcesso);
		System.out.println("Processo " + numeroProcesso + " atribuído com sucesso.");
	}

	public void removerProcesso(int numeroProcesso) {
		Processo processoParaRemover = null;
		for (Processo processo : processos) {
			if (processo.getNumeroProcesso() == numeroProcesso) {
				processoParaRemover = processo;
				break;
			}
		}
		if (processoParaRemover != null) {
			processos.remove(processoParaRemover);
			System.out.println("Processo removido com sucesso!");
		} else {
			System.out.println("Processo não encontrado!");
		}
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.adicionalNoturno;

	}

	@Override
	public void exibirRelatorio() {
		System.out.println("===== RELATÓRIO =====");
		System.out.println("Registro: " + this.getRegistro());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Data de admissão: " + this.getDataAdmissao());
		System.out.println("Salário base: R$ " + this.getSalarioBase());
		System.out.println("Adicional noturno: R$ " + this.adicionalNoturno);
		System.out.println("Salário total: R$ " + calcularSalario());
		System.out.println("===== ===== ===== =====\n");
		System.out.println("===== PROCESSOS =====");
		if (this.processos.isEmpty()) {
			System.out.println("Nenhum processo atribuído no momento.");
		} else {
			for (Processo processo : processos) {
				System.out.println("Número: " + processo.getNumeroProcesso());
				System.out.println("Criado em: " + processo.getDataCriacao());
				System.out.println("Descrição: " + processo.getDescricao());
			}
		}
		System.out.println("===== ===== ===== =====\n");

	}

}
