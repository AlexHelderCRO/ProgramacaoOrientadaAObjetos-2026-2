package exemploRestaurante;

import javax.swing.JOptionPane;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente[] clientes = new Cliente[10];
		for(int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
		}
		String[] opcoes = {"Fazer Pedido", "Fechar a conta", "Efetuar Pagamento"};
		int opcao;
		Integer[] mesas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		do {
			Object mesa = JOptionPane.showInputDialog(null, "Cliente de qual mesa?", "Restaurante",
					JOptionPane.QUESTION_MESSAGE, null, mesas, null);
			opcao = JOptionPane.showOptionDialog(null, "Qual a ação do cliente?", "Restaurante", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
			
		} while(opcao != JOptionPane.CLOSED_OPTION);
	}

}
