package lista1;

import javax.swing.JOptionPane;

public class L1Q4 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius.");
		double tempCelsius = Double.parseDouble(texto);
		double tempFahrenheit = 9*tempCelsius/5 + 32;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é de: "+tempFahrenheit+"° F.");
	}
}
