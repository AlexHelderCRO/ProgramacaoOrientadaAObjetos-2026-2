package aula;

public class ExemploComClasses {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		Carro ferrari = new Carro();
		fusca.acelerar(10);
		fusca.acelerar(5);
		ferrari.acelerar(60);
		System.out.println("Velocidade do fusca: "+fusca.consultarVelocimetro());
		System.out.println("Velocidade da ferrari: "+ferrari.consultarVelocimetro());
	}

}
