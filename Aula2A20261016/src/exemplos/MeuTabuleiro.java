package exemplos;

import java.awt.*;
import javax.swing.*;

public class MeuTabuleiro extends JFrame {
	JPanel barraDeFerramentas = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel tabuleiro = new JPanel(new GridLayout(8, 8));
	JLabel barraDeStatus = new JLabel("É a vez do jogador das peças negras.");
	JButton botaoNovo = new JButton("Novo");
	JButton botaoAbrir = new JButton("Abrir");
	JButton botaoSalvar = new JButton("Salvar");
	JButton botaoAjuda = new JButton("Ajuda");
	JButton[][] casas = new JButton[8][8];
	
	public MeuTabuleiro() {
		setTitle("Super Xadrez sem jogo");
		setLayout(new BorderLayout());
		add(barraDeFerramentas, BorderLayout.NORTH);
		add(barraDeStatus, BorderLayout.SOUTH);
		add(tabuleiro, BorderLayout.CENTER);
		barraDeFerramentas.add(botaoNovo);
		barraDeFerramentas.add(botaoAbrir);
		barraDeFerramentas.add(botaoSalvar);
		barraDeFerramentas.add(botaoAjuda);
		for (int i = 0; i < casas.length; i++) {
			for (int j = 0; j < casas.length; j++) {
				casas[i][j] = new JButton();
				tabuleiro.add(casas[i][j]);
				if((i+j)%2 == 0) {
					casas[i][j].setBackground(Color.BLACK);
				} else {
					casas[i][j].setBackground(Color.WHITE);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MeuTabuleiro janela = new MeuTabuleiro();
		janela.setSize(500, 520);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
}
