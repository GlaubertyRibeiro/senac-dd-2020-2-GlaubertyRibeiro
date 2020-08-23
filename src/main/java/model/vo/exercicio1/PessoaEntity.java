package model.vo.exercicio1;

import java.time.LocalDate;

public abstract class PessoaEntity {

	private int id;
	private int tipo;
	private String nome;
	private LocalDate dataNascimento;
	private int sexo;
	private String cpf;
	private EnderecoEntity endereco;
	private int avaliacaoAVacina;

	public PessoaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}


	public int getAvaliacaoAVacina() {
		return avaliacaoAVacina;
	}

	public void setAvaliacaoAVacina(int avaliacaoAVacina) {
		this.avaliacaoAVacina = avaliacaoAVacina;
	}
	
}
