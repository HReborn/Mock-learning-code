package inicioAgenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionTest {

	@Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
	    InvalidDatabaseConnectorOptionException e = assertThrows(InvalidDatabaseConnectorOptionException.class, () -> {
	        DbConnector.initDatabaseConnectionPool("mockk");
	    });

	    String expectedMessage = "Invalid Database Option: mockk";
	    String actualMessage = e.getMessage();
	    assertEquals(actualMessage,expectedMessage);
	}
}
