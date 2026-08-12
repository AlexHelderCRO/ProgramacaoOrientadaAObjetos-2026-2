package aula;

import javax.swing.JOptionPane;

public class Menu6SwitchStringJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcao = JOptionPane.showInputDialog("\tMenu\nCumprimento\nElogio\nDespedida\n");
		opcao = opcao.toLowerCase();
		switch(opcao) {
		case "cumprimento":
			JOptionPane.showMessageDialog(null, "Olá");
			break;
		case "elogio":
			JOptionPane.showMessageDialog(null, "Parabéns!");
			break;
		case "despedida":
			JOptionPane.showMessageDialog(null, "Tchau!");
			break;
		default :
			JOptionPane.showMessageDialog(null, "Opção inválida.");
		}

	}

}
