package aula;

import javax.swing.JOptionPane;

public class Exemplo10MenuRepeticao2 {

	public static void main(String[] args) {
		String opcao;
		do {
			opcao = JOptionPane.showInputDialog
						("Menu\nDigite uma das opções abaixo:\nCumprimento\nElogio\nDespedida\nSair");
			opcao = opcao.toLowerCase();
			switch (opcao) {
			case "cumprimento":
				JOptionPane.showMessageDialog(null, "Olá!");
				break;
			case "elogio":
				JOptionPane.showMessageDialog(null, "Parabéns!");
				break;
			case "despedida":
				JOptionPane.showMessageDialog(null, "Tchau!");
				break;
			case "sair":
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			}
		} while(!opcao.equals("sair"));

	}

}
