package aula;

import java.io.*;
import javax.swing.*;

public class EscritaArquivoTexto {

	public static void main(String[] args) {
		File arquivo = new File("texto.txt");
		String texto = JOptionPane.showInputDialog("Digite algo:")+"\n";
		byte[] conteudo = texto.getBytes();
		
		try {
//			FileOutputStream fos = new FileOutputStream(arquivo); // Sobrescreve o arquivo. Perde o conteúdo anterior.
			FileOutputStream fos = new FileOutputStream(arquivo, true); // Acrescenta ao final do arquivo. Mantém o conteúdo anterior.
			fos.write(conteudo);
			fos.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
	}

}
