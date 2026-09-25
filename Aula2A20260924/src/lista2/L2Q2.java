package lista2;

import java.util.Scanner;

public class L2Q2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a velocidade de lançamento.");
		double velocidade = teclado.nextDouble();
		System.out.println("Digite o ângulo de lançamento.");
		double angulo = teclado.nextDouble();
		
		double gravidade = 10;
		
		angulo = Math.toRadians(angulo); // Convertendo de graus para radianos.

		double altura = Math.pow(velocidade, 2)*Math.pow(Math.sin(angulo), 2)/(2*gravidade);
		
		double distancia = Math.pow(velocidade, 2)*Math.sin(2*angulo)/gravidade;
		
		double tempo = 2*velocidade*Math.sin(angulo)/gravidade;
		
		System.out.println("Altura alcaçada: "+altura);
		System.out.println("Distância percorrida: "+distancia);
		System.out.println("Tempo de vôo: "+tempo);
	}

}
