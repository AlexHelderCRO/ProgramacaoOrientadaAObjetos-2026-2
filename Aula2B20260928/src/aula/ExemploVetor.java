package aula;

public class ExemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] palavras = new String[5];
		palavras[0] = "boi";
		palavras[1] = "mesa";
		palavras[2] = "Saci";
		palavras[3] = "ponto";
		palavras[4] = "Jaca";
		palavras = new String[10];
		palavras[5] = "Tela";
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}
	}

}
