package ex;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class JogoTetris extends JFrame {
    PainelDesenhado painel = new PainelDesenhado();
    public JogoTetris() {
        setTitle("Tetris");
        add(painel);
        painel.setBackground(Color.WHITE);
        Thread t = new Thread(painel);
        t.start();
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                    painel.irParaEsquerda();
                } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    painel.irParaDireita();
                } else if(e.getKeyCode() == KeyEvent.VK_UP) {
                    // Girar peça
                    painel.girar();
                } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
                    // Descer imediatamente
                    painel.descerImediatamente();
                }
            }
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    public static void main(String[] args) {
        JogoTetris janela = new JogoTetris();
        janela.setSize(500, 600);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
    }
}
class PainelDesenhado extends JPanel implements Runnable {
    Peca[][] matriz = new Peca[20][10]; // Vinte Linhas e 10 Colunas
    boolean jogando = true;
    Peca pecaAtual;
    Conjunto conjuntoAtual;
//    Point posicaoPecaAtual;
    int pontuacao;
    int tempo = 550;
    public PainelDesenhado() {
        novoConjunto();
    }
    public void novoConjunto() {
        conjuntoAtual = new Conjunto(5, 0);
        boolean podeCriar = true;
        for (int i = 0; i < 4; i++) {
            if(matriz[conjuntoAtual.pecas[i].y][conjuntoAtual.pecas[i].x] != null) {
                podeCriar = false;
            }
        }
        if(podeCriar) {
            repaint();
            pontuacao += 10;
        } else {
            JOptionPane.showMessageDialog(this, "GAME OVER\n\nVocê fez "+pontuacao+" pontos.");
            jogando = false;
        }
    }
    public void run() {
        while(jogando) {
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
            }
            descer();
            repaint();
            if(pontuacao % 200 == 0) {
                tempo = (int)(tempo * 0.95);
            }
        }
    }
    public void descer() {
        boolean descer = conjuntoAtual.descer(matriz);
        if(!descer) {
            verificaLinha();
            novoConjunto();
        }
    }
    public void descerImediatamente() {
        conjuntoAtual.descerImediatamente(matriz);
//        while(posicaoPecaAtual.y < 19 && matriz[posicaoPecaAtual.y+1][posicaoPecaAtual.x] == null) {
//            posicaoPecaAtual.y++;
//        }
//        matriz[posicaoPecaAtual.y][posicaoPecaAtual.x] = pecaAtual;
        verificaLinha();
        novoConjunto();
    }
    public void girar() {
        conjuntoAtual.girar(matriz);
    }
    public void irParaEsquerda() {
        conjuntoAtual.irParaEsquerda(matriz);
//        if(posicaoPecaAtual.x > 0 && matriz[posicaoPecaAtual.y][posicaoPecaAtual.x-1] == null) {
//            posicaoPecaAtual.x--;
//        }
    }
    public void irParaDireita() {
        conjuntoAtual.irParaDireita(matriz);
//        if(posicaoPecaAtual.x < 9 && matriz[posicaoPecaAtual.y][posicaoPecaAtual.x+1] == null) {
//            posicaoPecaAtual.x++;
//        }
    }
    public void verificaLinha() {
        for (int i = 0; i < 20; i++) {
            int marcados = 0;
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j] != null) {
                    marcados++;
                }
            }
            if(marcados == 10) {
                descerLinha(i);
            }
        }
    }
    public void descerLinha(int inicio) {
        for (int i = inicio; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = matriz[i-1][j];
            }
        }
        for (int j = 0; j < 10; j++) {
            matriz[0][j] = null;
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(10, 10, 200, 400);
        g.drawString("Pontuação: "+pontuacao, 220, 10);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if(matriz[i][j] != null) {
                    g.setColor(matriz[i][j].cor);
                    g.fillRect(j*20+10, i*20+10, 20, 20);
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            Peca pecaAtual = conjuntoAtual.pecas[i];
            g.setColor(pecaAtual.cor);
            g.fillRect((pecaAtual.x)*20+10, (pecaAtual.y)*20+10, 20, 20);
        }
//        g.setColor(pecaAtual.cor);
//        g.fillRect(posicaoPecaAtual.x*20+10, posicaoPecaAtual.y*20+10, 20, 20);
    }
}
class Conjunto {
    Peca[] pecas = new Peca[4];
    int angulo; // Pode ser 0, 90, 180, 270.
    public Conjunto(int x, int y) {
        for (int i = 0; i < 4; i++) {
            pecas[i] = new Peca();
        }
        Random random = new Random();
        int aleatorio = random.nextInt(7);
        if(aleatorio == 0) {
            //linha
            pecas[0].x = x-1;
            pecas[0].y = y;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x+1;
            pecas[2].y = y;
            pecas[3].x = x+2;
            pecas[3].y = y;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.GRAY;
            }
        } else if(aleatorio == 1) {
            //z
            pecas[0].x = x-1;
            pecas[0].y = y;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x;
            pecas[2].y = y+1;
            pecas[3].x = x+1;
            pecas[3].y = y+1;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.RED;
            }
        } else if(aleatorio == 2) {
            //s
            pecas[0].x = x-1;
            pecas[0].y = y+1;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x;
            pecas[2].y = y+1;
            pecas[3].x = x+1;
            pecas[3].y = y;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.GREEN;
            }
        } else if(aleatorio == 3) {
            // l
            pecas[0].x = x-1;
            pecas[0].y = y;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x+1;
            pecas[2].y = y;
            pecas[3].x = x-1;
            pecas[3].y = y+1;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.PINK;
            }
        } else if(aleatorio == 4) {
            //j
            pecas[0].x = x-1;
            pecas[0].y = y;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x+1;
            pecas[2].y = y;
            pecas[3].x = x+1;
            pecas[3].y = y+1;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.BLUE;
            }
        } else if(aleatorio == 5) {
            // L
            pecas[0].x = x-1;
            pecas[0].y = y;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x+1;
            pecas[2].y = y;
            pecas[3].x = x;
            pecas[3].y = y+1;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.ORANGE;
            }
        } else if(aleatorio == 6) {
            // quadrado
            pecas[0].x = x+1;
            pecas[0].y = y;
            pecas[1].x = x;
            pecas[1].y = y;
            pecas[2].x = x;
            pecas[2].y = y+1;
            pecas[3].x = x+1;
            pecas[3].y = y+1;
            for (int i = 0; i < 4; i++) {
                pecas[i].cor = Color.YELLOW;
            }
        }
    }
    public void irParaDireita(Peca[][] matriz) {
        boolean podeMover = true;
        for (int i = 0; i < 4; i++) {
            if(pecas[i].x >= 9 || matriz[pecas[i].y][pecas[i].x+1] != null) {
                podeMover = false;
            }
        }
        if(podeMover) {
            for (int i = 0; i < 4; i++) {
                pecas[i].x++;
            }
        }
    }
    public void irParaEsquerda(Peca[][] matriz) {
        boolean podeMover = true;
        for (int i = 0; i < 4; i++) {
            if(pecas[i].x <= 0 || matriz[pecas[i].y][pecas[i].x-1] != null) {
                podeMover = false;
            }
        }
        if(podeMover) {
            for (int i = 0; i < 4; i++) {
                pecas[i].x--;
            }
        }
    }
    public boolean descer(Peca[][] matriz) { // retorna V para desceu, F para não desceu.
        boolean podeDescer = true;
        // Só pode descer até chegar ao fim da área ou até encontrar outra peça
        for (int i = 0; i < 4; i++) {
            if(pecas[i].y >= 19 || matriz[pecas[i].y+1][pecas[i].x] != null) {
                podeDescer = false;
            }
        }
        if(podeDescer) {
            for (int i = 0; i < 4; i++) {
                pecas[i].y++;
            }
        } else {// Se não puder descer, cria nova peça.
            for (int i = 0; i < 4; i++) {
                matriz[pecas[i].y][pecas[i].x] = pecas[i];
            }
        }
        return podeDescer;
    }
    public void descerImediatamente(Peca[][] matriz) {
        boolean podeDescer = true;
        // Só pode descer até chegar ao fim da área ou até encontrar outra peça
        while(podeDescer) {
            for (int i = 0; i < 4; i++) {
                if(pecas[i].y >= 19 || matriz[pecas[i].y+1][pecas[i].x] != null) {
                    podeDescer = false;
                }
            }
            if(podeDescer) {
                for (int i = 0; i < 4; i++) {
                    pecas[i].y++;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            matriz[pecas[i].y][pecas[i].x] = pecas[i];
        }
    }
    public void girar(Peca[][] matriz) {
        Peca[] novas = new Peca[4];
        for (int i = 0; i < 4; i++) {
            novas[i] = new Peca();
            novas[i].cor = pecas[0].cor;
        }
        angulo += 90;
        angulo %= 360;
        int x = pecas[1].x;
        int y = pecas[1].y;
        if(pecas[0].cor == Color.GRAY) {
            if(angulo == 0 || angulo == 180) {
                novas[0].x = x-1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x+1;
                novas[2].y = y;
                novas[3].x = x+2;
                novas[3].y = y;
            } else if(angulo == 90 || angulo == 270) {
                novas[0].x = x;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y+1;
                novas[3].x = x;
                novas[3].y = y+2;
            }
        } else if(pecas[0].cor == Color.RED) {
            if(angulo == 0) {
                novas[0].x = x-1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y+1;
                novas[3].x = x+1;
                novas[3].y = y+1;
            } else if(angulo == 90) {
                novas[0].x = x;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x-1;
                novas[2].y = y;
                novas[3].x = x-1;
                novas[3].y = y+1;
            } else if(angulo == 180) {
                novas[0].x = x+1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y-1;
                novas[3].x = x-1;
                novas[3].y = y-1;
            } else if(angulo == 270) {
                novas[0].x = x;
                novas[0].y = y+1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x+1;
                novas[2].y = y;
                novas[3].x = x+1;
                novas[3].y = y-1;
            }
        } else if(pecas[0].cor == Color.GREEN) {
            if(angulo == 0) {
                novas[0].x = x-1;
                novas[0].y = y+1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y+1;
                novas[3].x = x+1;
                novas[3].y = y;
            } else if(angulo == 90) {
                novas[0].x = x-1;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x-1;
                novas[2].y = y;
                novas[3].x = x;
                novas[3].y = y+1;
            } else if(angulo == 180) {
                novas[0].x = x+1;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y-1;
                novas[3].x = x-1;
                novas[3].y = y;
            } else if(angulo == 270) {
                novas[0].x = x+1;
                novas[0].y = y+1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x+1;
                novas[2].y = y;
                novas[3].x = x;
                novas[3].y = y-1;
            }
        } else if(pecas[0].cor == Color.PINK) {
            if(angulo == 0) {
                novas[0].x = x-1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x+1;
                novas[2].y = y;
                novas[3].x = x-1;
                novas[3].y = y+1;
            } else if(angulo == 90) {
                novas[0].x = x;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y+1;
                novas[3].x = x-1;
                novas[3].y = y-1;
            } else if(angulo == 180) {
                novas[0].x = x+1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x-1;
                novas[2].y = y;
                novas[3].x = x+1;
                novas[3].y = y-1;
            } else if(angulo == 270) {
                novas[0].x = x;
                novas[0].y = y+1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y-1;
                novas[3].x = x+1;
                novas[3].y = y+1;
            }
        } else if(pecas[0].cor == Color.BLUE) {
            if(angulo == 0) {
                novas[0].x = x-1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x+1;
                novas[2].y = y;
                novas[3].x = x+1;
                novas[3].y = y+1;
            } else if(angulo == 90) {
                novas[0].x = x;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y+1;
                novas[3].x = x-1;
                novas[3].y = y+1;
            } else if(angulo == 180) {
                novas[0].x = x+1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x-1;
                novas[2].y = y;
                novas[3].x = x-1;
                novas[3].y = y-1;
            } else if(angulo == 270) {
                novas[0].x = x;
                novas[0].y = y+1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y-1;
                novas[3].x = x+1;
                novas[3].y = y-1;
            }
        } else if(pecas[0].cor == Color.ORANGE) {
            if(angulo == 0) {
                novas[0].x = x-1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x+1;
                novas[2].y = y;
                novas[3].x = x;
                novas[3].y = y+1;
            } else if(angulo == 90) {
                novas[0].x = x;
                novas[0].y = y-1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y+1;
                novas[3].x = x-1;
                novas[3].y = y;
            } else if(angulo == 180) {
                novas[0].x = x+1;
                novas[0].y = y;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x-1;
                novas[2].y = y;
                novas[3].x = x;
                novas[3].y = y-1;
            } else if(angulo == 270) {
                novas[0].x = x;
                novas[0].y = y+1;
                novas[1].x = x;
                novas[1].y = y;
                novas[2].x = x;
                novas[2].y = y-1;
                novas[3].x = x+1;
                novas[3].y = y;
            }
        } else if(pecas[0].cor == Color.YELLOW) {
            novas[0].x = x+1;
            novas[0].y = y;
            novas[1].x = x;
            novas[1].y = y;
            novas[2].x = x;
            novas[2].y = y+1;
            novas[3].x = x+1;
            novas[3].y = y+1;
        }
        boolean podeGirar = true;
        for (int i = 0; i < 4; i++) {
            if(novas[i].x < 0 || novas[i].x >= 10 || novas[i].y < 0 || novas[i].y >= 20 ||
                    matriz[novas[i].y][novas[i].x] != null) {
                podeGirar = false;
            }
        }
        if(podeGirar) {
            for (int i = 0; i < 4; i++) {
                pecas[i].x = novas[i].x;
                pecas[i].y = novas[i].y;
            }
        }
    }
}
class Peca { // Peça
    Color cor;
    int x;
    int y;
}