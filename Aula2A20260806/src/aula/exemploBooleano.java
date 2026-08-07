package aula;

import javax.swing.JOptionPane;

public class exemploBooleano {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Você está com fome? (sim / não)");
		boolean fome;
		if(texto.equals("sim")) {
			fome = true;
		} else {
			fome = false;
		}
		if(fome) {
			JOptionPane.showMessageDialog(null, "Vamos descer para o almoço.");
		} else if(!fome) {
			JOptionPane.showMessageDialog(null, "Vamos esperar um pouco.");
		}
	}
	
}
