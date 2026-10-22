package aula;

import javax.swing.JOptionPane;
import java.io.*;

public class EscritaArquivoBinario {
	public static void main(String[] args) {
		Produto[] estoque = new Produto[5];
		for (int i = 0; i < estoque.length; i++) {
			estoque[i] = new Produto();
			estoque[i].descricao = JOptionPane.showInputDialog("Qual o produto?");
			estoque[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades tem?"));
			estoque[i].preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?"));
			estoque[i].tamanho = JOptionPane.showInputDialog("Qual o tamanho? (P, M ou G)").charAt(0);
		}
		File arquivo = new File("estoque.bin");
		try {
			FileOutputStream fos = new FileOutputStream(arquivo);
			DataOutputStream dos = new DataOutputStream(fos);
			for (int i = 0; i < estoque.length; i++) {
				dos.writeUTF(estoque[i].descricao);
				dos.writeInt(estoque[i].quantidade);
				dos.writeDouble(estoque[i].preco);
				dos.writeChar(estoque[i].tamanho);
			}
			dos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
	}
}
class Produto {
	String descricao;
	int quantidade;
	double preco;
	char tamanho; // P, M, ou G
}