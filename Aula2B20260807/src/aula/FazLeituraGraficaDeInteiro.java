package aula;

import javax.swing.JOptionPane;

/**
 * Classe para mostrar o uso do Integer.parseInt()
 */
public class FazLeituraGraficaDeInteiro {

	/**
	 * Método principal.
	 * Demonstra o uso do Integer.parse Int
	 * @param args ignorado
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Digite um número:");
		int num = Integer.parseInt(texto);
		int dobro = num*2;
		JOptionPane.showMessageDialog(null, "O dobro é: "+dobro);

	}

}
