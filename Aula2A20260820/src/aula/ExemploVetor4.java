package aula;

import javax.swing.JFrame;

public class ExemploVetor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciou o programa");
		JFrame[] janelas = new JFrame[123456789];
		System.out.println("Inicializou o vetor.");
		for(int i = 0; i < janelas.length; i++) {
			janelas[i] = new JFrame("janela"+i);
		}
		System.out.println("O programa terminou com sucesso.");
	}

}
