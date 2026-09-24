package aula;

import java.io.*;
import javax.swing.*;

public class EscritaArquivoCSV {

	public static void main(String[] args) {
		File arquivo = new File("arquivo.csv");
		String texto = "Produto;Quantidade;Preço\n";
		byte[] conteudo = texto.getBytes();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(arquivo);
			fos.write(conteudo);
		} catch(FileNotFoundException e) {
			fos = null;
			JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo.");
		} catch(IOException e) {
			fos = null;
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
		for(int i = 0; i < 3; i++) {
			String produto = JOptionPane.showInputDialog("Qual o produto?");
			String quantidade = JOptionPane.showInputDialog("Quantas unidades tem?");
			String preco = JOptionPane.showInputDialog("Qual o preço?");
			texto = produto+";"+quantidade+";"+preco+"\n";
			conteudo = texto.getBytes();
			try {
				fos.write(conteudo);
			} catch(IOException e) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
			}
		}
		try {
			fos.close();
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
	}

}

