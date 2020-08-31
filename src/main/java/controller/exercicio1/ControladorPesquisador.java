package controller.exercicio1;

import model.bo.exercicio1.PesquisadorBO;
import model.vo.exercicio1.PesquisadorEntity;

public class ControladorPesquisador {

	public void cadastrarPesquisadorController(PesquisadorEntity pesquisadorEntity) {
		
		PesquisadorBO pesquisadorBO = new PesquisadorBO();
		pesquisadorBO.cadastrarPesquisadorBO(pesquisadorEntity);
	}

}
