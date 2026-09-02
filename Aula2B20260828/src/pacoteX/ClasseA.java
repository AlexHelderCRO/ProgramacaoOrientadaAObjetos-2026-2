package pacoteX;

public class ClasseA {
	public String valor1 = "valor público";
	protected String valor2 = "valor protegido";
	String valor3 = "valor padrão";
	private String valor4 = "valor privado";
	
	public void metodo1() {
		System.out.println("Método público.");
	}
	protected void metodo2() {
		System.out.println("Método protegido.");
	}
	void metodo3() {
		System.out.println("Método padrão.");
	}
	private void metodo4() {
		System.out.println("Método privado.");
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
