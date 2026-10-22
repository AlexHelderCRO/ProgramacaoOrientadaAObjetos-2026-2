package biblio;

import javax.swing.JOptionPane;

public class Aluno {
	String[] livrosEmprestados = new String[5];
	
	public void efetuarEmprestimo() {
		String livro = JOptionPane.showInputDialog("Qual livro deseja pegar emprestado?");
		for (int i = 0; i < livrosEmprestados.length; i++) {
			if(livrosEmprestados[i] == null) {
				livrosEmprestados[i] = livro;
				JOptionPane.showMessageDialog(null, "Livro: \""+livro+"\" emprestado com sucesso.");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Não foi possível pegar o livro emprestado pois o aluno já tem 5 livros em seu nome.");
	}
	
	public void realizarDevolucao() {
		String livro = JOptionPane.showInputDialog("Qual livro está sendo devolvido?");
		for (int i = 0; i < livrosEmprestados.length; i++) {
			if(livrosEmprestados[i]!=null && livrosEmprestados[i].equals(livro)) {
				livrosEmprestados[i] = null;
				JOptionPane.showMessageDialog(null, "Livro \""+livro+"\" devolvido com sucesso.");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "O aluno não estava responsável por esse livro.");
	}
	
	public void visualizarLivrosEmprestados() {
		String visualizacao = "Livros emprestados: \n";
		for (int i = 0; i < livrosEmprestados.length; i++) {
			if(livrosEmprestados[i] != null) {
				visualizacao += livrosEmprestados[i]+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, visualizacao);
	}
}
