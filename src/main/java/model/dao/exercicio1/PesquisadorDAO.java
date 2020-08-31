package model.dao.exercicio1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.vo.exercicio1.EnderecoEntity;
import model.vo.exercicio1.InstituicaoEntity;
import model.vo.exercicio1.PesquisadorEntity;

public class PesquisadorDAO {

	public boolean existeRegistroPesquisadorPorIdInstituicao(int id) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;

		String query = "SELECT id_instituicao FROM pesquisador WHERE id_instituicao = " + id;

		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica  a existência  de Pesquisador por Instituição.");
			System.out.println("Erro: " + e.getMessage());

		} finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);

		}
		return false;
	}

	public int cadastrarPesquisadorDAO(PesquisadorEntity pesquisadorEntity) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;
		EnderecoEntity EnderecoEntity = new EnderecoEntity();

		String query = "INSERT INTO pesquisador (nome, id_instituicao, datanascimento, sexo, cpf, rua, numero, cidade, bairro, estado) VALUES ('"
		        + pesquisadorEntity	.getNome()
				+ "', " + pesquisadorEntity.getInstituicao().getId()
				+ ", '" + pesquisadorEntity.getDataNascimento()
				+ "', '" + pesquisadorEntity.getSexo()
				+ "', '" + pesquisadorEntity.getCpf()
				+ "', '" + pesquisadorEntity.getEndereco().getRua()
				+ "', '" + pesquisadorEntity.getEndereco().getNumero()
				+ "', '" + pesquisadorEntity.getEndereco().getCidade()
				+ "', '" + pesquisadorEntity.getEndereco().getBairro()
		        + "', '" + pesquisadorEntity.getEndereco().getEstado() + "')";

		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao exercutar a Query de cadastro da Pesquisador");
			System.out.println("Erro:" + e.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}

		return resultado;
	}

}
