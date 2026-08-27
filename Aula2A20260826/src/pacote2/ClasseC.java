package pacote2;

import pacote1.*;

public class ClasseC extends ClasseA { // herança
	public static void main(String[] args) {
		ClasseC ca = new ClasseC();
		System.out.println(ca.valor1);
		System.out.println(ca.valor2);
//		System.out.println(ca.valor3);// Visibilidade padrão: Só pode ser acessado no mesmo pacote.
//		System.out.println(ca.valor4);// Este membro é privado, só pode ser acessado na própria classe.
		ca.metodo1();
		ca.metodo2();
//		ca.metodo3();// Visibilidade padrão: Só pode ser acessado no mesmo pacote.
//		ca.metodo4();// Este membro é privado, só pode ser acessado na própria classe.
	}

}
