package inicioAgenda;

import java.net.URI;
import java.net.URISyntaxException;

public class test {

	public static void main(String[] args) {
		try {
			URI dbUri = new URI(System.getenv("HEROKU_POSTGRESQL_RED"));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

