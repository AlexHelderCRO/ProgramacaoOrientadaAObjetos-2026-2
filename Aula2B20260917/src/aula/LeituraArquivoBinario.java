package aula;

import java.io.*;
import javax.swing.*;

public class LeituraArquivoBinario {

	public static void main(String[] args) {
		File arquivo = new File("arquivo.bin");
		try {
			FileInputStream fis = new FileInputStream(arquivo);
			DataInputStream dis = new DataInputStream(fis);
			
			String descricao = dis.readUTF();
			int quantidade = dis.readInt();
			double preco = dis.readDouble();
			char categoria = dis.readChar();
			boolean perecivel = dis.readBoolean();
			
			dis.close();
			fis.close();
			JOptionPane.showMessageDialog(null, "Descrição: "+descricao);
			JOptionPane.showMessageDialog(null, "Quantidade: "+quantidade);
			JOptionPane.showMessageDialog(null, "Preço: "+preco);
			JOptionPane.showMessageDialog(null, "Categoria: "+categoria);
			JOptionPane.showMessageDialog(null, "Perecível: "+perecivel);
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
		}
		
	}

}
