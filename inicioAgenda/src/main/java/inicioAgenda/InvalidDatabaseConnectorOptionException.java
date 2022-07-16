package inicioAgenda;

public class InvalidDatabaseConnectorOptionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1629245138670673708L;
	private String isMockDatabase;
	
	InvalidDatabaseConnectorOptionException(String isMockDatabase) {
		this.isMockDatabase = isMockDatabase;
	}
	@Override
	public String getMessage() {
		return "Invalid Database Option: " + isMockDatabase;
	}	
}
