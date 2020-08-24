package view.exercicio1;

import java.util.Scanner;

public class MenuVoluntario {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CADASTRAR_VOLUNTARIO = 1;
	private static final int OPCAO_MENU_CONSULTAR_VOLUNTARIO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_VOLUNTARIO = 3;
	private static final int OPCAO_MENU_EXCLUIR_VOLUNTARIO = 4;
	private static final int OPCAO_MENU_VOLUNTARIO_VOLTAR = 5;

	public void apresentarMenuVoluntario() {

		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_VOLUNTARIO_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_VOLUNTARIO: {
				System.out.println("Volut�rio cadastrado");
				break;
			}
			case OPCAO_MENU_CONSULTAR_VOLUNTARIO: {
				System.out.println("Volunt�rio consultado");
				break;
			}
			case OPCAO_MENU_ATUALIZAR_VOLUNTARIO: {
				System.out.println("Volunt�rio atualizado");
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_VOLUNTARIO: {
				System.out.println("Volunt�rio exclu�do");
				break;
			}
			default: {
				System.out.println("\nOp��o Inv�lida");
			}
			}
			opcao = this.apresentarOpcoesMenu();
		}

	}

	private int apresentarOpcoesMenu() {
		System.out.println("Controle Covid \n********** Menu Cadastro de Volunt�rio **********");
		System.out.println("\nOp��es:");
		System.out.println(OPCAO_MENU_CADASTRAR_VOLUNTARIO + " - Cadastrar Volunt�rio");
		System.out.println(OPCAO_MENU_CONSULTAR_VOLUNTARIO + " - Consultar Volunt�rio");
		System.out.println(OPCAO_MENU_ATUALIZAR_VOLUNTARIO + " - Atualizar Volunt�rio ");
		System.out.println(OPCAO_MENU_EXCLUIR_VOLUNTARIO + " - Excluir Volunt�rio");
		System.out.println(OPCAO_MENU_VOLUNTARIO_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Op��o: ");

		return Integer.parseInt(teclado.nextLine());

	}

}
