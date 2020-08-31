package view.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

import controller.exercicio1.ControladorInstituicao;
import model.vo.exercicio1.InstituicaoEntity;

public class MenuInstituicoes {

	Scanner teclado = new Scanner(System.in);

	private static final int OPCAO_MENU_CADASTRAR_INSTITUICAO = 1;
	private static final int OPCAO_MENU_CONSULTAR_INSTITUICAO = 2;
	private static final int OPCAO_MENU_ATUALIZAR_INSTITUICAO = 3;
	private static final int OPCAO_MENU_EXCLUIR_INSTITUICAO = 4;
	private static final int OPCAO_MENU_INSTITUICAO_VOLTAR = 5;

	private static final int OPCAO_MENU_CONSULTAR_TODAS_INSTITUICAO = 1;
	private static final int OPCAO_MENU_CONSULTAR_UMA_INSTITUICAO = 2;
	private static final int OPCAO_MENU_CONSULTAR_INSTITUICAO_VOLTAR = 3;

	public void apresentarMenuInstituicoes() {
		int opcao = this.apresentarOpcoesMenu();

		while (opcao != OPCAO_MENU_INSTITUICAO_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CADASTRAR_INSTITUICAO: {
				this.cadastrarInstituicao();
				break;
			}
			case OPCAO_MENU_CONSULTAR_INSTITUICAO: {
				this.consultarInstituicao();
				break;
			}
			case OPCAO_MENU_ATUALIZAR_INSTITUICAO: {
				this.atualizarInstituicao();
				;
				break;
			}
			case OPCAO_MENU_EXCLUIR_INSTITUICAO: {
				this.excluirInstituicao();
				break;
			}
			default: {
				System.out.println("\nOpção Inválida");
			}
			}
			opcao = this.apresentarOpcoesMenu();
		}

	}

	private void consultarInstituicao() {

		int opcao = this.apresentarOpcoesConsulta();
		ControladorInstituicao controladorInstituicao = new ControladorInstituicao();
		while (opcao != OPCAO_MENU_CONSULTAR_INSTITUICAO_VOLTAR) {
			switch (opcao) {
			case OPCAO_MENU_CONSULTAR_TODAS_INSTITUICAO: {
				opcao = OPCAO_MENU_CONSULTAR_INSTITUICAO_VOLTAR;
				ArrayList<InstituicaoEntity> listaInstituicaoEntity = controladorInstituicao
						.consultarTodasInstituicoesController();
				System.out.println("*********** Resultado da Consulta *********** ");
				System.out.printf("\n%3s  %-50s  %-15s  %-20s  %-20s  %-10s  %-20s  %-30s \n"
						          , "ID", "NOME", "CNPJ", "BAIRRO", "RUA", "NÚMERO", "CIDADE", "ESTADO" );
				for (int i = 0; i < listaInstituicaoEntity.size(); i++) {
					listaInstituicaoEntity.get(i).imprimir();
				}
				break;
			}
			case OPCAO_MENU_CONSULTAR_UMA_INSTITUICAO: {
				opcao = OPCAO_MENU_CONSULTAR_INSTITUICAO_VOLTAR;
				InstituicaoEntity instituicaoEntity = new InstituicaoEntity();
				System.out.print("\nDigite o código da Instituição: ");
				instituicaoEntity.setId(Integer.parseInt(teclado.nextLine()));
				InstituicaoEntity instituicao = controladorInstituicao.consultarInstituicaoController(instituicaoEntity);
				System.out.println("*********** Resultado da Consulta *********** ");
				System.out.printf("\n%3s  %-50s  %-15s  %-20s  %-20s  %-10s  %-20s  %-30s \n"
				          , "ID", "NOME", "CNPJ", "BAIRRO", "RUA", "NÚMERO", "CIDADE", "ESTADO" );
				instituicao.imprimir();
				break;
			}
			default: {
				System.out.println("\nOpção Inválida!");
				opcao = this.apresentarOpcoesConsulta();
			}
			}
		}
	}

	private int apresentarOpcoesConsulta() {
		System.out.println("\nInforme o tipo de consulta a ser realizada:");
		System.out.println(OPCAO_MENU_CONSULTAR_TODAS_INSTITUICAO + " - Consultar todas as Instituições");
		System.out.println(OPCAO_MENU_CONSULTAR_UMA_INSTITUICAO + " - Consultar uma Instituição específica");
		System.out.println(OPCAO_MENU_CONSULTAR_INSTITUICAO_VOLTAR + " - Voltar ");
		System.out.println("\nDigite a Opção: ");
		return Integer.parseInt(teclado.nextLine());

	}

	private void excluirInstituicao() {
		InstituicaoEntity instituicaoEntity = new InstituicaoEntity();

		System.out.print("\nDigite o código da Instituição: ");
		instituicaoEntity.setId(Integer.parseInt(teclado.nextLine()));

		ControladorInstituicao controladorInstituicao = new ControladorInstituicao();
		controladorInstituicao.excluirInstituicaoController(instituicaoEntity);

	}

	private void atualizarInstituicao() {
		InstituicaoEntity instituicaoEntity = new InstituicaoEntity();

		System.out.print("\nDigite o código da Instituição: ");
		instituicaoEntity.setId(Integer.parseInt(teclado.nextLine()));
		System.out.print("\nDigite o Nome da Instituição: ");
		instituicaoEntity.setNome(teclado.nextLine());
		System.out.print("\nDigite o CNPJ da Instituição: ");
		instituicaoEntity.setCnpj(teclado.nextLine());
		System.out.print("\nDigite a Bairro da Instituição: ");
		instituicaoEntity.setBairro(teclado.nextLine());
		System.out.print("\nDigite a Rua da Instituição: ");
		instituicaoEntity.setRua(teclado.nextLine());
		System.out.print("\nDigite a Número da Instituição: ");
		instituicaoEntity.setNumero(teclado.nextLine());
		System.out.print("\nDigite a Cidade da Instituição: ");
		instituicaoEntity.setCidade(teclado.nextLine());
		System.out.print("\nDigite o Estado da Instituição: ");
		instituicaoEntity.setEstado(teclado.nextLine());

		ControladorInstituicao controladorInstituicao = new ControladorInstituicao();
		controladorInstituicao.atualizarInstituicaoController(instituicaoEntity);

	}

	private void cadastrarInstituicao() {
		InstituicaoEntity instituicaoEntity = new InstituicaoEntity();

		System.out.print("\nDigite o Nome da Instituição: ");
		instituicaoEntity.setNome(teclado.nextLine());
		System.out.print("\nDigite o CNPJ da Instituição: ");
		instituicaoEntity.setCnpj(teclado.nextLine());
		System.out.print("\nDigite a Bairro da Instituição: ");
		instituicaoEntity.setBairro(teclado.nextLine());
		System.out.print("\nDigite a Rua da Instituição: ");
		instituicaoEntity.setRua(teclado.nextLine());
		System.out.print("\nDigite a Número da Instituição: ");
		instituicaoEntity.setNumero(teclado.nextLine());
		System.out.print("\nDigite a Cidade da Instituição: ");
		instituicaoEntity.setCidade(teclado.nextLine());
		System.out.print("\nDigite o Estado da Instituição: ");
		instituicaoEntity.setEstado(teclado.nextLine());

		ControladorInstituicao controladorInstituicao = new ControladorInstituicao();
		controladorInstituicao.cadastrarInstituicaoController(instituicaoEntity);

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
