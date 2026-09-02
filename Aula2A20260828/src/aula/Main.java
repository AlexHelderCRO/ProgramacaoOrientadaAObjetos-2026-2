package aula;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		String titulo = JOptionPane.showInputDialog("Qual o título do livro?");
		livro.setTitulo(titulo);

	}

}
