package aula;

import java.io.*;
import javax.swing.*;

public class EscritaArquivoBinario {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		File arquivo = new File("arquivo.bin");
		try {
			FileOutputStream fos = new FileOutputStream(arquivo);
			DataOutputStream dos = new DataOutputStream(fos);
	
			dos.writeUTF(p.descricao);
			dos.writeInt(p.quantidade);
			dos.writeDouble(p.preco);
			dos.writeChar(p.categoria);
			dos.writeBoolean(p.perecivel);
			
			dos.close();
			fos.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita do arquivo.");
		}
			
	}

}

class Produto {
	String descricao = "Mouse Óptico com fio Logitec";
	int quantidade = 150;
	double preco = 17.99;
	char categoria = 'A';
	boolean perecivel = false;
}