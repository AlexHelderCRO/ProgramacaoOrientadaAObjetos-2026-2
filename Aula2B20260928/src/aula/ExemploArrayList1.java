package aula;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class ExemploArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		lista.add("Palavra");
		lista.add(new Scanner(System.in));
		lista.add(new JFrame());
		lista.add(7);
		System.out.println("Quantos elementos tem na lista?");
		System.out.println("Resposta: "+lista.size());
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
