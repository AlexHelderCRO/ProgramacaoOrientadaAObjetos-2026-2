package aula;

import java.util.Scanner;

public class Menu2SwitchInteiroScanner {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("\tMenu\n1 - Cumprimento\n2 - Elogio\n3 - Despedida\n");
		int opcao = teclado.nextInt();
		switch(opcao) {
		case 1:
				System.out.println("Olá!");
				break;
		case 2:
				System.out.println("Parabéns!");
				break;
		case 3:
				System.out.println("Tchau!");
				break;
		default :
				System.out.println("Opção inválida.");
		}

	}

}
