package aula;

import java.io.*;
import javax.swing.*;

public class EscritaArquivoCSV {

	public static void main(String[] args) {
		String texto = "Produto;Quantidade;Preço\n";
		byte[] conteudo = texto.getBytes();
		File arquivo = new File("arquivo.csv");
		try {
			FileOutputStream fos = new FileOutputStream(arquivo);
			fos.write(conteudo);
			for(int i = 0; i < 5; i++) {
				String produto = JOptionPane.showInputDialog("Qual o produto?");
				String quantidade = JOptionPane.showInputDialog("Quantos produtos tem no estoque?");
				String preco = JOptionPane.showInputDialog("Qual o preço deste produto?");
				texto = produto+";"+quantidade+";"+preco+"\n";
				conteudo = texto.getBytes();
				fos.write(conteudo);
			}
			fos.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
		
	}

}
