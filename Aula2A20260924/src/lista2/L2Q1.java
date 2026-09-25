package lista2;

import java.util.Iterator;
import java.util.Random;

public class L2Q1 {

	public static void main(String[] args) {
		// Geração dos valores aleatórios no vetor. 
		double[] vetor = new double[10];
		Random r = new Random();
		System.out.println("Números no vetor: \n");
		for (int i = 0; i < 10; i++) {
			vetor[i] = r.nextDouble();
			System.out.print(vetor[i]+"  ");
		}
		// Cálculo da média.
		double soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += vetor[i];
		}
		double media = soma/10;
		System.out.println("\n\nMédia dos valores: "+media);
		// Mostrar os maiores que a média.
		System.out.println("\n\nMaiores que a média:");
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > media) {
				System.out.print(vetor[i]+"  ");
			}
		}
		
	}

}
