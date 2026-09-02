package pacoteY;

import pacoteX.ClasseA;

public class ClasseC extends ClasseA {

	public static void main(String[] args) {
		ClasseC ca = new ClasseC();
		System.out.println(ca.valor1);
		System.out.println(ca.valor2);
//		System.out.println(ca.valor3);
//		System.out.println(ca.valor4);
		ca.metodo1();
		ca.metodo2();
//		ca.metodo3();
//		ca.metodo4();
	}

}
