package aula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro fusca = new Carro(4);
		Carro ferrari = new Carro(100);
		fusca.acelerar();
		fusca.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println("Velocidade do fusca: "+fusca.consultarVelocimetro());
		System.out.println("Velocidade do ferrari: "+ferrari.consultarVelocimetro());
		fusca.frear();
		fusca.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println("Após frearem um pouco:");
		System.out.println("Velocidade do fusca: "+fusca.consultarVelocimetro());
		System.out.println("Velocidade do ferrari: "+ferrari.consultarVelocimetro());
		

	}

}
