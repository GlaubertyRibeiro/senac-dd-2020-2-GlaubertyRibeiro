package view.exercicio1;

import java.util.Scanner;

public class MenuVacinas {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CADASTRAR_VACINA = 1;
	private static final int OPCAO_MENU_CONSULTAR_VACINA = 2;
	private static final int OPCAO_MENU_ATUALIZAR_VACINA = 3;
	private static final int OPCAO_MENU_EXCLUIR_VACINA = 4;
	private static final int OPCAO_MENU_VACINA_VOLTAR = 5;

	public void apresentarMenuVacinas() {

		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_VACINA_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_VACINA: {
				System.out.println("Vacina cadastrada");
				break;
			}
			case OPCAO_MENU_CONSULTAR_VACINA: {
				System.out.println("Vacina consultada");
				break;
			}
			case OPCAO_MENU_ATUALIZAR_VACINA: {
				System.out.println("Vacina atualizada");
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_VACINA: {
				System.out.println("Vacina excluída");
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
		System.out.println("Controle Covid \n********** Menu de Cadastro de Vacina **********");
		System.out.println("\nOpções:");
		System.out.println(OPCAO_MENU_CADASTRAR_VACINA + " - Cadastrar Vacina");
		System.out.println(OPCAO_MENU_CONSULTAR_VACINA + " - Consultar Vacina");
		System.out.println(OPCAO_MENU_ATUALIZAR_VACINA + " - Atualizar Vacina ");
		System.out.println(OPCAO_MENU_EXCLUIR_VACINA + " - Excluir Vacina");
		System.out.println(OPCAO_MENU_VACINA_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Opção: ");

		return Integer.parseInt(teclado.nextLine());

	}

}
