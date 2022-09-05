package inicioAgenda;

public class Main {
	public static final String menu = "\n\n"
			+ "Digite as informações na ordem solicitadas na mesma linha separadas entre espaços.\n"
			+ "Se a informação for nula, digite '-'. \n"
			+ "Exemplo: breno - +55(81)999030147 thehitman@hotmail.com -\n"
			+ "Informações não obrigatórias terão um '*' sinalizando.\n\n"
			+ "Selecione uma das opções abaixo: \n"
			+ "Dígito 0 - Fechar agenda\n"
			+ "Dígito 1 - Mostrar contato\n"
			+ "Dígito 2 - Adicionar contato\n"
			+ "Dígito 3 - Remover contato\n"
			+ "Dígito 4 - Mostrar todos os contatos\n\n"
			+ "Digite abaixo um dos dígitos disponíveis: ";
	
	public static void main(String[] args) {
		System.out.prinln("Estou no devLocal");
		Agenda agenda = new Agenda("listacontatos");
		boolean wantsToContinue = true;
		while (wantsToContinue) {
			System.out.println(menu);
			int userInput = Scan.getScan().nextInt();
			System.out.println();
			if (userInput == 0) {
				wantsToContinue = false; continue;
			}
			if (userInput == 1) {
				agenda.showContact(); continue;
			}
			if (userInput == 2) {
				agenda.addContact(); continue;
			}
			if (userInput == 3) {
				agenda.removeContact(); continue;
			}
			if (userInput == 4) {
				agenda.showAllContacts();
			}
		}
		Scan.getScan().close();
		DbConnector.closeDatabaseConnectionPool();
	}
}
