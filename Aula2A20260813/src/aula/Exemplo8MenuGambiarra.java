package aula;

import javax.swing.JOptionPane;

public class Exemplo8MenuGambiarra {

	public static void main(String[] args) {
		String[] opcoes = {"Cumprimento", "Elogio", "Despedida", "Interjeição", "Xingamento"};
		int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
		if(opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Olá!");
		} else if(opcao == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Parabéns!");
		} else if(opcao == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Tchau!");
		} else if(opcao == JOptionPane.CANCEL_OPTION+1) {
			JOptionPane.showMessageDialog(null, "Ai, Caramba!");
		} else if(opcao == JOptionPane.CANCEL_OPTION+2) {
			JOptionPane.showMessageDialog(null, "PONTE QUE PARTIU!!!!");
		}
	}

}
