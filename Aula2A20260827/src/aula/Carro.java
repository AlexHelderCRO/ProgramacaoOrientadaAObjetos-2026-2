package aula;

public class Carro {
	private double velocidade;
	
	public void acelerar() {
		velocidade += 10;
	}
	public void frear() {
		velocidade /= 2;
	}
	public double consultarVelocimetro() {
		return velocidade;
	}
}
