package aula;

import java.util.Iterator;
import java.util.Random;

public class ExemploRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random geradorDeAleatorios = new Random();
		for(int i = 0; i < 10; i++) {
			double aleatorio = 25*geradorDeAleatorios.nextDouble();
			System.out.println("Número aleatório: "+aleatorio);
		}
	}

}
