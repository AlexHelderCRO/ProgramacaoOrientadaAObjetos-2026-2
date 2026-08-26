package aula;

public class Carro {
	double velocidade;
	
	void acelerar(double valor) {
		velocidade += valor;
		System.out.println("Executou o primeiro");
	}
	void acelerar() {
		velocidade++;
		System.out.println("Executou o segundo");
	}
	void acelerar(String valor) {
		velocidade += Double.parseDouble(valor);
		System.out.println("Executou o terceiro");
	}
	void frear(double valor) {
		velocidade -= valor;
	}
	
	double consultarVelocimetro() {
		return velocidade;
	}

}
