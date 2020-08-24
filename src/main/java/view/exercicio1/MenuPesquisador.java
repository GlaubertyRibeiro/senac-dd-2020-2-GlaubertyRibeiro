package view.exercicio1;

import java.util.Scanner;

public class MenuPesquisador {
	
	Scanner teclado = new Scanner(System.in);
	
	private static final int OPCAO_MENU_CADASTRAR_PESQUISADOR = 1;
	private static final int OPCAO_MENU_CONSULTAR_PESQUISADOR = 2;
	private static final int OPCAO_MENU_ATUALIZAR_PESQUISADOR = 3;
	private static final int OPCAO_MENU_EXCLUIR_PESQUISADOR = 4;
	private static final int OPCAO_MENU_PESQUISADOR_VOLTAR = 5;

	public void apresentarMenuPesquisador() {
			int opcao = this.apresentarOpcoesMenu();

			while (opcao != OPCAO_MENU_PESQUISADOR_VOLTAR) {
				switch (opcao) {
				case OPCAO_MENU_CADASTRAR_PESQUISADOR: {
					System.out.println("Pesquisador cadastrado");
					break;
				}
				case OPCAO_MENU_CONSULTAR_PESQUISADOR: {
					System.out.println("Pesquisador consultado");
					break;
				}
				case OPCAO_MENU_ATUALIZAR_PESQUISADOR: {
					System.out.println("Pesquisador atualizado");
					;
					break;
				}
				case OPCAO_MENU_EXCLUIR_PESQUISADOR: {
					System.out.println("Pesquisador excluído");
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
			System.out.println("Controle Covid \n********** Menu de Cadastro de Pesquisadores **********");
			System.out.println("\nOpções:");
			System.out.println(OPCAO_MENU_CADASTRAR_PESQUISADOR + " - Cadastrar Pesquisador");
			System.out.println(OPCAO_MENU_CONSULTAR_PESQUISADOR + " - Consultar Pesquisador");
			System.out.println(OPCAO_MENU_ATUALIZAR_PESQUISADOR + " - Atualizar Pesquisador ");
			System.out.println(OPCAO_MENU_EXCLUIR_PESQUISADOR + " - Excluir Pesquisador");
			System.out.println(OPCAO_MENU_PESQUISADOR_VOLTAR + " - Voltar");
			System.out.println("\nDigite a Opção: ");

			return Integer.parseInt(teclado.nextLine());
		
	}

}
