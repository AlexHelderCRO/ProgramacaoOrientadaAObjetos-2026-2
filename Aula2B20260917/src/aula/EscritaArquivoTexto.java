package aula;

import java.io.*;
import javax.swing.*;

public class EscritaArquivoTexto {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Digite algo:");
		texto+="\n";
		byte[] conteudo = texto.getBytes();
		
		File arquivo = new File("texto.txt");
		try {
//			FileOutputStream fos = new FileOutputStream(arquivo); // Sobrescreve
			FileOutputStream fos = new FileOutputStream(arquivo, true);// Acrescenta no final
			fos.write(conteudo);
			fos.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
	}

}
