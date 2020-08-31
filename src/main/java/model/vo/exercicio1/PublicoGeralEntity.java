package model.vo.exercicio1;

public class PublicoGeralEntity extends PessoaEntity {

	private int avaliacaoAVacina;
	private int tipo;
	
	public PublicoGeralEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PublicoGeralEntity(int avaliacaoAVacina, int tipo) {
		super();
		this.avaliacaoAVacina = avaliacaoAVacina;
		this.tipo = tipo;
	}


	public int getAvaliacaoAVacina() {
		return avaliacaoAVacina;
	}

	public void setAvaliacaoAVacina(int avaliacaoAVacina) {
		this.avaliacaoAVacina = avaliacaoAVacina;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	
}
