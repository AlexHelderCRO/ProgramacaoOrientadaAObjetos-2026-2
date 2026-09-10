package ex;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClasseExemplo {

	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "Olá, mundo!");
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		System.out.println(x);
	}

}
