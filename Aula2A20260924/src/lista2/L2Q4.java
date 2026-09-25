package lista2;

import javax.swing.JOptionPane;

public class L2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Digite uma palavra ou frase:");
		frase = frase.toLowerCase(); // Coloco todas as letras em minusculo para só precisar comparar com minusculo.
		int contadorDeVogais = 0;
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contadorDeVogais++;
			}
		}
		JOptionPane.showMessageDialog(null, "A frase tem "+contadorDeVogais +" vogais.");
	}

}
