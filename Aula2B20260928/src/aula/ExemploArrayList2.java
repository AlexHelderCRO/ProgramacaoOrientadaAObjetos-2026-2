package aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class ExemploArrayList2 {

	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		for(int i = 0; i < 3; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual a matrícula dele?"));
			Aluno aluno = new Aluno(nome, matricula);
			lista.add(aluno);
		}
//		lista.add("Zumba"); // Não é permitido inserir outros tipos, se definirmos um tipo na declaração.
		System.out.println("Quantos elementos tem na lista?");
		System.out.println("Resposta: "+lista.size());
		for (int i = 0; i < lista.size(); i++) {
			Aluno a = lista.get(i);
			System.out.println(a);
		}
		
		Collections.sort(lista);
		System.out.println("\n\nOrdenado:");
		for (int i = 0; i < lista.size(); i++) {
			Aluno a = lista.get(i);
			System.out.println(a);
		}
		
		
//		ArrayList lista = new ArrayList();
//		for(int i = 0; i < 3; i++) {
//			String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
//			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual a matrícula dele?"));
//			Aluno aluno = new Aluno(nome, matricula);
//			lista.add(aluno);
//		}
//		System.out.println("Quantos elementos tem na lista?");
//		System.out.println("Resposta: "+lista.size());
//		for (int i = 0; i < lista.size(); i++) {
//			Aluno a = (Aluno)lista.get(i);
//			System.out.println(a);
//		}

	}

}

class Aluno implements Comparable<Aluno> {
	String nome;
	int matricula;
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String toString() {
		return "Nome: "+nome+"\nMatrícula: "+matricula+"\n";
	}
	public int compareTo(Aluno aluno) {
		// TODO Auto-generated method stub
		return nome.compareTo(aluno.nome);
	}
}