package aula;

import javax.swing.JOptionPane;

public class ExemploMotivadorExceptions {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
			int num3 = num1 / num2;
			JOptionPane.showMessageDialog(null, num1+" dividido por "+num2+" vale "+num3+".");
		} catch(ArithmeticException e) {
//			JOptionPane.showMessageDialog(null, "Não foi possível calcular a divisão por zero.");
			JOptionPane.showMessageDialog(null, "Ocorreu uma exception com mensagem "+e.getMessage());
//		} catch (NumberFormatException e) {
////			JOptionPane.showMessageDialog(null, "Não foi possível identificar o número no texto.");
//			e.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, "Código que sempre acontece.");
		}
		JOptionPane.showMessageDialog(null, "O programa continua .....");
	}

}
