package view.exercicio1;

import java.util.Scanner;

public class MenuCadastroCovid {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CADASTRO_PESQUISADOR = 1;
	private static final int OPCAO_MENU_CADASTRO_VOLUNTARIO = 2;
	private static final int OPCAO_MENU_CADASTRO_PUBLICO_GERAL = 3;
	private static final int OPCAO_MENU_CADASTRO_VACINAS = 4;
	private static final int OPCAO_MENU_CADASTRO_INSTITUICOES = 5;
	private static final int OPCAO_MENU_CADASTRO_VOLTAR = 6;

	public void apresentarMenuCadastro() {
		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_CADASTRO_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRO_PESQUISADOR: {
				MenuPesquisador menuPesquisador = new MenuPesquisador();
				menuPesquisador.apresentarMenuPesquisador();
				break;
			}
			case OPCAO_MENU_CADASTRO_VOLUNTARIO: {
				MenuVoluntario menuVoluntario = new MenuVoluntario();
				menuVoluntario.apresentarMenuVoluntario();
				break;
			}
			case OPCAO_MENU_CADASTRO_PUBLICO_GERAL: {
				MenuPublicoGeral menuPublicoGeral = new MenuPublicoGeral();
				menuPublicoGeral.apresentarMenuPublicoGeral();
				break;
			}
			case OPCAO_MENU_CADASTRO_VACINAS: {
				MenuVacinas menuVacinas = new MenuVacinas();
				menuVacinas.apresentarMenuVacinas();
				break;
			}
			case OPCAO_MENU_CADASTRO_INSTITUICOES: {
				MenuInstituicoes menuInstituicoes = new MenuInstituicoes();
				menuInstituicoes.apresentarMenuInstituicoes();
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
		System.out.println("\nControle Covid \n************ Menu de Cadastro Geral ************");
		System.out.println("\nOpções: ");
		System.out.println(OPCAO_MENU_CADASTRO_PESQUISADOR + " - Cadastrar Pesquisador");
		System.out.println(OPCAO_MENU_CADASTRO_VOLUNTARIO + " - Cadastrar Voluntário");
		System.out.println(OPCAO_MENU_CADASTRO_PUBLICO_GERAL + " - Cadastrar Público Geral");
		System.out.println(OPCAO_MENU_CADASTRO_VACINAS + " - Cadastrar Vacinas");
		System.out.println(OPCAO_MENU_CADASTRO_INSTITUICOES + " - Cadastrar Instituições");
		System.out.println(OPCAO_MENU_CADASTRO_VOLTAR + " - Voltar");
		System.out.println("\nDigite a Opção: ");

		return Integer.parseInt(teclado.nextLine());

	}

}
