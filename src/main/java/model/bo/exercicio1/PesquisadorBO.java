package model.bo.exercicio1;

import model.dao.exercicio1.InstituicaoDAO;
import model.dao.exercicio1.PesquisadorDAO;
import model.vo.exercicio1.PesquisadorEntity;

public class PesquisadorBO {

	public void cadastrarPesquisadorBO(PesquisadorEntity pesquisadorEntity) {
		PesquisadorDAO pesquisadorDAO = new PesquisadorDAO();
		
		
		if (pesquisadorDAO.existeRegistroPesquisadorPorIdInstituicao(pesquisadorEntity.getId())) {
			System.out.println("\nPesquisador já cadastrado.");
		} else {
			int resultado = pesquisadorDAO.cadastrarPesquisadorDAO(pesquisadorEntity);

			if (resultado == 1) {
				System.out.println("\nPesquisador cadastrado com Sucesso.");
			} else {
				System.out.println("\nNão foi possivel cadrastar o Pesquisador.");
			}
		}
	}

}
