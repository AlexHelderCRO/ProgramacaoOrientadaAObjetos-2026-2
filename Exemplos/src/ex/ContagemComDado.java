package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContagemComDado extends JFrame{
    BotaoDesenhado botao = new BotaoDesenhado();
    
    public ContagemComDado() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(botao);
        botao.setBackground(Color.WHITE);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                botao.clique();
                botao.repaint();
            }
        });
    }
    
    public static void main(String[] args) {
        ContagemComDado janela = new ContagemComDado();
        janela.setSize(500, 550);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}

class BotaoDesenhado extends JButton {
    int valor;
    
    public void clique() {
        valor++;
        valor %= 10;
    }
    
    public void paint(Graphics g) {
        super.paint(g);
//        g.setColor(Color.WHITE);
//        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.BLACK);
        if(valor == 1) {
            g.fillArc(200, 200, 50, 50, 0, 360);
        } else if(valor == 2) {
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 3) {
            g.fillArc(200, 200, 50, 50, 0, 360);
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 4) {
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(50, 350, 50, 50, 0, 360);
            g.fillArc(350, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 5) {
            g.fillArc(200, 200, 50, 50, 0, 360);
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(50, 350, 50, 50, 0, 360);
            g.fillArc(350, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 6) {
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(50, 350, 50, 50, 0, 360);
            g.fillArc(50, 200, 50, 50, 0, 360);
            g.fillArc(350, 200, 50, 50, 0, 360);
            g.fillArc(350, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 7) {
            g.fillArc(200, 200, 50, 50, 0, 360);
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(50, 350, 50, 50, 0, 360);
            g.fillArc(50, 200, 50, 50, 0, 360);
            g.fillArc(350, 200, 50, 50, 0, 360);
            g.fillArc(350, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 8) {
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(50, 350, 50, 50, 0, 360);
            g.fillArc(50, 200, 50, 50, 0, 360);
            g.fillArc(200, 50, 50, 50, 0, 360);
            g.fillArc(200, 350, 50, 50, 0, 360);
            g.fillArc(350, 50, 50, 50, 0, 360);
            g.fillArc(350, 200, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        } else if(valor == 9) {
            g.fillArc(200, 200, 50, 50, 0, 360);
            g.fillArc(50, 50, 50, 50, 0, 360);
            g.fillArc(50, 350, 50, 50, 0, 360);
            g.fillArc(50, 200, 50, 50, 0, 360);
            g.fillArc(200, 50, 50, 50, 0, 360);
            g.fillArc(200, 350, 50, 50, 0, 360);
            g.fillArc(350, 200, 50, 50, 0, 360);
            g.fillArc(350, 50, 50, 50, 0, 360);
            g.fillArc(350, 350, 50, 50, 0, 360);
        }
    }
}