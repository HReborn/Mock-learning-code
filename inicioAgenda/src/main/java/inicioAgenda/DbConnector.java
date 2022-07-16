package inicioAgenda;

import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DbConnector {

	private static final String DATABASE_PASSWORD = "8$C4YBh7t3x5idx4AbIgdAngOfAmilY@!";
	private static final String DATABASE_USER = "postgres";
	private static HikariDataSource dataSource;
	
	DbConnector() {
	}
	
	// Only purpose is to test the program using a mock database
	public static void initDatabaseConnectionPool(String database) throws InvalidDatabaseConnectorOptionException { 
		if (!(database.equals("mock") | database.equals("listacontatos"))) {
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
