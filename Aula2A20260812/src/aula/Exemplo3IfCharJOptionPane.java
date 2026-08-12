package aula;

import javax.swing.JOptionPane;

public class Exemplo3IfCharJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Menu\nC - Cumprimento\nE - Elogio\nD - Despedida");
		char opcao = texto.charAt(0);
		opcao = Character.toUpperCase(opcao);
		if(opcao == 'C') {
			JOptionPane.showMessageDialog(null, "Olá!");
		} else if(opcao == 'E') {
			JOptionPane.showMessageDialog(null, "Parabéns!");
		} else if(opcao == 'D') {
			JOptionPane.showMessageDialog(null, "Tchau!");
		} else {
			JOptionPane.showMessageDialog(null, "Opção inválida.");
		}
//		if(opcao == 'C' || opcao == 'c') {
//			JOptionPane.showMessageDialog(null, "Olá!");
//		} else if(opcao == 'E' || opcao == 'e') {
//			JOptionPane.showMessageDialog(null, "Parabéns!");
//		} else if(opcao == 'D' || opcao == 'd') {
//			JOptionPane.showMessageDialog(null, "Tchau!");
//		} else {
//			JOptionPane.showMessageDialog(null, "Opção inválida.");
//		}
	}

}
