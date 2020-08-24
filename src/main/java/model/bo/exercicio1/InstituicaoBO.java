package model.bo.exercicio1;

import java.util.ArrayList;

import model.dao.exercicio1.InstituicaoDAO;
import model.vo.exercicio1.InstituicaoEntity;

public class InstituicaoBO {

	public void cadastrarInstituicaoBO(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();

		if (instituicaoDAO.existeRegistroPorCnpj(instituicaoEntity.getCnpj())) {
			System.out.println("\nInstituição já cadastrada.");
		} else {
			int resultado = instituicaoDAO.cadastrarInstituicaoDAO(instituicaoEntity);

			if (resultado == 1) {
				System.out.println("\nInstituição cadastrado com Sucesso.");
			} else {
				System.out.println("\nNão foi possivel cadrastar a Instituição.");
			}
		}

		
	}

	public void atualizarInstituicaoBO(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		
		if (instituicaoDAO.existeRegistroPorId(instituicaoEntity.getId())) {
			int resultado = instituicaoDAO.atualizarInstituicaoDAO(instituicaoEntity);
			if (resultado == 1) {
				System.out.println("\nInstituição atualizada com Sucesso.");
			} else {
				System.out.println("\nNão foi possivel atualizar os dados da Instituicão.");
			}
		} else {
			System.out.println("\nInstituição ainda não foi cadastrada.");
		}
		
	}

	public void excluirInstituicaoBO(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		
		if (instituicaoDAO.existeRegistroPorId(instituicaoEntity.getId())) {
			int resultado = instituicaoDAO.excluirInstituicaoDAO(instituicaoEntity);
			if (resultado == 1) {
				System.out.println("\nInstituição excluída com Sucesso.");
			} else {
				System.out.println("\nNão foi possivel excluir a Instituição.");
			}
		} else {
			System.out.println("\nInstituição não existe na base de dados.");
		}
		
	}

	public ArrayList<InstituicaoEntity> consultarTodasInstituicoes() {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		ArrayList<InstituicaoEntity> listaInstituicaoEntity = InstituicaoDAO.consultarTodasInstituicoesDAO();
		if (listaInstituicaoEntity.isEmpty()) {
			System.out.println("\nLista de Instituições está vazia. ");
		}
		return listaInstituicaoEntity;
	}

	public InstituicaoEntity consultarInstituicao(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		InstituicaoEntity instituicao = instituicaoDAO.consultarInstituicoesDAO(instituicaoEntity);
		if (instituicao == null) {
			System.out.println("\nInstituição não foi Localizada. ");
		}
		return instituicao;
	}

}
