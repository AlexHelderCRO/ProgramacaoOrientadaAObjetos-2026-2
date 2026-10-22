package aula;
import java.io.*;
import javax.swing.JOptionPane;
public class LeituraArquivoBinario {
	public static void main(String[] args) {
		Produto[] estoque = new Produto[5];
		File arquivo = new File("estoque.bin");
		try {
			FileInputStream fis = new FileInputStream(arquivo);
			DataInputStream dis = new DataInputStream(fis);
			for (int i = 0; i < estoque.length; i++) {
				estoque[i] = new Produto();
				estoque[i].descricao = dis.readUTF();
				estoque[i].quantidade = dis.readInt();
				estoque[i].preco = dis.readDouble();
				estoque[i].tamanho = dis.readChar();
			}
			dis.close();
			fis.close();
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado.");
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do arquivo.");
		}
		System.out.println("Estoque:\n");
		for (int i = 0; i < estoque.length; i++) {
			System.out.println("Produto: "+estoque[i].descricao);
			System.out.println("Quantidade: "+estoque[i].quantidade);
			System.out.println("Preço: "+estoque[i].preco);
			System.out.println("Tamanho: "+estoque[i].tamanho+"\n");
		}
	}
}
