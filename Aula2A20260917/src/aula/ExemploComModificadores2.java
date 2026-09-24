package aula;

public class ExemploComModificadores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseFinal.CONSTANTE_PI = 7;
	}

}

//final class ClasseFinal {
class ClasseFinal {
//	public final abstract int soma(int x, int y);
	public static final double CONSTANTE_PI = 3.14159;
}

//class SubclasseFinal extends ClasseFinal {
////	public int soma(int a, int b) {
////		return a+b;
////	}
//}