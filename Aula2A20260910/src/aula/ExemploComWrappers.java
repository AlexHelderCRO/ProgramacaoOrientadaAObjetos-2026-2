package aula;

public class ExemploComWrappers {

	public static void main(String[] args) {
//		double a = 75;
//		double b = 0;
//		double c = Math.sqrt(-64);
//		System.out.println(c);
		char c = '´';
		if(Character.isLetter(c)) {
			System.out.println("É uma letra");
		} else if(Character.isDigit(c)) {
			System.out.println("É um algarismo");
		} else if(Character.isWhitespace(c)) {
			System.out.println("É um espaço em branco");
		} else {
			System.out.println("É um caractere especial");
		}
	}
}
