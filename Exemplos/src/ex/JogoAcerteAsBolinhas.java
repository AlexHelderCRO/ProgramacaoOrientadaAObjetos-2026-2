package ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
public class JogoAcerteAsBolinhas extends JFrame {
    PainelDesenhado2 painel = new PainelDesenhado2();
    public JogoAcerteAsBolinhas() {
        setTitle("Acerte as Bolinhas");
        add(painel);
        painel.setBackground(Color.WHITE);
        Thread t1 = new Thread(painel);
        t1.start();
        painel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                Point clique = e.getPoint();
                for (int i = 0; i < painel.bolinhas.size(); i++) {
                    Point bolinha = painel.bolinhas.get(i);
                    if(Math.hypot(bolinha.x-clique.x, bolinha.y-clique.y) < 10) {
                        painel.pontuacao += 10;
                        painel.tempo = (int)(painel.tempo*0.95);
                        painel.bolinhas.remove(bolinha);
                    }
                }
            }
            public void mousePressed(MouseEvent e) {
            }
            public void mouseReleased(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    public static void main(String[] args) {
        JogoAcerteAsBolinhas janela = new JogoAcerteAsBolinhas();
        janela.setSize(800, 600);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
    }
}
class PainelDesenhado2 extends JPanel implements Runnable {
    int pontuacao;
    int tempo = 100;
    ArrayList<Bola> bolinhas = new ArrayList<Bola>();
    public void run() {
        Random random = new Random();
        while(true) {
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
            }
            int aleatorio = random.nextInt(100);
            if(aleatorio <= 5) {
                int direcao = random.nextInt(5);
                Bola bola;
                if(direcao != Bola.GIRANDO) {
                    bola = new Bola();
                    bola.x = random.nextInt(780)+10;
                } else {
                    bola = new BolaGirando();
                    ((BolaGirando)bola).eixo = new Point();
                    ((BolaGirando)bola).eixo.x = random.nextInt(780)+10;
                }
                bola.direcao = direcao;
                bolinhas.add(bola);
                for (int i = 0; i < bolinhas.size(); i++) {
                    if(bolinhas.get(i).direcao == 0 || bolinhas.get(i).direcao == 1) {
                        bolinhas.get(i).direcao = random.nextInt(2);
                    }
                }
            }
            for (int i = 0; i < bolinhas.size(); i++) {
                bolinhas.get(i).y++;
                if(bolinhas.get(i).direcao == Bola.DIREITA) {
                    if(bolinhas.get(i).x >= 790) {
                        bolinhas.get(i).direcao = Bola.ESQUERDA;
                    } else {
                        bolinhas.get(i).x++;
                    }
                }
                if(bolinhas.get(i).direcao == Bola.ESQUERDA) {
                    if(bolinhas.get(i).x <= 10) {
                        bolinhas.get(i).direcao = Bola.DIREITA;
                    } else {
                        bolinhas.get(i).x--;
                    }
                }
                if(bolinhas.get(i).direcao == Bola.ACELERANDO_E_RETARDANDO) {
                    if(bolinhas.get(i).y%100 <= 50) {
                        bolinhas.get(i).y += random.nextInt(3);
                    } else if(bolinhas.get(i).y >= 70 && bolinhas.get(i).y <= 90) {
                        bolinhas.get(i).y -= random.nextInt(2);
                    }
                }
                if(bolinhas.get(i).direcao == Bola.GIRANDO) {
                    BolaGirando girando = (BolaGirando)bolinhas.get(i);
                    girando.eixo.y++;
                    girando.angulo += 15;
                    girando.angulo %= 360;
                    girando.x = (int)(girando.eixo.x+Math.sin(girando.angulo*Math.PI/180)*10);
                    girando.y = (int)(girando.eixo.y+Math.cos(girando.angulo*Math.PI/180)*10);
                }
                if(bolinhas.get(i).y > 600) {
                    bolinhas.remove(i);
                }
            }
            repaint();
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        for (int i = 0; i < bolinhas.size(); i++) {
            Point bolinha = bolinhas.get(i);
            g.fillArc(bolinha.x-10, bolinha.y-10, 20, 20, 0, 360);
        }
        g.setColor(Color.BLACK);
        g.drawString("Pontuação: "+pontuacao, 700, 10);
    }
}
class Bola extends Point {
    int direcao;
    public static final int NORMAL = 4;
    public static final int DIREITA = 0;
    public static final int ESQUERDA = 1;
    public static final int GIRANDO = 2;
    public static final int ACELERANDO_E_RETARDANDO = 3;
}
class BolaGirando extends Bola {
    int angulo;
    Point eixo;
}