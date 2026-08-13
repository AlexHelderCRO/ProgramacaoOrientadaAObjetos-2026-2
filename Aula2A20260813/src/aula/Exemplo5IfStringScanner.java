package aula;

import java.util.Scanner;

public class Exemplo5IfStringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("\tMenu\nDigite uma das opções abaixo:\nCumprimento\nElogio\nDespedida");
		String opcao = teclado.nextLine();
//		opcao = opcao.toLowerCase();
//		if(opcao.equals("cumprimento")) {
		if(opcao.equalsIgnoreCase("cumprimento")) {
			System.out.println("Olá!");
//		} else if(opcao.equals("elogio")) {
		} else if(opcao.equalsIgnoreCase("elogio")) {
			System.out.println("Parabéns!");
//		} else if(opcao.equals("despedida")) {
		} else if(opcao.equalsIgnoreCase("despedida")) {
			System.out.println("Tchau!");
		} else {
			System.out.println("Opção inválida.");
		}
	}

}
