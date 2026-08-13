package aula;

import javax.swing.JOptionPane;

public class Exemplo7MenuBunitinho {
	public static void main(String[] args) {
		String[] opcoes = {"Cumprimento", "Elogio", "Despedida"};
		int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
		if(opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Olá!");
		} else if(opcao == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Parabéns!");
		} else if(opcao == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Tchau!");
		}
	}
}
