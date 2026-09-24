package aula;

import java.io.*;

import javax.swing.JOptionPane;

public class LeituraArquivoTexto {

	public static void main(String[] args) {
		File arquivo = new File("arquivo.txt");
		byte[] conteudo = new byte[(int)arquivo.length()];

		try {
			FileInputStream fis = new FileInputStream(arquivo);
			fis.read(conteudo);
			fis.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
		}
			
		String texto = new String(conteudo);
		JOptionPane.showMessageDialog(null, texto);
	}

}
