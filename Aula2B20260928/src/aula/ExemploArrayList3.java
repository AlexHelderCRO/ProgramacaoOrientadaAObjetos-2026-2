package aula;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("oculos");
		lista.add("telhado");
		lista.add("café");
		lista.add("elefante");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		Collections.sort(lista);
		System.out.println("\nOrdenado.");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		Collections.shuffle(lista);
		System.out.println("\nEmbaralha.");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
