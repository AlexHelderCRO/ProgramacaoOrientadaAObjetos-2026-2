package aula;

import javax.swing.JOptionPane;

public class Recursividade {

	static int fatorial(int n) {
//	int fatorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n*fatorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
//		Recursividade rec = new Recursividade();
//		int fat = rec.fatorial(num);
		int fat = fatorial(num);
		JOptionPane.showMessageDialog(null, "O fatorial de "+num+" vale "+fat);
	}

}
