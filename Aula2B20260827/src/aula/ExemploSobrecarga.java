package aula;

import javax.swing.JOptionPane;

public class ExemploSobrecarga {
	int soma(int a, int b) {
		System.out.println("método 1");
		return a+b;
	}
	int soma(int x, int y) {
		return x+y;
	}
	int soma(int a, int b, int c) {
		return a+b+c;
	}
	int soma(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	double soma(double a, double b) {
		System.out.println("método 2");
		return a+b;
	}
	String soma(String a, String b) {
		System.out.println("método 3");
		return ""+(Double.parseDouble(a)+Double.parseDouble(b));
	}
	int soma(String a, int b) {
		return Integer.parseInt(a)+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploSobrecarga objeto = new ExemploSobrecarga();
		objeto.soma("3", 4);
//		objeto.soma(4, "3");
		System.out.println(objeto.soma(3,4));
		System.out.println(objeto.soma(3.0,4));
		System.out.println(objeto.soma("3","4"));
		
		
//		JOptionPane.showInputDialog("Digite algo:");
//		JOptionPane.showInputDialog(null, "Digite algo:");
//		JOptionPane.showInputDialog("Digite algo: ", "Já digitei.");
//		JOptionPane.showInputDialog(null, "Digite algo: ", "Já digitei.");
//		JOptionPane.showInputDialog(null, "Digite algo:", "Pergunta", JOptionPane.WARNING_MESSAGE);
//		String[] valores = {"Brasil", "Argentina", "Portugal"};
//		JOptionPane.showInputDialog(null, "Digite algo:", "Pergunta", JOptionPane.INFORMATION_MESSAGE, null, valores,  null);
	}

}
