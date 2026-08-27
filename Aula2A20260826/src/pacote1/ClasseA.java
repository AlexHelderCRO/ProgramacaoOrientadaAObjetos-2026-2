package pacote1;

public class ClasseA {
	public int valor1 = 1;
	protected int valor2 = 2;
	int valor3 = 3;
	private int valor4 = 4;

	public void metodo1() {
		System.out.println("método 1");
	}
	protected void metodo2() {
		System.out.println("método 2");
	}
	void metodo3() {
		System.out.println("método 3");
	}
	private void metodo4() {
		System.out.println("método 4");
	}
	
	public static void main(String[] args) {
		ClasseA ca = new ClasseA();
		System.out.println(ca.valor1);
		System.out.println(ca.valor2);
		System.out.println(ca.valor3);
		System.out.println(ca.valor4);
		ca.metodo1();
		ca.metodo2();
		ca.metodo3();
		ca.metodo4();
	}
}
