package model.vo.exercicio1;

public class PesquisadorEntity extends PessoaEntity {

	private InstituicaoEntity instituicao;
	private EnderecoEntity endereco;

	
	
	public PesquisadorEntity(InstituicaoEntity instituicao, EnderecoEntity endereco) {
		super();
		this.instituicao = instituicao;
		this.endereco = endereco;
	}

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
	

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}


}
