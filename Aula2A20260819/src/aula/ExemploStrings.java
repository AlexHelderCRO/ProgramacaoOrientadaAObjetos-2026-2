package aula;

public class ExemploStrings {

	public static void main(String[] args) {
		String email = "fulano#gmail>com>br";
		System.out.println(email);
		email = email.replace('#', '@');
		email = email.replace('>', '.');
		System.out.println(email);
		String sub = email.substring(6, 4);
		System.out.println("Substring: "+sub);
		System.out.println("Tamanho do substring: "+sub.length());
		
//		String nome = "Fulano";
//		String sobrenome = "de Tal";
////		String nomeCompleto = nome.concat(" ").concat(sobrenome);
//		String nomeCompleto = nome + " " + sobrenome;
//		System.out.println(nomeCompleto);
//
//		nomeCompleto = nomeCompleto.toLowerCase();
//		int vogais = 0;
//		for(int i = 0; i < nomeCompleto.length(); i++) {
//			char letra = nomeCompleto.charAt(i);
//			if(letra =='a' || letra == 'e' || letra== 'i' || letra=='o' || letra=='u') {
//				vogais++;
//			}
//		}
//		System.out.println("Este nome tem "+vogais+" vogais.");
		
		
//		String maiuscula = nomeCompleto.toUpperCase();
//		System.out.println(maiuscula);
//		
//		System.out.println("Tamanho do String: "+nomeCompleto.length());
		
//		String s1 = "hoje";
//		String s2 = "Ontem";
//		
//		String uniao = s1.concat(" ").concat(s2);
//		System.out.println(uniao);
		
//		if(s1.compareToIgnoreCase(s2) == 0) {
//			System.out.println("iguais");
//		} else if(s1.compareToIgnoreCase(s2) < 0) {
//			System.out.println(s1 +" vem antes de "+s2);
//		} else if(s1.compareToIgnoreCase(s2) > 0) {
//			System.out.println(s1+" vem depois de "+s2);
//		}
		
//		if(s1.equalsIgnoreCase(s2)) {
//			System.out.println("iguais");
//		} else {
//			System.out.println("diferentes");
//		}
		
	}

}
