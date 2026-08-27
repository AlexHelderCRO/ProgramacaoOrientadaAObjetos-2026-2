package aula;

import javax.swing.JOptionPane;

public class ExemploComRecursividade {

	static int fatorial(int n) {
//	int fatorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n*fatorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
//		ExemploComRecursividade objeto = new ExemploComRecursividade();
//		int fat = objeto.fatorial(n);
		int fat = fatorial(n);
		JOptionPane.showMessageDialog(null, "O fatorial de "+n+" é "+fat);
	}

}
