package aula;

import java.util.Random;

public class Exemplo3Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int base = 4;
//		int expoente = 5;
//		double potencia = Math.pow(base, expoente);
//		System.out.println(base+" elevado a "+expoente+" vale: "+potencia);
		
//		double raio = 7;
//		double area = Math.PI * Math.pow(raio, 2);
//		System.out.println("A área do circulo tem "+area+"m².");
		
//		double quebrado = 4.99999999999999;
//		double arredondado = Math.floor(quebrado);
//		System.out.println("Arredondado fica: "+arredondado);
		
//		double angulo = 30;
//		angulo = Math.toRadians(angulo);
//		double seno = Math.sin(angulo);
//		System.out.println("O seno deu: "+seno);
		
//		double seno = 0.5;
//		double angulo = Math.asin(seno);
//		angulo = Math.toDegrees(angulo);
//		System.out.println("O ângulo foi de: " + angulo);
		
		Random gerador = new Random();
		double aleatorio = gerador.nextDouble();
		System.out.println("Aleatório: "+aleatorio);
	}

}
