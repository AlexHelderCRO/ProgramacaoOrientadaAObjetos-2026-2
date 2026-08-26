package aula;

import javax.swing.JOptionPane;

public class ExemploSobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showInputDialog("Digite algo:");
		JOptionPane.showInputDialog(null, "Digite algo:");
		JOptionPane.showInputDialog("Digite algo:", "Já digitei.");
		JOptionPane.showInputDialog(null, "Digite algo:", "Já digitei.");
		JOptionPane.showInputDialog(null, "Digite algo:", "Pergunta", JOptionPane.WARNING_MESSAGE);
		String[] opcoes = {"Distrito Federal", "Bahia", "Pará", "Santa Catarina", "Minas Gerais"};
		JOptionPane.showInputDialog(null, "Digite algo:", "Pergunta", JOptionPane.ERROR_MESSAGE, 
																				null, opcoes, null);
	}

}
