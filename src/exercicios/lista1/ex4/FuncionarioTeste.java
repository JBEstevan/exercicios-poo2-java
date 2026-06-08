package exercicios.lista1.ex4;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Professor prof1 = new Professor(111, "Adhemar de Barros", "01/03/2002", 5000.0, Titulacao.DOUTOR);

		TecnicoAdministrativo tec1 = new TecnicoAdministrativo(111, "Axl Rose", "01/03/2009", 2900.0, 650.0);

		prof1.atribuirDisciplina(22, "Orientação a Objetos II", "Conceitos avançados de POO com Java", 60);
		prof1.atribuirDisciplina(23, "Banco de Dados II", "Conceitos avançados de de BD com Postgres", 60);
		prof1.atribuirDisciplina(22, "Algoritmos", "Algoritmos e lógica de programação", 90);

		tec1.atribuirProcesso(889, "05/06/2026", "Ajuste de Matrículas do Curso de Computação");
		tec1.atribuirProcesso(934, "08/06/2026", "Compra de Novos Computadores para o Laboratório");
		
		prof1.exibirRelatorio();
		tec1.exibirRelatorio();
		
		prof1.removerDisciplina(22);
		tec1.removerProcesso(880);
		tec1.removerProcesso(889);
		tec1.removerProcesso(934);
		
		tec1.exibirRelatorio();

	}

}
