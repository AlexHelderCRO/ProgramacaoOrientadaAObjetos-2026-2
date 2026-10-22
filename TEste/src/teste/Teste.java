package teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("boi");
		lista.add("cachorro");
		lista.add("jacaré");
		Collections.shuffle(lista);
		if(lista.contains("Cachorro")) {
			System.out.println("Tem");
		} else {
			System.out.println("Não tem.");
		}
	}

}
