package aula;

import javax.swing.JOptionPane;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "Exemplo";
		System.out.println("Tamanho do texto: "+texto.length());
		System.out.println("Primeira letra do texto: "+texto.charAt(0));
		System.out.println("Texto gritado: "+texto.toUpperCase());
		String[] opcoes = {"Digitei","Escrevi","Escrevinhei" };
		JOptionPane.showInputDialog(null, "Digite algo:");
		JOptionPane.showInputDialog("Digite algo:");
		JOptionPane.showInputDialog("Digite algo:", "Já digitei");
		JOptionPane.showInputDialog(null, "Digite algo:", "Já digitei.");
		JOptionPane.showInputDialog(null, "Digite algo:", "Pergunta", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showInputDialog(null, "Digite algo:", "Pergunta", JOptionPane.WARNING_MESSAGE, null, opcoes ,null);
	}

}
