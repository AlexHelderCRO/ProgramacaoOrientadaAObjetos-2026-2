package exemploRestaurante;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Cliente {
	double subtotal;
	DecimalFormat monetario = new DecimalFormat("R$ #,##0.00");
	
	void fazerPedido() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do prato?"));
		subtotal += valor;
	}
	void fecharConta() {
		String conta = "Conta\n";
		conta += "Subtotal: "+monetario.format(subtotal)+"\n";
		conta += "Gorjeta:  "+monetario.format(subtotal*0.1)+"\n";
		conta += "Total:    "+monetario.format(subtotal*1.1);
		JOptionPane.showMessageDialog(null, conta);
	}
	void efetuarPagamento() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto o cliente pagou?"));
		double gorjeta = valor-subtotal;
		if(gorjeta > 0) {
			JOptionPane.showMessageDialog(null, "O garçom recebeu "+monetario.format(gorjeta)+" de gorjeta.");
		} else if(gorjeta == 0) {
			JOptionPane.showMessageDialog(null, "O garçom não recebeu nenhuma gorjeta.");
		} else if(gorjeta < 0) {
			JOptionPane.showMessageDialog(null, "O garçom arcará com um prejuízo de "+monetario.format(gorjeta)+".");
		}
		subtotal = 0;
	}
}
