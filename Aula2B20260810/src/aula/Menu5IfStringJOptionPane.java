package aula;

import javax.swing.JOptionPane;

public class Menu5IfStringJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("\tMenu\nCumprimento\nElogio\nDespedida\n");
//		if(texto.equals("Cumprimento")) {
		if(texto.equalsIgnoreCase("Cumprimento")) {
			JOptionPane.showMessageDialog(null, "Olá!");
//		} else if(texto.equals("Elogio")) {
		} else if(texto.equalsIgnoreCase("Elogio")) {
			JOptionPane.showMessageDialog(null, "Parabéns!");
//		} else if(texto.equals("Despedida")) {
		} else if(texto.equalsIgnoreCase("Despedida")) {
			JOptionPane.showMessageDialog(null, "Tchau!");
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida.");
		} 
	}

}
