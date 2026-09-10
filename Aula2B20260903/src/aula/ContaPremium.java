package aula;

public class ContaPremium extends ContaCorrente {
	double limiteChequeEspecial = 10000;
	public void saque(double valor) {
		if(valor <= (saldo + limiteChequeEspecial)) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso.\nNovo saldo: "+saldo);
		} else {
			System.out.println("Saldo insuficiente.\nSaldo: "+saldo);
		}
 	}
}
