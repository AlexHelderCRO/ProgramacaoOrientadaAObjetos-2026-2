package lista1;

import javax.swing.JOptionPane;

public class L1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Digite o ângulo.");
		int angulo = Integer.parseInt(texto);
		if(angulo == 0) {
			JOptionPane.showMessageDialog(null, "É um ângulo nulo.");
		} else if(angulo < 90) {
			JOptionPane.showMessageDialog(null, "É um ângulo agudo.");
		} else if(angulo == 90) {
			JOptionPane.showMessageDialog(null, "É um ângulo reto.");
		} else if(angulo < 180) {
			JOptionPane.showMessageDialog(null, "É um ângulo obtuso.");
		} else if(angulo == 180) {
			JOptionPane.showMessageDialog(null, "É um ângulo raso.");
		} else if(angulo < 360) {
			JOptionPane.showMessageDialog(null, "É um ângulo côncavo.");
		} else if(angulo == 360) {
			JOptionPane.showMessageDialog(null, "É um ângulo completo.");
		}
	
	}

}
