package aula;

import javax.swing.JOptionPane;

public class ClassesWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Boolean b = new Boolean(false);
//		Integer inteiro = new Integer(67);
//
//		System.out.println(b);
//		System.out.println(inteiro);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Double.SIZE);
//		System.out.println(Double.NaN);
//		System.out.println(Double.POSITIVE_INFINITY);
//		double d = 3E200 * 4E150;
//		if(Double.isInfinite(d)) {
//			System.out.println("O número é infinito.");
//		} else {
//			System.out.println("O número é finito.");
//		}
//		char c = '@';
//		if(Character.isDigit(c)) {
//			System.out.println("É um algarismo numérico."); 
//		} else if(Character.isLetter(c)) {
//			System.out.println("É uma letra."); 
//		} else if(Character.isWhitespace(c)) {
//			System.out.println("É um espaço em branco."); 
//		} else {
//			System.out.println("É um caractere especial."); 
//		}
		String texto = JOptionPane.showInputDialog("Digite algo: ");
		double d = Double.parseDouble(texto);
		float f = Float.parseFloat(texto);
		boolean b = Boolean.parseBoolean(texto);
		byte by = Byte.parseByte(texto);
		long l = Long.parseLong(texto);
		short s = Short.parseShort(texto);
		int i = Integer.parseInt(texto);
	}

}
