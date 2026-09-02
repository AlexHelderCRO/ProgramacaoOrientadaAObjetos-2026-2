package exemploRestaurante;

import javax.swing.JOptionPane;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente[] clientes = new Cliente[20];
		for(int i =0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
		}
		
	    Integer[] mesas = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,0};
	    String[] opcoes = {"Fazer pedido", "Fechar conta", "Efetuar pagamento"};
		int opcao;
		do {
			int mesa = (Integer)JOptionPane.showInputDialog(null, "Qual a mesa?", "Restaurante", 
												JOptionPane.QUESTION_MESSAGE, null, mesas, null);
			opcao = JOptionPane.showOptionDialog(null, "Qual ação o cliente quer realizar?", 
												"Restaurante", JOptionPane.YES_NO_CANCEL_OPTION, 
												JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
			switch(opcao) {
			case JOptionPane.YES_OPTION:
				clientes[mesa].fazerPedido();
				break;
			case JOptionPane.NO_OPTION:
				clientes[mesa].fecharConta();
				break;
			case JOptionPane.CANCEL_OPTION:
				clientes[mesa].efetuarPagamento();
			}
		} while(opcao != JOptionPane.CLOSED_OPTION);
	}
}
