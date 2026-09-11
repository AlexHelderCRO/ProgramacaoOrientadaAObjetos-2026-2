package aula;

import javax.swing.JOptionPane;

public class ContaPrime extends ContaCorrente {
	private double limiteChequeEspecial = 10000;
	public void sacar(double valor) {
		saldo += limiteChequeEspecial;
		super.sacar(valor);
		saldo -= limiteChequeEspecial;
//		if((saldo + limiteChequeEspecial) >= valor) {
//			saldo -= valor;
//			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.\nNovo saldo: "+saldo);
//		} else {
//			JOptionPane.showMessageDialog(null, "Saque NÃO realizado.\nSaldo insuficiente\nSaldo: "+saldo);
//		}
	}
}
