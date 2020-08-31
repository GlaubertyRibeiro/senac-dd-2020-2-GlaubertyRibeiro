package model.vo.exercicio1;

public class VoluntarioEntity extends PessoaEntity {

	private boolean jaVacinado;
	private int avaliacaoAVacina;
	private boolean tipo;

	public VoluntarioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoluntarioEntity(boolean jaVacinado, int avaliacaoAVacina, int tipo_pessoa, boolean tipo) {
		super();
		this.jaVacinado = jaVacinado;
		this.avaliacaoAVacina = avaliacaoAVacina;
		this.tipo = tipo;
	}

	public boolean isJaVacinado() {
		return jaVacinado;
		
	}

	public void setJaVacinado(boolean jaVacinado) {
		this.jaVacinado = jaVacinado;
	}

	public int getAvaliacaoAVacina() {
		return avaliacaoAVacina;
	}

	public void setAvaliacaoAVacina(int avaliacaoAVacina) {
		this.avaliacaoAVacina = avaliacaoAVacina;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
		
}
