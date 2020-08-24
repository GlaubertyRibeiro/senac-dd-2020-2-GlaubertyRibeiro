package controller.exercicio1;

import model.bo.exercicio1.InstituicaoBO;
import model.vo.exercicio1.InstituicaoEntity;

public class ControladorInstituicao {

	public void cadastrarInstituicaoController(InstituicaoEntity instituicaoEntity) {
		InstituicaoBO instituicaoBO = new InstituicaoBO();
		instituicaoBO.cadastrarInstituicaoBO(instituicaoEntity);
		
	}

}
