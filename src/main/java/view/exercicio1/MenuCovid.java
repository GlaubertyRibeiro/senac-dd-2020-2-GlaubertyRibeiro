package view.exercicio1;

import java.util.Scanner;

public class MenuCovid {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CADASTRO = 1;
	private static final int OPCAO_MENU_RELATORIO = 2;
	private static final int OPCAO_MENU_SAIR = 3;

	public void apresentarMenuCovid() {
		int opcao = this.apresentarOpcoesMenu();
		while (opcao != OPCAO_MENU_SAIR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRO: {
				MenuCadastroCovid menuCadastroCovid = new MenuCadastroCovid();
				menuCadastroCovid.apresentarMenuCadastro();
				break;
			}
			case OPCAO_MENU_RELATORIO: {
				MenuRelatorioCovid menuRelatorioCovid = new MenuRelatorioCovid();
				menuRelatorioCovid.apresentarMenuRelatorio();
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
		System.out.println(" *********** Controle Covid ***********");
		System.out.println("\nOp��es:");
		System.out.println(OPCAO_MENU_CADASTRO + " - Cadastros");
		System.out.println(OPCAO_MENU_RELATORIO + " - Relat�rios");
		System.out.println(OPCAO_MENU_SAIR + " - Sair");
		System.out.println("\nDigite a Op��o: ");

		return Integer.parseInt(teclado.nextLine());
	}

}
