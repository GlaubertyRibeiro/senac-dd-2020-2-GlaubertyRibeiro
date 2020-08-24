package model.vo.exercicio1;

public class InstituicaoEntity extends EnderecoEntity{

	private int id;
	private String nome;
	private String cnpj;
	private EnderecoEntity endereco;

	public InstituicaoEntity(int id, String nome, String cnpj, EnderecoEntity endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public InstituicaoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	public void imprimir() {
		System.out.printf("\n%3d  %-30s  %-15s  %-20s  %-20s  %-10s  %-20s  %-30s \n",
				this.getId(),
				this.getNome(),
				this.getCnpj(),
				this.getBairro(),
				this.getRua(),
				this.getNumero(),
				this.getCidade(),
				this.getEstado());
		
	}

}
