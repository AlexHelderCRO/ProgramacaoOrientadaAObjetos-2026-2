package aula;

import java.util.Scanner;

public class Menu3IfCharScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("\tMenu\nC - Cumprimento\nE - Elogio\nD - Despedida\n");
		String texto = teclado.nextLine();
		char opcao = texto.charAt(0);
		opcao = Character.toUpperCase(opcao);
//		if(opcao == 'C' || opcao == 'c') {
		if(opcao == 'C') {
			System.out.println("Olá!");
//		} else if(opcao == 'E' || opcao == 'e') {
		} else if(opcao == 'E') {
			System.out.println("Parabéns!");
//		} else if(opcao == 'D' || opcao == 'd') {
		} else if(opcao == 'D') {
			System.out.println("Tchau!");
		} else {
			System.out.println("Opção inválida.");
		}
		
	}

}
