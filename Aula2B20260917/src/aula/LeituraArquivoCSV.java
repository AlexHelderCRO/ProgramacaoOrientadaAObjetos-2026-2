package aula;

import java.io.*;
import javax.swing.*;

public class LeituraArquivoCSV {

	public static void main(String[] args) {
		File arquivo = new File("planilha.csv");
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
		int[][] matriz = new int[12][3];
		String texto = new String(conteudo);
		String[] linhas = texto.split("\n");
		String[] colunas = linhas[0].split(";");
		System.out.println(colunas[0]+"\t"+colunas[1]+"\t"+colunas[2].trim()+"\tLucro");
		for(int i = 1; i < linhas.length; i++) {
			colunas = linhas[i].split(";");
			matriz[i-1][0] = Integer.parseInt(colunas[1].trim());
			matriz[i-1][1] = Integer.parseInt(colunas[2].trim());
			matriz[i-1][2] = matriz[i-1][0] - matriz[i-1][1];
			System.out.println(colunas[0]+"\t"+matriz[i-1][0]+"\t"+matriz[i-1][1]+"\t"+matriz[i-1][2]);
		}
	}

}
