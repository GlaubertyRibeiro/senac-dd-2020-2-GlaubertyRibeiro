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
				System.out.println("Instituição cadastrada");
				break;
			}
			case OPCAO_MENU_CONSULTAR_INSTITUICAO: {
				System.out.println("Instituição consultada");
				break;
			}
			case OPCAO_MENU_ATUALIZAR_INSTITUICAO: {
				System.out.println("Instituição atualizada");
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_INSTITUICAO: {
				System.out.println("Instituição excluída");
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
		System.out.println("Controle Covid \n********** Menu de Cadastro de Instituição **********");
		System.out.println("\nOpções:");
		System.out.println(OPCAO_MENU_CADASTRAR_INSTITUICAO + " - Cadastrar Instituição");
		System.out.println(OPCAO_MENU_CONSULTAR_INSTITUICAO + " - Consultar Instituição");
		System.out.println(OPCAO_MENU_ATUALIZAR_INSTITUICAO + " - Atualizar Instituição ");
		System.out.println(OPCAO_MENU_EXCLUIR_INSTITUICAO + " - Excluir Instituição");
		System.out.println(OPCAO_MENU_INSTITUICAO_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Opção: ");

		return Integer.parseInt(teclado.nextLine());
	}

}
