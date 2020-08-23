package model.vo.exercicio1;

public class PesquisadorEntity extends PessoaEntity {

	private InstituicaoEntity instituicao;

	public PesquisadorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstituicaoEntity getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(InstituicaoEntity instituicao) {
		this.instituicao = instituicao;
	}

}
