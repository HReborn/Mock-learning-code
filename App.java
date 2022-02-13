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
	public void App() {
		this.randoAtt = "Tu eres toba, sabia?";
	}
	public void App(String randoAtt) {
		this.randoAtt = randoAtt;
	}
	
	// seção dos métodos do objeto
	public void mostrarMsgDentro() {
		System.out.println(this.randoAtt);
	}
	
	// seção main onde é executada os bagulhos
	public static void main (String[] args) {
		App app = new App();
		app.mostrarMsgdentro;
	}
}
