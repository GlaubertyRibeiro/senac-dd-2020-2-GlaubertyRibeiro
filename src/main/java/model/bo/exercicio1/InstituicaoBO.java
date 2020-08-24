package model.bo.exercicio1;

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

}
