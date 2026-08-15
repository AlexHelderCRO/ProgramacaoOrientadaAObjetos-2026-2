package revisao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploLeia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite um número inteiro:");
//		int inteiro = teclado.nextInt();
//		System.out.println("Digite um número real:");
//		double real = teclado.nextDouble();
//		System.out.println("Digite um texto:");
//		teclado.nextLine();
//		String texto = teclado.nextLine();
		String texto = JOptionPane.showInputDialog("Digite um texto:");
		texto = JOptionPane.showInputDialog("Digite um número:");
		int numero = Integer.parseInt(texto);
	}

}
