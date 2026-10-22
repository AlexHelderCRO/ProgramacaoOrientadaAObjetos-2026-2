package aula;

import java.io.*;

import javax.swing.JOptionPane;

public class LeituraArquivoCSV {

	public static void main(String[] args) {
		File arquivo = new File("planilha.csv");
		byte[] conteudo = new byte[(int)arquivo.length()];
		try {
			FileInputStream fis = new FileInputStream(arquivo);
			fis.read(conteudo);
			fis.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
		}
		String texto = new String(conteudo);
		double[][] matriz = new double[12][3];
		String[] linhas = texto.split("\n");
		String[] colunas = linhas[0].split(";");
		for (int i = 0; i < colunas.length; i++) {
			System.out.print(colunas[i].trim()+"\t");
		}
		System.out.print("Lucro\n");
		for (int i = 1; i < linhas.length; i++) {
			colunas = linhas[i].split(";");
			System.out.print(colunas[0]+"\t");
			matriz[i-1][0] = Double.parseDouble(colunas[1].trim());
			System.out.print(matriz[i-1][0]+"\t");
			matriz[i-1][1] = Double.parseDouble(colunas[2].trim());
			System.out.print(matriz[i-1][1]+"\t");
			matriz[i-1][2] = matriz[i-1][0] - matriz[i-1][1];
			System.out.print(matriz[i-1][2]+"\n");

		}
	}

}
