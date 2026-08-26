package aula;

import javax.swing.JFrame;

public class ExemploComVetor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciou o programa");
		JFrame[] janelas = new JFrame[100000000];
		System.out.println("Criou o vetor");
		for (int i = 0; i < janelas.length; i++) {
			janelas[i] = new JFrame("janela "+i);
		}
		System.out.println("Inicializou cada janela");

	}

}
