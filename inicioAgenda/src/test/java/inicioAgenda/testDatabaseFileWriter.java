package inicioAgenda;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

class testDatabaseFileWriter {
	private String filePath = "src/test/java/inicioAgenda/agendaDatabases.txt";

	@Test
	void checkIfFileAgendaDatabasesIsCreated() {
		DbConnector.createDatabaseFile(filePath);
		Path path = Paths.get(filePath);
		assertTrue(Files.exists(path));
		try {
			Files.delete(Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	@Test
	void checkIfFileContentsAreRight() {
		DbConnector.createDatabaseFile(filePath);
	}
}
