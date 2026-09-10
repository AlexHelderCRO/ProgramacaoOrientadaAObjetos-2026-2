package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Enquete extends JFrame {
    JLabel pergunta = new JLabel("Você faz xixi na cama?");
    JButton botao1 = new JButton("Sim");
    JButton botao2 = new JButton("Não");
    JPanel painel = new JPanel(new GridLayout(1, 2));
    
    public Enquete() {
        setTitle("Enquete");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        add(pergunta);
        add(painel);
        painel.add(botao1);
        painel.add(botao2);
        botao1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, 
                                    "Que feio....Você ainda faz xixi na cama.");
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
                botao1.setText("Sim");
                botao2.setText("Não");
            }
            public void mouseExited(MouseEvent e) {
            }
        });
        botao2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, 
                                    "Que feio....Você ainda faz xixi na cama.");
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
                botao2.setText("Sim");
                botao1.setText("Não");
            }
            public void mouseExited(MouseEvent e) {
            }
        });
        addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
            }
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Você tem de responder à enquete.");
            }
            public void windowClosed(WindowEvent e) {
            }
            public void windowIconified(WindowEvent e) {
            }
            public void windowDeiconified(WindowEvent e) {
            }
            public void windowActivated(WindowEvent e) {
            }
            public void windowDeactivated(WindowEvent e) {
            }
        });
    }
    
    public static void main(String[] args) {
        Enquete janela = new Enquete();
        janela.setSize(300, 150);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}
