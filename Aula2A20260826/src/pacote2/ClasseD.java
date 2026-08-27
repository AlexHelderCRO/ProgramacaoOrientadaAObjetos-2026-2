package pacote2;

import pacote1.*;

public class ClasseD {
	public static void main(String[] args) {
		ClasseA ca = new ClasseA();
		System.out.println(ca.valor1);
//		System.out.println(ca.valor2); // protegido: só pode ser acessado no mesmo pacote ou subclasse.
//		System.out.println(ca.valor3); // Visibilidade padrão: Só pode ser acessado no mesmo pacote.
//		System.out.println(ca.valor4); // Este membro é privado, só pode ser acessado na própria classe.
		ca.metodo1();
//		ca.metodo2();// protegido: só pode ser acessado no mesmo pacote ou subclasse.
//		ca.metodo3();// Visibilidade padrão: Só pode ser acessado no mesmo pacote.
//		ca.metodo4();// Este membro é privado, só pode ser acessado na própria classe.
		
//		ClasseB cb = new ClasseB();//Visibilidade padrão: Só pode ser acessado no mesmo pacote.
		
	}

}
