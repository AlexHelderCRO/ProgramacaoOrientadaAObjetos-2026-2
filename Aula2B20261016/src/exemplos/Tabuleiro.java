package exemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.*;
/**
 *
 * @author yoda
 */
public class Tabuleiro extends JFrame {
    JButton botaoNovo;
    JButton botaoAbrir;
    JButton botaoSalvar;
    JButton botaoAjuda;
    JPanel[][] painelTabuleiro;
    JLabel barraDeStatus;
    
    JPanel barraDeFerramentas;
    JPanel containerDoTabuleiro;
    
    public Tabuleiro() {
        super("Super Xadrez sem jogo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
//        barraDeFerramentas = new JPanel();
//        barraDeFerramentas.setLayout(new FlowLayout(FlowLayout.LEFT));
        barraDeFerramentas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        add(barraDeFerramentas, BorderLayout.NORTH);
        botaoNovo = new JButton("Novo");
        botaoAbrir = new JButton("Abrir");
        botaoSalvar = new JButton("Salvar");
        botaoAjuda = new JButton("Ajuda");
        barraDeFerramentas.add(botaoNovo);
        barraDeFerramentas.add(botaoAbrir);
        barraDeFerramentas.add(botaoSalvar);
        barraDeFerramentas.add(botaoAjuda);
        barraDeStatus = new JLabel("Vez do jogador das peças pretas.");
        add(barraDeStatus, BorderLayout.SOUTH);
        containerDoTabuleiro = new JPanel(new GridLayout(8,8,2,2));
        add(containerDoTabuleiro, BorderLayout.CENTER);
        painelTabuleiro = new JPanel[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                painelTabuleiro[i][j] = new JPanel();
                if(((i+j)%2) == 0) {
                    painelTabuleiro[i][j].setBackground(Color.black);
                } else {
                    painelTabuleiro[i][j].setBackground(Color.white);
                }
                containerDoTabuleiro.add(painelTabuleiro[i][j]);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabuleiro tabu = new Tabuleiro();
        tabu.setSize(400,420);
        tabu.setVisible(true);
    }
    
}
