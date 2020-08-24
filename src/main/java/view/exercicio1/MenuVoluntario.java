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
				System.out.println("Volutário cadastrado");
				break;
			}
			case OPCAO_MENU_CONSULTAR_VOLUNTARIO: {
				System.out.println("Voluntário consultado");
				break;
			}
			case OPCAO_MENU_ATUALIZAR_VOLUNTARIO: {
				System.out.println("Voluntário atualizado");
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_VOLUNTARIO: {
				System.out.println("Voluntário excluído");
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
		System.out.println("Controle Covid \n********** Menu Cadastro de Voluntário **********");
		System.out.println("\nOpções:");
		System.out.println(OPCAO_MENU_CADASTRAR_VOLUNTARIO + " - Cadastrar Voluntário");
		System.out.println(OPCAO_MENU_CONSULTAR_VOLUNTARIO + " - Consultar Voluntário");
		System.out.println(OPCAO_MENU_ATUALIZAR_VOLUNTARIO + " - Atualizar Voluntário ");
		System.out.println(OPCAO_MENU_EXCLUIR_VOLUNTARIO + " - Excluir Voluntário");
		System.out.println(OPCAO_MENU_VOLUNTARIO_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Opção: ");

		return Integer.parseInt(teclado.nextLine());

	}

}
