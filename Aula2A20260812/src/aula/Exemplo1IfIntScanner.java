package aula;

import java.util.Scanner;

public class Exemplo1IfIntScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("\tMenu\n1 - Cumprimento\n2 - Elogio\n3 - Despedida");
		int opcao = teclado.nextInt();
		if(opcao == 1) {
			System.out.println("Olá!");
		} else if(opcao == 2) {
			System.out.println("Parabéns!");
		} else if(opcao == 3) {
			System.out.println("Tchau!");
		} else {
			System.out.println("Opção inválida.");
		}
	}

}
