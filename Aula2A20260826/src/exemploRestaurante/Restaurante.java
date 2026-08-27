package exemploRestaurante;

import javax.swing.JOptionPane;

public class Restaurante {

	public static void main(String[] args) {
		Cliente[] clientes = new Cliente[20];
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
		}
		
		String[] acoes = {"Fazer pedido", "fechar conta", "efetuar pagamento"};
		Integer[] mesas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0};
		int opcao;
		do {
			int mesa = (Integer)JOptionPane.showInputDialog(null, "Qual mesa pediu atendimento?",
					"Restaurante", JOptionPane.QUESTION_MESSAGE, null, mesas, null);
			opcao = JOptionPane.showOptionDialog(null, "Qual ação o cliente quer realizar?", 
					"Restaurante", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
					null, acoes, null);
			if(opcao == JOptionPane.YES_OPTION) { // Fazer pedido
				clientes[mesa].fazerPedido();
			} else if(opcao == JOptionPane.NO_OPTION) {// Fechar conta
				clientes[mesa].fecharConta();
			} else if(opcao == JOptionPane.CANCEL_OPTION) { // Efetuar pagamento
				clientes[mesa].efetuarPagamento();
			}
		} while(opcao != JOptionPane.CLOSED_OPTION);

	}

}
