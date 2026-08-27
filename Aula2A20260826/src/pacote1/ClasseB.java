package pacote1;

class ClasseB {
	public static void main(String[] args) {
		ClasseA ca = new ClasseA();
		System.out.println(ca.valor1);
		System.out.println(ca.valor2);
		System.out.println(ca.valor3);
//		System.out.println(ca.valor4); // Este membro é privado, só pode ser acessado na própria classe.
		ca.metodo1();
		ca.metodo2();
		ca.metodo3();
//		ca.metodo4(); // Este membro é privado, só pode ser acessado na própria classe.
	}

}
