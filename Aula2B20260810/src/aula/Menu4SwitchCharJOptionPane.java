package aula;

import javax.swing.JOptionPane;

public class Menu4SwitchCharJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("\tMenu\nC - Cumprimento\nE - Elogio\nD - Despedida\n");
		char opcao = texto.charAt(0);
		switch(opcao) {
		case 'c':
		case 'C':
			JOptionPane.showMessageDialog(null, "Olá");
			break;
		case 'e':
		case 'E':
			JOptionPane.showMessageDialog(null, "Parabéns!");
			break;
		case 'd':
		case 'D':
			JOptionPane.showMessageDialog(null, "Tchau!");
			break;
		default :
			JOptionPane.showMessageDialog(null, "Opção inválida.");
		}

	}

}
