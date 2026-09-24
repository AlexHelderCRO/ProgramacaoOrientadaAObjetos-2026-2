package aula;

import java.io.*;

import javax.swing.JOptionPane;

public class EscritaArquivoDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File arquivo = new File("file.txt");
		String texto = JOptionPane.showInputDialog("Digite algo: ");
		byte[] conteudo = texto.getBytes();
		try {
			FileOutputStream fos = new FileOutputStream(arquivo);
			fos.write(conteudo);
			fos.close();
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch(IOException e) {
			System.out.println("Ocorreu um erro na escrita do arquivo.");
		}
	}
}
