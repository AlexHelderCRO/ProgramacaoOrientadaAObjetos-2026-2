package exemplo;

import javax.swing.JOptionPane;

public class Exemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Digite um número");
		int valor = Integer.parseInt(texto);
		int dobro = valor*2;
		JOptionPane.showMessageDialog(null, "O dobro vale "+dobro);

	}

}
