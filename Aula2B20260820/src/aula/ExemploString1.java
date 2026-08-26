package aula;

import javax.swing.JOptionPane;

public class ExemploString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String texto1 = JOptionPane.showInputDialog("Digite algo:");
//		if(texto1.equalsIgnoreCase("porta")) {
//			System.out.println("São iguais.");
//		} else {
//			System.out.println("São diferentes.");
//		}
		
//		String texto1 = "porta";
//		String texto2 = "telhado";
//		System.out.println("Em ordem alfabética:");
//		if(texto1.compareToIgnoreCase(texto2) == 0) {
//			System.out.println("As strings são iguais: "+texto1);
//		} else if(texto1.compareToIgnoreCase(texto2) < 0) {
//			System.out.println(texto1+"\n"+texto2);
//		} else if(texto1.compareToIgnoreCase(texto2) > 0) {
//			System.out.println(texto2+"\n"+texto1);
//		}

//		String palavra = JOptionPane.showInputDialog("Digite algo:");
//		palavra = palavra.toUpperCase();
//		System.out.println(palavra);
		
//		String nome = "Fulano";
//		String sobrenome = "de Tal";
////		String nomeCompleto = nome.concat(" ").concat(sobrenome);
//		String nomeCompleto = nome+" "+sobrenome;
//		System.out.println(nomeCompleto);
		
//		String frase = JOptionPane.showInputDialog("Digite algo:");
//		int contador = 0;
//		for(int i = 0; i < frase.length(); i++) {
//			char letra = frase.charAt(i);
//			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
//				contador++;
//			}
//		}
//		System.out.println(frase+" contém "+contador+" vogais.");
		
		String email = "fulano>Tal#email>com>br";
		email = email.replace('>', '.');
		email = email.replace('#', '@');
		System.out.println(email);
		String sub = email.substring(11,17);
		System.out.println(sub);
	}

}
