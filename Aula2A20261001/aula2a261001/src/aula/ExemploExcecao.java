package aula;

import javax.swing.JOptionPane;

public class ExemploExcecao {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um dividendo:"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um divisor:"));
			int c = a/b;
			JOptionPane.showMessageDialog(null, "A divisão deu: "+c);
		} catch(ArithmeticException e) {
//			JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
			JOptionPane.showMessageDialog(null, "Ocorreu uma exceção com mensagem: "+e.getMessage());
//		} catch(NumberFormatException e) {
////			JOptionPane.showMessageDialog(null, "Só devem ser digitados algarismos.");
//			e.printStackTrace();
		} finally {
			JOptionPane.showMessageDialog(null, "Isso executa sempre!");
		}
		JOptionPane.showMessageDialog(null, "O programa continua normalmente.....");
	}

}
