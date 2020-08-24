package controller.exercicio1;

import java.util.ArrayList;

import model.bo.exercicio1.InstituicaoBO;
import model.vo.exercicio1.InstituicaoEntity;

public class ControladorInstituicao {

	public void cadastrarInstituicaoController(InstituicaoEntity instituicaoEntity) {
		InstituicaoBO instituicaoBO = new InstituicaoBO();
		instituicaoBO.cadastrarInstituicaoBO(instituicaoEntity);
		
	}

	public void atualizarInstituicaoController(InstituicaoEntity instituicaoEntity) {
		
		InstituicaoBO instituicaoBO = new InstituicaoBO();
		instituicaoBO.atualizarInstituicaoBO(instituicaoEntity);
	}

	public void excluirInstituicaoController(InstituicaoEntity instituicaoEntity) {
		

		InstituicaoBO instituicaoBO = new InstituicaoBO();
		instituicaoBO.excluirInstituicaoBO(instituicaoEntity);
		
	}

	public ArrayList<InstituicaoEntity> consultarTodasInstituicoesController() {
		InstituicaoBO instituicaoBO = new InstituicaoBO();
		return instituicaoBO.consultarTodasInstituicoes();
	}

	public InstituicaoEntity consultarInstituicaoController(InstituicaoEntity instituicaoEntity) {
		
		InstituicaoBO instituicaoBO = new InstituicaoBO();
		return instituicaoBO.consultarInstituicao(instituicaoEntity);
	}

}
