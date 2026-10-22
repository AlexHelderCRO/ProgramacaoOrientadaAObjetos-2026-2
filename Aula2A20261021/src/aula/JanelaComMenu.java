package aula;

import javax.swing.*;

public class JanelaComMenu extends JFrame {
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
	
	public JanelaComMenu() {
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
	}
	
	public static void main(String[] args) {
		JanelaComMenu janela = new JanelaComMenu();
		janela.setSize(400, 300);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
