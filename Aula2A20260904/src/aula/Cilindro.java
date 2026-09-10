package aula;

public class Cilindro extends Circulo {
	double altura;
	
	public double calculaVolume() {
		double areaDaBase = calculaArea();
		return areaDaBase*altura;
	}
}
