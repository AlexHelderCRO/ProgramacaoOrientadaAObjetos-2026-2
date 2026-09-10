package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SenhoraIdosa extends JFrame {
    JButton[][] botoes = new JButton[3][3];
    char turno = 'X';
    
    public SenhoraIdosa() {
        setLayout(new GridLayout(3, 3, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Jogo da Senhora Idosa");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j] = new JButton("");
                add(botoes[i][j]);
                botoes[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton botao = (JButton)e.getSource();
                        botao.setText(""+turno);
//                        botao.setEnabled(false);
                        botao.removeActionListener(this);
                        verificaFinal();
                        if(turno == 'X') {
                            turno = 'O';
                        } else if(turno == 'O') {
                            turno = 'X';
                        }
                    }
                });
            }
        }
    }
    
    void verificaFinal() {
        for (int i = 0; i < 3; i++) {
            if(botoes[i][0].getText().equals(botoes[i][1].getText()) && 
                            botoes[i][0].getText().equals(botoes[i][2].getText()) &&
                            botoes[i][0].getText().equals(""+turno)) {
                JOptionPane.showMessageDialog(rootPane, "O jogador "+turno+" ganhou.");
                finalizaJogo();
                return;
            }
            if(botoes[0][i].getText().equals(botoes[1][i].getText()) && 
                            botoes[0][i].getText().equals(botoes[2][i].getText()) &&
                            botoes[0][i].getText().equals(""+turno)) {
                JOptionPane.showMessageDialog(rootPane, "O jogador "+turno+" ganhou.");
                finalizaJogo();
                return;
            }
        }
        if(botoes[0][0].getText().equals(botoes[1][1].getText()) && 
                        botoes[0][0].getText().equals(botoes[2][2].getText()) &&
                            botoes[0][0].getText().equals(""+turno)) {
            JOptionPane.showMessageDialog(rootPane, "O jogador "+turno+" ganhou.");
                finalizaJogo();
                return;
        }
        if(botoes[2][0].getText().equals(botoes[1][1].getText()) && 
                        botoes[2][0].getText().equals(botoes[0][2].getText()) &&
                            botoes[2][0].getText().equals(""+turno)) {
            JOptionPane.showMessageDialog(rootPane, "O jogador "+turno+" ganhou.");
                finalizaJogo();
                return;
        }
        int possibilidades = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(botoes[i][j].getText().equals("")) {
                    possibilidades++;
                }
            }
        }
        if(possibilidades == 0) {
            JOptionPane.showMessageDialog(rootPane, "Deu Senhora Idosa.\nNinguém ganhou.");
        }
    }
    
    public void finalizaJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ActionListener[] listeners = botoes[i][j].getActionListeners();
                for (int k = 0; k < listeners.length; k++) {
                    botoes[i][j].removeActionListener(listeners[k]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        SenhoraIdosa janela = new SenhoraIdosa();
        janela.setSize(400, 400);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
    
}
