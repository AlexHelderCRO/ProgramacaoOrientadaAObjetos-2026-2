package aula;

public class ContaCorrente {
	private double saldo;
	
	public void deposito(double valor) {
		saldo += valor;
	}
	public void saque(double valor) {
		saldo -= valor;
	}
	public double consultarSaldo() {
		return saldo;
	}
	public void realizarPIX(ContaCorrente destinatario, double valor) {
		saldo -= valor;
		destinatario.receberPIX(valor);
	}
	private void receberPIX(double valor) {
		saldo += valor;
	};
}
