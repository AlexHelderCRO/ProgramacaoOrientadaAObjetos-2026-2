package aula;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploVetorEArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[51];
		for (int num : vetor) {
			System.out.println(num);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			int num = vetor[i];
			System.out.println(num);
		}
		
		ArrayList<String> lista = new ArrayList<String>();
		for (String texto : lista) {
			System.out.println(texto);
		}

		for (int i = 0; i < lista.size(); i++) {
			String texto = lista.get(i);
			System.out.println(texto);
		}
}

}
