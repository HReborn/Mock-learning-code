package dsa1.introduction;

public class Main {
	public static void main(String[] args) throws Exception {
		long x = 1234;
		long y = 5678;
		int result = 7006652;
		
		GradeSchoolMultiplication gsMult = new GradeSchoolMultiplication();
		long gsMultResult = gsMult.multiply(x, y); 
		
		if (gsMultResult != result) {
			throw new Exception("Estás a brincar comigo trouxa? Resultado do grade school foi: " + gsMultResult + ", mas o resultado esperado era: " + result + ".");
		} else {
			System.out.println("Grade school funcionou perfeitamente com o resultado de: " + gsMultResult);
		}
	}	
}