package model.dao.exercicio1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.vo.exercicio1.InstituicaoEntity;

public class InstituicaoDAO {

	public boolean existeRegistroPorCnpj(String cnpj) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;

		String query = "SELECT cnpj FROM instituicao WHERE cnpj = '" + cnpj + "'";

		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica  a existência  de Instituição por CNPJ.");
			System.out.println("Erro: " + e.getMessage());

		} finally {
			Banco.closeResultSet(resultado);
			Banco.closePreparedStatement(stmt);
			Banco.closeConnection(conn);

		}
		return false;
	}

	public int cadastrarInstituicaoDAO(InstituicaoEntity instituicaoEntity) {
		
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;

		String query = "INSERT INTO instituicao (nome, cnpj, bairro, rua, numero, cidade, estado) VALUES ('" + instituicaoEntity.getNome()
				+ "', '" + instituicaoEntity.getCnpj() 
				+ "', '" + instituicaoEntity.getBairro() 
				+ "', '" + instituicaoEntity.getRua()
				+ "', '" + instituicaoEntity.getNumero() 
				+ "', '" + instituicaoEntity.getCidade()
		        + "', '" + instituicaoEntity.getEstado() + "')";

		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao exercutar a Query de cadastro da Instituição");
			System.out.println("Erro:" + e.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}

		return resultado;
	}

	public boolean existeRegistroPorId(int id) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		ResultSet resultado = null;

		String query = "SELECT id FROM instituicao WHERE id = " + id;

		try {
			resultado = stmt.executeQuery(query);
			if (resultado.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query que verifica a existência de Instituição po Id.");
			System.out.println(e.getMessage());
		} finally {
			Banco.closeResultSet(resultado);
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}

		return false;
	}

	public int atualizarInstituicaoDAO(InstituicaoEntity instituicaoEntity) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;

		String query = "UPDATE instituicao SET nome = '"  + instituicaoEntity.getNome()
		+ "' , cnpj = '"  + instituicaoEntity.getCnpj() 
		+ "', bairro = '" + instituicaoEntity.getBairro() 
		+ "', rua = '" + instituicaoEntity.getRua()
		+ "', numero = '" + instituicaoEntity.getNumero() 
		+ "', cidade = '" + instituicaoEntity.getCidade()
        + "', estado = '" + instituicaoEntity.getEstado() + "' WHERE id = " + instituicaoEntity.getId();

		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de atualização dos dados da Instituição.");
			System.out.println(e.getMessage());

		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);

		}
		return resultado;
	}

	public int excluirInstituicaoDAO(InstituicaoEntity instituicaoEntity) {
		Connection conn = Banco.getConnection();
		Statement stmt = Banco.getStatement(conn);
		int resultado = 0;

		String query = "DELETE FROM instituicao WHERE id = " + instituicaoEntity.getId();

		try {
			resultado = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("Erro ao executar a Query de exclusão da Instituição.");
			System.out.println(e.getMessage());
		} finally {
			Banco.closeStatement(stmt);
			Banco.closeConnection(conn);
		}
		return resultado;
	}

}
