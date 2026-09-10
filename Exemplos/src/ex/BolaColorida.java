package ex;

import javax.swing.*;
import java.awt.*;

public class BolaColorida extends JFrame {
    PainelComBola painel = new PainelComBola();
    public BolaColorida() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(painel);
        painel.setBackground(Color.WHITE);
        Thread t = new Thread(painel);
        t.start();
    }
    public static void main(String[] args) {
        BolaColorida janela = new BolaColorida();
        janela.setSize(550, 550);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}

class PainelComBola extends JPanel implements Runnable {
    int angulo;
    
    public void run() {
        while(true) {
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {}
            angulo++;
            angulo %= 360;
            repaint();
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillArc(10, 10, 480, 480, (0+angulo)%360, 60);
        g.setColor(Color.ORANGE);
        g.fillArc(10, 10, 480, 480, (60+angulo)%360, 60);
        g.setColor(Color.YELLOW);
        g.fillArc(10, 10, 480, 480, (120+angulo)%360, 60);
        g.setColor(Color.GREEN);
        g.fillArc(10, 10, 480, 480, (180+angulo)%360, 60);
        g.setColor(Color.BLUE);
        g.fillArc(10, 10, 480, 480, (240+angulo)%360, 60);
        g.setColor(Color.PINK);
        g.fillArc(10, 10, 480, 480, (300+angulo)%360, 60);
    }
}
