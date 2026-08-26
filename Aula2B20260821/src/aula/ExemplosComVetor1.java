package aula;

import javax.swing.JOptionPane;

public class ExemplosComVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vetor = new double[12];
		for (int i = 0; i < vetor.length; i++) {
			String texto = JOptionPane.showInputDialog("Digite o próximo valor");
			vetor[i] = Integer.parseInt(texto);
		}
		
		String texto = "Valores recebidos:\n";
		for (int i = 0; i < vetor.length; i++) {
			texto += vetor[i]+" ";
		}
		JOptionPane.showMessageDialog(null, texto);
//		JOptionPane.showMessageDialog(null, "Valores recebidos:");
//		for (int i = 0; i < 8; i++) {
//			JOptionPane.showMessageDialog(null, vetor[i]);
//		}

	}

}
