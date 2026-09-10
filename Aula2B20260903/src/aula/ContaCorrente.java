package aula;

public class ContaCorrente {
	double saldo;
	public void deposito(double valor) {
		saldo += valor;
		System.out.println("Deposito realizado com sucesso.\nNovo saldo: "+saldo);
	}
	public void saque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso.\nNovo saldo: "+saldo);
		} else {
			System.out.println("Saldo insuficiente.\nSaldo: "+saldo);
		}
	}
}
