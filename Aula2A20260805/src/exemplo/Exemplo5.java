package exemplo;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número: ");
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
//		String texto = teclado.nextLine();
//		double real = teclado.nextDouble();
		teclado.close();
		int dobro = valor*2;
		System.out.println("O dobro vale: "+dobro);
	}

}
