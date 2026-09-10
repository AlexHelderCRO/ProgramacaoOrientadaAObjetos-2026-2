package ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JogoDaCobrinha extends JFrame {
    PainelDoJogo painel = new PainelDoJogo();
    
    public JogoDaCobrinha() {
        setTitle("Jogo da Cobrinha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(painel);
        painel.setBackground(Color.WHITE);
        Thread t = new Thread(painel);
        t.start();
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char letra = e.getKeyChar();
                if(letra == 'a') {
                    painel.cobra.direcao = Cobra.LEFT;
                } else if(letra == 's') {
                    painel.cobra.direcao = Cobra.DOWN;
                } else if(letra == 'd') {
                    painel.cobra.direcao = Cobra.RIGHT;
                } else if(letra == 'w') {
                    painel.cobra.direcao = Cobra.UP;
                }
            }
            public void keyPressed(KeyEvent e) {
                int codigo = e.getKeyCode();
                if(codigo == KeyEvent.VK_LEFT) {
                    painel.cobra.direcao = Cobra.LEFT;
                } else if(codigo == KeyEvent.VK_DOWN) {
                    painel.cobra.direcao = Cobra.DOWN;
                } else if(codigo == KeyEvent.VK_RIGHT) {
                    painel.cobra.direcao = Cobra.RIGHT;
                } else if(codigo == KeyEvent.VK_UP) {
                    painel.cobra.direcao = Cobra.UP;
                }
            }
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    public static void main(String[] args) {
        JogoDaCobrinha janela = new JogoDaCobrinha();
        janela.setSize(650, 650);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
    
}

class PainelDoJogo extends JPanel implements Runnable {
    ArrayList<Point> macas = new ArrayList<Point>();
    Cobra cobra = new Cobra(macas);
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.ORANGE);
        for (int i = 0; i < cobra.corpo.size(); i++) {
            Point p = cobra.corpo.get(i);
            g.fillRect(p.x*10, p.y*10, 10, 10);
        }
        g.setColor(Color.RED);
        for (int i = 0; i < macas.size(); i++) {
            g.fillArc(macas.get(i).x*10, macas.get(i).y*10, 10, 10, 0, 360);
        }
        g.setColor(Color.BLACK);
        g.fillRect(0, 600, 700, 100);
        g.fillRect(600, 0, 100, 700);
        g.drawString("Pontuação: "+cobra.pontuacao, 500, 10);
    }
    public void run() {
        int i = 0;
        Random r = new Random();
        while(cobra.viva) {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {}
            cobra.mover();
            if((i++)%100 == 0) {
                macas.add(new Point(r.nextInt(60), r.nextInt(60)));
            }
            repaint();
        }
    }
}

class Cobra {
    static final int RIGHT = 0;
    static final int LEFT = 1;
    static final int UP = 2;
    static final int DOWN = 3;
    int direcao;
    boolean viva = true;
    int pontuacao;
    ArrayList<Point> corpo = new ArrayList<Point>();
    ArrayList<Point> macas;
    public Cobra(ArrayList<Point> macas) {
        this.macas = macas;
        for (int i = 0; i < 3; i++) {
            corpo.add(new Point(0,0));
        }
    }
    public void mover() {
        for (int i = corpo.size()-1; i > 0; i--) {
            corpo.get(i).x = corpo.get(i-1).x;
            corpo.get(i).y = corpo.get(i-1).y;
        }
        Point cabeca = corpo.get(0);
        if(direcao == RIGHT) {
            cabeca.x++;
        } else if(direcao == LEFT) {
            cabeca.x--;
        } else if(direcao == UP) {
            cabeca.y--;
        } else if(direcao == DOWN) {
            cabeca.y++;
        }
        
        if(cabeca.x < 0 || cabeca.x >= 60) {
            viva = false;
        } else if(cabeca.y < 0 || cabeca.y >= 60) {
            viva = false;
        }
        for (int i = 1; i < corpo.size(); i++) {
            if(cabeca.equals(corpo.get(i))) {
                viva = false;
            }
        }
        for (int i = 0; i < macas.size(); i++) {
            if(cabeca.equals(macas.get(i))) {
                corpo.add(new Point(corpo.get(corpo.size()-1).x, corpo.get(corpo.size()-1).y));
                macas.remove(i);
                pontuacao += 10;
            }
        }
    }
}