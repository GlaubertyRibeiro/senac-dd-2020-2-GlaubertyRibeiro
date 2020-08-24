package view.exercicio1;

import java.util.Scanner;

public class MenuPublicoGeral {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CADASTRAR_PUBLICO_GERAL = 1;
	private static final int OPCAO_MENU_CONSULTAR_PUBLICO_GERAL = 2;
	private static final int OPCAO_MENU_ATUALIZAR_PUBLICO_GERAL = 3;
	private static final int OPCAO_MENU_EXCLUIR_PUBLICO_GERAL = 4;
	private static final int OPCAO_MENU_PUBLICO_GERAL_VOLTAR = 5;

	public void apresentarMenuPublicoGeral() {

		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_PUBLICO_GERAL_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_PUBLICO_GERAL: {
				System.out.println("Pessoa do público em geral cadastrada");
				break;
			}
			case OPCAO_MENU_CONSULTAR_PUBLICO_GERAL: {
				System.out.println("Pessoa do público em geral consultada");
				break;
			}
			case OPCAO_MENU_ATUALIZAR_PUBLICO_GERAL: {
				System.out.println("Pessoa do público em geral atualizado");
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_PUBLICO_GERAL: {
				System.out.println("Pessoa do público em geral excluído");
				break;
			}
			default: {
				System.out.println("\nOpção Inválida");
			}
			}
			opcao = this.apresentarOpcoesMenu();
		}

	}

	private int apresentarOpcoesMenu() {
		System.out.println("Controle Covid \n********** Menu Cadastro de pessoas do Público Geral **********");
		System.out.println("\nOpções:");
		System.out.println(OPCAO_MENU_CADASTRAR_PUBLICO_GERAL + " - Cadastrar Público Geral");
		System.out.println(OPCAO_MENU_CONSULTAR_PUBLICO_GERAL + " - Consultar Público Geral");
		System.out.println(OPCAO_MENU_ATUALIZAR_PUBLICO_GERAL + " - Atualizar Público Geral ");
		System.out.println(OPCAO_MENU_EXCLUIR_PUBLICO_GERAL + " - Excluir Público Geral");
		System.out.println(OPCAO_MENU_PUBLICO_GERAL_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Opção: ");

		return Integer.parseInt(teclado.nextLine());

	}

}
