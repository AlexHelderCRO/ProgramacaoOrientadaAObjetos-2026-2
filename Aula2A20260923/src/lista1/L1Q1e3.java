package lista1;

import java.util.Scanner;

public class L1Q1e3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a distância entre as cidades.");
		double distancia = teclado.nextDouble();
		System.out.println("Digita o tempo gasto na viagem.");
		double tempo = teclado.nextDouble();
		double velocidadeMedia = distancia/tempo;
		System.out.println("A velocidade média nesta viagem foi de "+velocidadeMedia+" km/h.");
	}

}
