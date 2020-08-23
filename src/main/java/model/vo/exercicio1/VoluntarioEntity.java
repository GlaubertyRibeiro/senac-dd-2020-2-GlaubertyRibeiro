package model.vo.exercicio1;

public class VoluntarioEntity extends PessoaEntity {

	private boolean foiVacinado;

	public VoluntarioEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isFoiVacinada() {
		return foiVacinado;
	}

	public void setFoiVacinada(boolean foiVacinado) {
		this.foiVacinado = foiVacinado;
	}

}
