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

}
