package view.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.exercicio1.ControladorInstituicao;
import controller.exercicio1.ControladorPesquisador;
import model.vo.exercicio1.EnderecoEntity;
import model.vo.exercicio1.InstituicaoEntity;
import model.vo.exercicio1.PesquisadorEntity;

public class MenuPesquisador {

	Scanner teclado = new Scanner(System.in);
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
				this.cadastrarPesquisador();
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

	private void cadastrarPesquisador() {
		PesquisadorEntity pesquisadorEntity = new PesquisadorEntity();
		EnderecoEntity enderecoEntity = new EnderecoEntity();
		
		System.out.println("\nDigite o ID da Instituição Pertencente: ");
		pesquisadorEntity.getInstituicao().setId(Integer.parseInt(teclado.nextLine()));
		System.out.println("\nDigite o nome do Pesquisador: ");
		pesquisadorEntity.setNome(teclado.nextLine());
		System.out.println("\nDigite o Sexo do Pesquisador: ");
		pesquisadorEntity.setSexo(teclado.nextLine());
		System.out.println("\nDigite a Data de Nascimento Pesquisador: ");
		pesquisadorEntity.setDataNascimento(LocalDate.parse(teclado.nextLine(), dataFormatter));
		System.out.println("\nDigite o CPF do Pesquisador: ");
		pesquisadorEntity.setCpf(teclado.nextLine());
		System.out.println("\nDigite a Cidade do Pesquisador: ");
		pesquisadorEntity.getEndereco().setCidade(teclado.nextLine());
		System.out.println("\nDigite o Estado do Pesquisador: ");
		pesquisadorEntity.getEndereco().setEstado(teclado.nextLine());
		System.out.println("\nDigite a Rua do Pesquisador: ");
		pesquisadorEntity.getEndereco().setRua(teclado.nextLine());
		System.out.println("\nDigite o Número do Pesquisador: ");
		pesquisadorEntity.getEndereco().setNumero(teclado.nextLine());
		
		ControladorPesquisador controladorPesquisador = new ControladorPesquisador();
		controladorPesquisador.cadastrarPesquisadorController(pesquisadorEntity);
		
		
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
