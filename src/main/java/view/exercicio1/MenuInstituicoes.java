package view.exercicio1;

import java.util.Scanner;

public class MenuInstituicoes {

	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CADASTRAR_INSTITUICAO = 1;
	private static final int OPCAO_MENU_CONSULTAR_INSTITUICAO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_INSTITUICAO = 3;
	private static final int OPCAO_MENU_EXCLUIR_INSTITUICAO = 4;
	private static final int OPCAO_MENU_INSTITUICAO_VOLTAR = 5;

	public void apresentarMenuInstituicoes() {
		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_INSTITUICAO_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_INSTITUICAO: {
				System.out.println("Institui��o cadastrada");
				break;
			}
			case OPCAO_MENU_CONSULTAR_INSTITUICAO: {
				System.out.println("Institui��o consultada");
				break;
			}
			case OPCAO_MENU_ATUALIZAR_INSTITUICAO: {
				System.out.println("Institui��o atualizada");
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_INSTITUICAO: {
				System.out.println("Institui��o exclu�da");
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
		System.out.println("Controle Covid \n********** Menu de Cadastro de Institui��o **********");
		System.out.println("\nOp��es:");
		System.out.println(OPCAO_MENU_CADASTRAR_INSTITUICAO + " - Cadastrar Institui��o");
		System.out.println(OPCAO_MENU_CONSULTAR_INSTITUICAO + " - Consultar Institui��o");
		System.out.println(OPCAO_MENU_ATUALIZAR_INSTITUICAO + " - Atualizar Institui��o ");
		System.out.println(OPCAO_MENU_EXCLUIR_INSTITUICAO + " - Excluir Institui��o");
		System.out.println(OPCAO_MENU_INSTITUICAO_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Op��o: ");

		return Integer.parseInt(teclado.nextLine());
	}

}
