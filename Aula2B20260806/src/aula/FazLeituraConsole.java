package aula;

import java.util.Scanner;

public class FazLeituraConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome");
		String nome = teclado.nextLine();
		System.out.println("Digite a idade:");
		int idade = teclado.nextInt();
		System.out.println("Seu nome é "+nome+" e você tem "+idade+" anos.");
	}

}
