package aula;

import java.util.Scanner;

public class Exemplo4SwitchCharScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("\tMenu\nC - Cumprimento\nE - elogio\nD - Despedida");
		String texto = teclado.nextLine();
		char opcao = texto.charAt(0);
//		opcao = Character.toLowerCase(opcao);
		switch(opcao) {
		case 'c':
		case 'C':
			System.out.println("Olá!");
			break;
		case 'e':
		case 'E':
			System.out.println("Parabéns!");
			break;
		case 'd':
		case 'D':
			System.out.println("Tchau!");
		default:
			System.out.println("Opção inválida.");
		}
	}

}
