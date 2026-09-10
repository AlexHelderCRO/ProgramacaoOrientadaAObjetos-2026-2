package ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class CampoMinado extends JFrame {
    JPanel barraSuperior = new JPanel(new FlowLayout());
    JLabel rotuloMinasOcultas = new JLabel("Minas ocultas: ");
    JTextField campoMinasOcultas = new JTextField(5);
    JLabel rotuloMinasEncontradas = new JLabel("Minas encontradas: ");
    JTextField campoMinasEncontradas = new JTextField(5);
    JPanel painelCampo = new JPanel(new GridLayout(15, 20));
    Botao[][] campo = new Botao[15][20];
    int minasOcultas;
    int minasEncontradas;
    public CampoMinado() {
        setTitle("Campo Minado");
        setLayout(new BorderLayout());
        add(barraSuperior, BorderLayout.NORTH);
        add(painelCampo, BorderLayout.CENTER);
        barraSuperior.add(rotuloMinasOcultas);
        barraSuperior.add(campoMinasOcultas);
        barraSuperior.add(rotuloMinasEncontradas);
        barraSuperior.add(campoMinasEncontradas);
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 20; j++) {
                campo[i][j] = new Botao(i,j);
                painelCampo.add(campo[i][j]);
                campo[i][j].addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent e) {
                        Botao botao = (Botao)e.getSource();
                        if(e.getButton() == MouseEvent.BUTTON1) { // Botão Esquerdo
                            cliqueEsquerdo(botao.x, botao.y);
                        } else if(e.getButton() == MouseEvent.BUTTON2) { // Botão Central ou de Rolagem
                        } else if(e.getButton() == MouseEvent.BUTTON3) { // Botão Direito
                            cliqueDireito(botao.x, botao.y);
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
        }
        espalharMinas();
        campoMinasEncontradas.setText(""+minasEncontradas);
        campoMinasEncontradas.setEditable(false);
        campoMinasOcultas.setText(""+minasOcultas);
        campoMinasOcultas.setEditable(false);
    }
    public void espalharMinas() {
        Random r = new Random();
        while(minasOcultas < 30) {
            int x = r.nextInt(15);
            int y = r.nextInt(20);
            if(!campo[x][y].temMina) {
                campo[x][y].temMina = true;
                minasOcultas++;
            }
        }
    }
    public void cliqueEsquerdo(int x, int y) {
        if(campo[x][y].situacao == Botao.MARCADO) {
            return;
        }
        if(campo[x][y].temMina) {
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 20; j++) {
                    if(campo[i][j].temMina) {
                        campo[i][j].setIcon(new ImageIcon("bomba.png"));
                    }
//                    campo[i][j].setEnabled(false);
                    campo[i][j].removeMouseListener(campo[i][j].getMouseListeners()[0]);
                    
                }
            }
            campo[x][y].setIcon(new ImageIcon("explosao.png"));
        } else {
            abrir(x, y);
        }
    }
    public void abrir(int x, int y) {
        if(!campo[x][y].isEnabled()) {
            return;
        }
        campo[x][y].setEnabled(false);
        int minasEmVolta = 0;
        if(y > 0 && campo[x][y-1].temMina) {
            minasEmVolta++;
        }
        if(y < 19 && campo[x][y+1].temMina) {
            minasEmVolta++;
        }
        if(x > 0 && campo[x-1][y].temMina) {
            minasEmVolta++;
        }
        if(x < 14 && campo[x+1][y].temMina) {
            minasEmVolta++;
        }
        if(x > 0 && y > 0 && campo[x-1][y-1].temMina) {
            minasEmVolta++;
        }
        if(x > 0 && y < 19 && campo[x-1][y+1].temMina) {
            minasEmVolta++;
        }
        if(x < 14 && y > 0 && campo[x+1][y-1].temMina) {
            minasEmVolta++;
        }
        if(x < 14 && y < 19 && campo[x+1][y+1].temMina) {
            minasEmVolta++;
        }
        
        if(minasEmVolta != 0) {
            campo[x][y].setText(""+minasEmVolta);
        } else {
            if(y > 0) {
                abrir(x, y-1);
            }
            if(y < 19) {
                abrir(x, y+1);
            }
            if(x > 0) {
                abrir(x-1, y);
            }
            if(x < 14) {
                abrir(x+1, y);
            }
            if(x > 0 && y > 0) {
                abrir(x-1, y-1);
            }
            if(x > 0 && y < 19) {
                abrir(x-1, y+1);
            }
            if(x < 14 && y > 0) {
                abrir(x+1, y-1);
            }
            if(x < 14 && y < 19) {
                abrir(x+1, y+1);
            }
        }
    }
    public void cliqueDireito(int x, int y) {
        if(campo[x][y].situacao == Botao.MARCADO) {
            campo[x][y].setIcon(null);
            campo[x][y].situacao = Botao.DESMARCADO;
            minasEncontradas--;
        } else if(campo[x][y].situacao == Botao.DESMARCADO) {
            campo[x][y].setIcon(new ImageIcon("bomba.png"));
            campo[x][y].situacao = Botao.MARCADO;
            minasEncontradas++;
        }
        campoMinasEncontradas.setText(""+minasEncontradas);
    }
    public static void main(String[] args) {
        CampoMinado janela = new CampoMinado();
        janela.setSize(900, 700);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
    }
}
class Botao extends JButton {
    public static final int DESMARCADO = 0;
    public static final int MARCADO = 1;
//    public static final int ABERTO = 1;
//    public static final int BOMBA = 2;
//    public static final int EXPLOSAO = 3;
    boolean temMina;
    int situacao;
    int x;
    int y;
    public Botao(int x, int y) {
        this.x = x;
        this.y = y;
    }
}