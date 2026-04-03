public class App {
	// Atributo rando
	private String randoAtt;
	
	// seção get set do atributo/s rando
	public void setRandoAtt (String randoAtt) {
		this.randoAtt = randoAtt;
	}
	public String getRandoAtt () {
		return this.randoAtt;
	}
	
	// seção construtores do objeto

	public App() {
		this.randoAtt = "Tu eres toba, sabia?";
	}
	public App(String randoAtt) {
		this.randoAtt = randoAtt;
	}

	
	// seção dos métodos do objeto
	public void mostrarMsgDentro() {
		System.out.println(this.randoAtt);
	}
	
	// seção main onde é executada os bagulhos
	public static void main (String[] args) {
		App app = new App();
		app.mostrarMsgDentro();
		System.out.println("bagulho tá diferente");
		System.out.println("bagulho tá topzera");
		System.out.println("bagulho tá");
	}
}
