
public class Main {
	
	/* +---------------------------------------------
	 * | @author Isac Canedo
	 * +---------------------------------------------
	 */

	/*
	 * Which is the most reliable expression for testing whether the values of two string variables are the same?
	 * Qual é a expressão mais confiável para testar se os valores de duas variáveis de string são iguais?
	 * 
	 * 1 - nome.matches(nome1) ==> correct
	 * 2 - nome = nome1
	 * 3 - nome == nome1
	 * 4 - nome.equals(nome1)
	 */
	
	
	static String nome = "Isac";
	static String nome1 = "isac";
	
	public static void main(String[] args) {
		
		System.out.println(nome.matches(nome1)); // sim
		System.out.println(nome = nome1); // não
		System.out.println(nome == nome1); // não
		System.out.println(nome.equals(nome1)); // não

		
		
	}

}
