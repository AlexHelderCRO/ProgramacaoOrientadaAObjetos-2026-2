package exemploRestaurante;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Cliente {
	double subtotal;
	DecimalFormat monetario = new DecimalFormat("R$ #,##0.00");
	
	void fazerPedido() {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do prato pedido?"));
		subtotal += preco;
	}
	void fecharConta() {
		String conta = "Conta\n";
		conta += "Sub-Total: "+monetario.format(subtotal)+"\n";
		conta += "gorjeta: "+monetario.format(subtotal*0.1)+"\n";
		conta += "Total: "+monetario.format(subtotal*1.1);
		JOptionPane.showMessageDialog(null, conta);
	}
	void efetuarPagamento() {
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Quando foi pago?"));
		double gorjeta = pagamento - subtotal;
		if(gorjeta > 0) {
			JOptionPane.showMessageDialog(null, "O garçom recebeu "+monetario.format(gorjeta));
		} else if(gorjeta == 0) {
			JOptionPane.showMessageDialog(null, "O garçom não recebeu nada.");
		} else if(gorjeta < 0) {
			JOptionPane.showMessageDialog(null, "O garçom ficou com prejuízo de "+monetario.format(gorjeta));
		}
		subtotal = 0;
	}

}
