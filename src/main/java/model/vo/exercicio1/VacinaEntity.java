package model.vo.exercicio1;

import java.time.LocalDate;

public class VacinaEntity {

	private String paisDeOrigem;
	private int estagioDaPesquisa;
	private LocalDate dataInicioDaPesquisa;
	private PesquisadorEntity pesquisador;

	public VacinaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VacinaEntity(String paisDeOrigem, int estagioDaPesquisa, LocalDate dataInicioDaPesquisa,
			PesquisadorEntity pesquisador) {
		super();
		this.paisDeOrigem = paisDeOrigem;
		this.estagioDaPesquisa = estagioDaPesquisa;
		this.dataInicioDaPesquisa = dataInicioDaPesquisa;
		this.pesquisador = pesquisador;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public int getEstagioDaPesquisa() {
		return estagioDaPesquisa;
	}

	public void setEstagioDaPesquisa(int estagioDaPesquisa) {
		this.estagioDaPesquisa = estagioDaPesquisa;
	}

	public LocalDate getDataInicioDaPesquisa() {
		return dataInicioDaPesquisa;
	}

	public void setDataInicioDaPesquisa(LocalDate dataInicioDaPesquisa) {
		this.dataInicioDaPesquisa = dataInicioDaPesquisa;
	}

	public PesquisadorEntity getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(PesquisadorEntity pesquisador) {
		this.pesquisador = pesquisador;
	}

}
