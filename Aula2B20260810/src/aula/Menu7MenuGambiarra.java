package aula;

import javax.swing.JOptionPane;

public class Menu7MenuGambiarra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] opcoes = {"Cumprimento", "Elogio", "Despedida"};
		int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
		if(opcao == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Olá");
		} else if(opcao == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Parabéns!");
		} else if(opcao == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Tchau!");
		}
	}

}
