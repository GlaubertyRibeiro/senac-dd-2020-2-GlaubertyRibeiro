package model.bo.exercicio1;

import java.util.ArrayList;

import model.dao.exercicio1.InstituicaoDAO;
import model.vo.exercicio1.InstituicaoEntity;

public class InstituicaoBO {

	public void cadastrarInstituicaoBO(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();

		if (instituicaoDAO.existeRegistroPorCnpj(instituicaoEntity.getCnpj())) {
			System.out.println("\nInstitui��o j� cadastrada.");
		} else {
			int resultado = instituicaoDAO.cadastrarInstituicaoDAO(instituicaoEntity);

			if (resultado == 1) {
				System.out.println("\nInstitui��o cadastrado com Sucesso.");
			} else {
				System.out.println("\nN�o foi possivel cadrastar a Institui��o.");
			}
		}

		
	}

	public void atualizarInstituicaoBO(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		
		if (instituicaoDAO.existeRegistroPorId(instituicaoEntity.getId())) {
			int resultado = instituicaoDAO.atualizarInstituicaoDAO(instituicaoEntity);
			if (resultado == 1) {
				System.out.println("\nInstitui��o atualizada com Sucesso.");
			} else {
				System.out.println("\nN�o foi possivel atualizar os dados da Instituic�o.");
			}
		} else {
			System.out.println("\nInstitui��o ainda n�o foi cadastrada.");
		}
		
	}

	public void excluirInstituicaoBO(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		
		if (instituicaoDAO.existeRegistroPorId(instituicaoEntity.getId())) {
			int resultado = instituicaoDAO.excluirInstituicaoDAO(instituicaoEntity);
			if (resultado == 1) {
				System.out.println("\nInstitui��o exclu�da com Sucesso.");
			} else {
				System.out.println("\nN�o foi possivel excluir a Institui��o.");
			}
		} else {
			System.out.println("\nInstitui��o n�o existe na base de dados.");
		}
		
	}

	public ArrayList<InstituicaoEntity> consultarTodasInstituicoes() {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		ArrayList<InstituicaoEntity> listaInstituicaoEntity = InstituicaoDAO.consultarTodasInstituicoesDAO();
		if (listaInstituicaoEntity.isEmpty()) {
			System.out.println("\nLista de Institui��es est� vazia. ");
		}
		return listaInstituicaoEntity;
	}

	public InstituicaoEntity consultarInstituicao(InstituicaoEntity instituicaoEntity) {
		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		InstituicaoEntity instituicao = instituicaoDAO.consultarInstituicoesDAO(instituicaoEntity);
		if (instituicao == null) {
			System.out.println("\nInstitui��o n�o foi Localizada. ");
		}
		return instituicao;
	}

}
