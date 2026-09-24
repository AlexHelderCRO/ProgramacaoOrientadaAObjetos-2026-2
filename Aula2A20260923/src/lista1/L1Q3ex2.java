package lista1;

import javax.swing.JOptionPane;

public class L1Q3ex2 {

	public static void main(String[] args) {
		String dist = JOptionPane.showInputDialog("Digita a distância.");
		String tem = JOptionPane.showInputDialog("Digite o tempo.");
		double distancia = Double.parseDouble(dist);
		double tempo = Double.parseDouble(tem);
		double velocidade = distancia/tempo;
		JOptionPane.showMessageDialog(null, "A velocidade foi "+velocidade+" km/h.");
	}

}
