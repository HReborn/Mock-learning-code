package inicioAgenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContatoAPI {
	private ResultSet resultSet;
	private Contato[] contatos;
	
	ContatoAPI(){
		
	}
	
	public Contato[] doPreparedQuery(String QUERY, String[] values, int qtdVar) {
		try (Connection connection = DbConnector.getDataSource().getConnection();
				PreparedStatement statement = connection.prepareStatement(QUERY)) {
			this.setStringsOnPreparedStatement(qtdVar, statement, values);
			this.resultSet = statement.executeQuery();
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		} finally {

		}
		return contatos;
	}
	
	public Contato[] doSimpleQuery(String QUERY) {
		try (Connection connection = DbConnector.getDataSource().getConnection();
				Statement statement = connection.createStatement(
							    ResultSet.TYPE_SCROLL_INSENSITIVE,
							    ResultSet.CONCUR_READ_ONLY)) {
			this.resultSet = statement.executeQuery(QUERY);
			this.convertResultSetToContato();
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		} finally {

		}
		return contatos;
	}
	
	private void createContatosVar() {
		// create the variable after getting the total number of rows from the resultSet
		try {
			this.resultSet.last();
			this.contatos = new Contato[this.resultSet.getRow()];
			this.resultSet.beforeFirst();
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	private void setStringsOnPreparedStatement(int qtdVar, PreparedStatement statement, String[] values) {
		for (int i = 0; i > qtdVar; i++) {
			try {
				statement.setString(i, values[i]);
			} catch (SQLException e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
	}
	
	private void convertResultSetToContato() {
		// always re-create the contatos variable based on the number of rows
		this.createContatosVar();
		try {
			for (int i = 0; this.resultSet.next(); i++) {
				contatos[i] = new Contato(
				this.resultSet.getInt(1),
				this.resultSet.getString("first_name"),
				this.resultSet.getString("last_name"),
				this.resultSet.getString("phone"),
				this.resultSet.getString("email"),
				this.resultSet.getString("additional_info"));
			}
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		} finally {}
	}
}
