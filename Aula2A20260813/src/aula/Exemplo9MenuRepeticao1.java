package aula;

import java.util.Scanner;

public class Exemplo9MenuRepeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\tMenu\n1 - Cumprimento\n2 - Elogio\n3 - Despedida\n4 - Sair");
			opcao = teclado.nextInt();
			if(opcao == 1) {
				System.out.println("Olá!");
			} else if(opcao == 2) {
				System.out.println("Parabéns!");
			} else if(opcao == 3) {
				System.out.println("Tchau!");
			} else if(opcao != 4) {
				System.out.println("Opção inválida.");
			}
		} while(opcao != 4);

	}

}
