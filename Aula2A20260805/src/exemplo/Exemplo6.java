package exemplo;

import javax.swing.JOptionPane;

public class Exemplo6 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Prazer em conhecer, "+nome+".");

	}

}
