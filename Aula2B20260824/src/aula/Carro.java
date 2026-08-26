package aula;

public class Carro {
	int velocidade;
	int potencia;
	
	public Carro(int pot) {
		potencia = pot;
	}
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade /= 2;
	}
	
	int consultarVelocimetro() {
		return velocidade;
	}
}
