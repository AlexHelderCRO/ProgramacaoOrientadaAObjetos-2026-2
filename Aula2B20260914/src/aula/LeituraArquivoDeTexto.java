package aula;

import java.io.*;

public class LeituraArquivoDeTexto {

	public static void main(String[] args) {
		File arquivo = new File("arquivo.txt");
		byte[] conteudo = new byte[(int)arquivo.length()];
		try {
			FileInputStream fis = new FileInputStream(arquivo);
			fis.read(conteudo);
			fis.close();
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch(IOException e) {
			System.out.println("Ocorreu um erro na leitura do arquivo.");
		}
		String texto = new String(conteudo);
		System.out.println(texto);
	}

}
