package aula;

import javax.swing.JOptionPane;

/**
 * Classe que demonstra o uso do JOptionPane.showInputDialog()
 */
public class FazLeituraGrafica {

	/**
	 * Método principal.
	 * Demonstra o uso do JoptopnPame.showinputDialgo();
	 * @param args ignorado também
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Digite algo:");
		
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto);
	}

}
