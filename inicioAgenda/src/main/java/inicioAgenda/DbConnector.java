package inicioAgenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DbConnector {

	private static final String DATABASE_PASSWORD = "8$C4YBh7t3x5idx4AbIgdAngOfAmilY@!";
	private static final String DATABASE_USER = "postgres";
	private static HikariDataSource dataSource;
	private static String[] availableDatabases;
	
	DbConnector() {
	}
	
	static boolean databaseExists(String database) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("agendaDatabases.txt"));
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				availableDatabases[i] = line;i++;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			new FileNotFoundException("Erro. Arquivo agendaDatabases.txt não achado. Criando arquivo com as databases padrão.");
			e.printStackTrace();
			createDatabaseFile("src/main/resources/agendaDatabases.txt");
			DbConnector.databaseExists(database);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void createDatabaseFile(String filePath) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
			writer.write("mock_database_to_test_agenda\n"
					+ "lista_contatos");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Only purpose is to test the program using a mock database
	public static void initDatabaseConnectionPool(String database) throws InvalidDatabaseConnectorOptionException { 
		if (!(database.equals("mock_database_to_test_agenda") | database.equals("lista_contatos"))) {
			throw new InvalidDatabaseConnectorOptionException(database);
		}
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:postgresql://localhost:5432/" + database);
		config.setUsername(DATABASE_USER);
		config.setPassword(DATABASE_PASSWORD);
		dataSource = new HikariDataSource(config);
	}
	
	public static void closeDatabaseConnectionPool() {
		dataSource.close();
	}
	
	public static HikariDataSource getDataSource() throws SQLException {
		return dataSource;
	}	
}
