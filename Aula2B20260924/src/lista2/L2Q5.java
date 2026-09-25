package lista2;

import java.util.Scanner;

public class L2Q5 {

	public static void mover(int discos, char orig, char dest, char aux) {
		if(discos == 0) {
			return;
		}
		mover(discos-1, orig, aux, dest);
		System.out.println("Mover disco "+discos+" da torre "+orig+" para torre "+dest+".");
		mover(discos-1, aux, dest, orig);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade de discos.");
		int discos = teclado.nextInt();
		
		mover(discos, 'A', 'C', 'B');
	}

}
