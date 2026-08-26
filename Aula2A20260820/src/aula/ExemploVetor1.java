package aula;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ExemploVetor1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner teclado = new Scanner(System.in);
		double[] vetor = new double[10];
		for(int i = 0; i < vetor.length; i++) {
//			System.out.println("Digite o próximo valor");
//			vetor[i] = teclado.nextInt();
			String texto = JOptionPane.showInputDialog("Digite o próximo valor:");
			vetor[i] = Integer.parseInt(texto);
		}
		System.out.println("\nValores digitados:");
		for(int i = 0; i < vetor.length; i++) {
//			System.out.print(vetor[i]);
			JOptionPane.showMessageDialog(null, vetor[i]);
		}
	}
}
