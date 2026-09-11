package aula;

import javax.swing.JOptionPane;

public class ContaCorrente {
	protected double saldo;
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.\nNovo saldo: "+saldo);
		} else {
			JOptionPane.showMessageDialog(null, "Saque NÃO realizado.\nSaldo insuficiente\nSaldo: "+saldo);
		}
	}
	public void depositar(double valor) {
		saldo += valor;
		JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso.\nNovo saldo: "+saldo);
	}
}
