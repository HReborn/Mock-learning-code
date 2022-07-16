package inicioAgenda;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Agenda {
	
	private String QUERY;
	private Contato[] result;
	private ContatoAPI contatos;
	
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String additionalInfo;
	private String database;
	private String databaseTable;
	
	public Agenda(String database) {
		try {
			DbConnector.initDatabaseConnectionPool(database);
		} catch (InvalidDatabaseConnectorOptionException e) {
			e.printStackTrace();
		}
		this.contatos = new ContatoAPI();
		switch (database) {
		case "listacontatos": 
			this.database = database;
			this.databaseTable = "lista_contatos"; break;
		case "mock": 
			this.database = database;
			this.databaseTable = "mock"; break;
		}
	}

	public void showAllContacts() {
		QUERY = "SELECT * FROM " + databaseTable;
		result = contatos.doSimpleQuery(QUERY);
		resultPrint();
	}
	
	public void showContact() {
		System.out.println("\n Digite abaixo as informações necesárias: ");
		System.out.println("Primeiro nome, Último nome*.");
		getAndSetUserInputOn(new String[] {"firstName", "lastName"});
		if (isEmpty(lastName)) {
			this.QUERY = "SELECT * additiona_info FROM lista_contatos WHERE first_name = ?";
		} else {
			this.QUERY = "SELECT * FROM lista_contatos WHERE first_name = ? AND last_name = ?";
		}
	}
	
	public void addContact() {
		boolean userWantsToTryAgain = true;
		while (userWantsToTryAgain) {
			System.out.println("\n Digite abaixo as informações necessárias: ");
			System.out.println("Primeiro nome, Último nome*, Telefone, Email*, Informação adicional*");
			getAndSetUserInputOn(new String[] {"firstName", "lastName", "phone", "email", "additionalInfo"});
			System.out.println("\n As informações colocadas estão corretas? Digite Y/N.");
			System.out.println(firstName + ", " + lastName + ", " + phone + ", " + email + ", " + additionalInfo + ".");
			String userConfirmation = Scan.getScan().next();
			if (userConfirmation.equalsIgnoreCase("N")) {
				// se as informações inseridas estiverem erradas pergunta ao usuário se ele quer tentar denovo
				System.out.println("\n Você deseja tentar inserir as informações novamente? Digite Y/N.");
				userConfirmation = Scan.getScan().next();
				if (userConfirmation.equalsIgnoreCase("N")) {
					// e se o usuário não quiser tentar denovo, quebra o loop esse loop atual e logo em seguida vai voltar à tela inicial
					System.out.println("\n Voltando à tela incial.");
					userWantsToTryAgain = false;
					break;
				}
			}
		}
		this.QUERY = "INSERT INTO lista_contatos(first_name, last_name, phone, email, additional_info) VALUES(?, ?, ?, ?, ?)";
	}
	
	public void removeContact() {
		System.out.println("\n Digite abaixo as informações necesárias: ");
		System.out.println("Primeiro nome, Telefone.");
		getAndSetUserInputOn(new String[] {"firstName", "phone"});
		this.QUERY = "DELETE FROM lista_contatos WHERE first_name = ? AND phone = ?";
	}
	
	private boolean isEmpty(String field) {
		// the program tells the user to input '-' if the input is null.
		if (field.equals("-")) {
			return true;
		} else {
			return false;
		}
	}
	
	private void resultPrint() {
		for(int i = 0; i < result.length; i++ )
			System.out.println(result[i].toString());
	}
	
	private void getAndSetUserInputOn(String[] inputs) {
		if (contains("firstName", inputs)) {
			this.firstName = Scan.getScan().next();
		}
		if (contains("lastName", inputs)) {
			this.lastName = Scan.getScan().next();
		}
		if (contains("phone", inputs)) {
			this.phone = Scan.getScan().next();
		}
		if (contains("email", inputs)) {
			this.email = Scan.getScan().next();
		}
		if (contains("additionalInfo", inputs)) {
			this.additionalInfo = Scan.getScan().next();
		}
	}
	
	private boolean contains(String input, String[] inputs) {
		return Arrays.stream(inputs).anyMatch(input::equals);
	}
}
