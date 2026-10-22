package aula;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class BlocoDeNotasMenosMenos extends JFrame {
	JMenuBar barraDeMenu = new JMenuBar();
	JMenu menuArquivo = new JMenu("Arquivo");
	JMenu menuEditar = new JMenu("Editar");
	JMenuItem itemNovo = new JMenuItem("Novo");
	JMenuItem itemAbrir = new JMenuItem("Abrir");
	JMenuItem itemSalvar = new JMenuItem("Salvar");
	JMenuItem itemSair = new JMenuItem("Sair");
	JMenuItem itemCopiar = new JMenuItem("Copiar");
	JMenuItem itemRecortar = new JMenuItem("Recortar");
	JMenuItem itemColar = new JMenuItem("Colar");
	JTextArea area = new JTextArea();
	JScrollPane painelComBarrasDeRolagem = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	public BlocoDeNotasMenosMenos() {
		setTitle("Bloco de Notas --");
		setJMenuBar(barraDeMenu);
		barraDeMenu.add(menuArquivo);
		barraDeMenu.add(menuEditar);
		menuArquivo.add(itemNovo);
		menuArquivo.add(itemAbrir);
		menuArquivo.add(itemSalvar);
		menuArquivo.add(itemSair);
		menuEditar.add(itemCopiar);
		menuEditar.add(itemRecortar);
		menuEditar.add(itemColar);
		add(painelComBarrasDeRolagem);
		
		itemNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.setText("");
			}
		});
		itemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Encerra todo o programa.
//				dispose(); // Encerra apenas a janela atual.
			}
		});
		itemAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrir();
			}
		});
		itemSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvar();
			}
		});
		itemCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.copy();
			}
		});
		itemRecortar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.cut();
			}
		});
		itemColar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area.paste();
			}
		});
	}
	
	public void abrir() {
		JFileChooser escolhedor = new JFileChooser();
		int opcao = escolhedor.showOpenDialog(this);
		if(opcao == JFileChooser.APPROVE_OPTION) {
			File arquivo = escolhedor.getSelectedFile();
//			File arquivo = new File("arquivo.txt");
			byte[] conteudo = new byte[(int)arquivo.length()];
			try {
				FileInputStream fis = new FileInputStream(arquivo);
				fis.read(conteudo);
				fis.close();
			} catch(FileNotFoundException e) {
				JOptionPane.showMessageDialog(this, "Arquivo não encontrado.");
			} catch(IOException e) {
				JOptionPane.showMessageDialog(this, "Ocorreu um erro na leitura do arquivo.");
			}
			String texto = new String(conteudo);
			area.setText(texto);
		}
	}
	
	public void salvar() {
		JFileChooser escolhedor = new JFileChooser();
		int opcao = escolhedor.showSaveDialog(this);
		if(opcao == JFileChooser.APPROVE_OPTION) {
			File arquivo = escolhedor.getSelectedFile();
//			File arquivo = new File("arquivo.txt");
			String texto = area.getText();
			byte[] conteudo = texto.getBytes();
			try {
				FileOutputStream fos = new FileOutputStream(arquivo);
				fos.write(conteudo);
				fos.close();
			} catch(FileNotFoundException e) {
				JOptionPane.showMessageDialog(this, "Arquivo não encontrado.");
			} catch(IOException e) {
				JOptionPane.showMessageDialog(this, "Ocorreu um erro na escrita do arquivo.");
			}
		}
	}

	public static void main(String[] args) {
		BlocoDeNotasMenosMenos janela = new BlocoDeNotasMenosMenos();
		janela.setSize(800, 600);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
