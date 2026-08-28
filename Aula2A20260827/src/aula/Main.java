package aula;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Carro uno = new Carro();
//		uno.acelerar();
//		System.out.println("Velocidade do carro: "+uno.consultarVelocimetro());

		ContaCorrente conta = new ContaCorrente();
		conta.deposito(1500);
		System.out.println("O cliente tem no banco: "+conta.consultarSaldo());
		
		
	}

}
