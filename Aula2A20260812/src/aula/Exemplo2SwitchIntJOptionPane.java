package aula;

import javax.swing.JOptionPane;

public class Exemplo2SwitchIntJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Menu\n1 - Cumprimento\n2 - Elogio\n3 - Despedida");
		int opcao = Integer.parseInt(texto);
		switch(opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "Olá");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Parabéns!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Tchau!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida.");
		} 
	}

}
