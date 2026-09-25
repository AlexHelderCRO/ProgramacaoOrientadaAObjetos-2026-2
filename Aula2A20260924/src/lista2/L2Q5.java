package lista2;

import javax.swing.JOptionPane;

public class L2Q5 {

	public static void mover(int discos, char ori, char des, char aux) {
		if(discos == 0) {
			return;
		}
		mover(discos-1, ori, aux, des);
		System.out.println("Mover o disco "+discos+" da torre "+ori+" para torre "+des+".");
		mover(discos-1, aux, des, ori);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = JOptionPane.showInputDialog("Quantos discos serão movimentados?");
		int discos = Integer.parseInt(texto);
		mover(discos, 'A', 'C', 'B');
	}

}
