package ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
public class JogoDaForca extends JFrame {
    JPanel painelEsquerdo = new JPanel(new GridLayout(10, 1, 5, 5));
    PainelPintado painelForca = new PainelPintado();
    JLabel rotuloLetrasUsadas = new JLabel("Letras usadas:");
    JTextField campoLetrasUsadas = new JTextField();
    JLabel rotuloPalavra = new JLabel("Palavra:");
    JTextField campoPalavra = new JTextField();
    JLabel rotuloProximaLetra = new JLabel("Próxima letra:");
    JTextField campoProximaLetra = new JTextField();
    JButton botaoProximaLetra = new JButton("Jogar");
    JLabel rotuloArriscarPalavra = new JLabel("Arriscar palavra:");
    JTextField campoArriscarPalavra = new JTextField();
    JButton botaoArriscarPalavra = new JButton("Arriscar");
    ArrayList<String> biblioteca = new ArrayList<String>();
    String palavra;
    String letrasArriscadas = "";
    public JogoDaForca() {
        setTitle("Jogo da Forca");
        setLayout(new GridLayout(1, 2));
        add(painelEsquerdo);
        add(painelForca);
        painelEsquerdo.add(rotuloLetrasUsadas);
        painelEsquerdo.add(campoLetrasUsadas);
        painelEsquerdo.add(rotuloPalavra);
        painelEsquerdo.add(campoPalavra);
        painelEsquerdo.add(rotuloProximaLetra);
        painelEsquerdo.add(campoProximaLetra);
        painelEsquerdo.add(botaoProximaLetra);
        painelEsquerdo.add(rotuloArriscarPalavra);
        painelEsquerdo.add(campoArriscarPalavra);
        painelEsquerdo.add(botaoArriscarPalavra);
        painelForca.setBackground(Color.WHITE);
        campoLetrasUsadas.setEditable(false);
        campoPalavra.setEditable(false);
        preencherBiblioteca();
        Random r = new Random();
        palavra = biblioteca.get(r.nextInt(biblioteca.size()));
        preencheCampoPalavra();
        botaoProximaLetra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tentarNovaLetra();
            }
        });
        botaoArriscarPalavra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tentarPalavra();
            }
        });
    }
    public void tentarNovaLetra() {
        char letra = campoProximaLetra.getText().charAt(0);
        for (int i = 0; i < letrasArriscadas.length(); i++) {
            if(letra == letrasArriscadas.charAt(i)) {
                JOptionPane.showMessageDialog(rootPane, "A letra: "+letra+" já foi jogada.\nTente outra letra.");
                return;
            }
        }
        letrasArriscadas += letra;
        preencheCampoLetras();
        boolean acerto = false;
        for (int i = 0; i < palavra.length(); i++) {
            if(letra == palavra.charAt(i)) {
                acerto = true;
                verificaVitoria();
            }
        }
        preencheCampoPalavra();
        if(!acerto) {
            painelForca.erros++;
            painelForca.repaint();
            if(painelForca.erros == 7) {
                campoProximaLetra.setEnabled(false);
                campoArriscarPalavra.setEnabled(false);
                botaoArriscarPalavra.setEnabled(false);
                botaoProximaLetra.setEnabled(false);
                mostraCampoPalavra();
            }
        }
    }
    public void verificaVitoria() {
        int acertos = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letraPalavra = palavra.charAt(i);
            for (int j = 0; j < letrasArriscadas.length(); j++) {
                if(letraPalavra == letrasArriscadas.charAt(j)) {
                    acertos++;
                    break;
                }
            }
        }
        if(acertos == palavra.length()) {
            JOptionPane.showMessageDialog(rootPane, "Parabéns!!!\nVocê acertou a palavra:\n"+palavra);
            botaoProximaLetra.removeActionListener(botaoProximaLetra.getActionListeners()[0]);
            botaoArriscarPalavra.removeActionListener(botaoArriscarPalavra.getActionListeners()[0]);
            mostraCampoPalavra();
        }
    }
    public void tentarPalavra() {
        String tentativa = campoArriscarPalavra.getText();
        for (int i = 0; i < tentativa.length(); i++) {
            char letra = tentativa.charAt(i);
            int acerto = 0;
            for (int j = 0; j < letrasArriscadas.length(); j++) {
                if(letra == letrasArriscadas.charAt(j)) {
                    acerto++;
                }
            }
            if(acerto == 0) {
                letrasArriscadas += letra;
            }
        }
        preencheCampoLetras();
        int acertos = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letraPalavra = palavra.charAt(i);
            for (int j = 0; j < letrasArriscadas.length(); j++) {
                if(letraPalavra == letrasArriscadas.charAt(j)) {
                    acertos++;
                    break;
                }
            }
        }
        if(acertos == palavra.length()) {
            JOptionPane.showMessageDialog(rootPane, "Parabéns!!!\nVocê acertou a palavra:\n"+palavra);
            preencheCampoPalavra();
        } else {
            painelForca.erros = 7;
            painelForca.repaint();
            campoProximaLetra.setEnabled(false);
            campoArriscarPalavra.setEnabled(false);
            botaoArriscarPalavra.setEnabled(false);
            botaoProximaLetra.setEnabled(false);
            mostraCampoPalavra();
        }
    }
    public void mostraCampoPalavra() {
        String apresentacao = "";
        for (int i = 0; i < palavra.length(); i++) {
            apresentacao += palavra.charAt(i)+"  ";
        }
        campoPalavra.setText(apresentacao);
    }
    public void preencheCampoPalavra() {
        String apresentacao = "";
        for(int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            boolean acerto = false;
            for(int j = 0; j < letrasArriscadas.length(); j++) {
                if (letra == letrasArriscadas.charAt(j)) {
                    acerto = true;
                }
            }
            if(acerto) {
                apresentacao += letra+"  ";
            } else {
                apresentacao += "_  ";
            }
        }
        campoPalavra.setText(apresentacao);
    }
    public void preencheCampoLetras() {
        String apresentacao = "";
        for(int i = 0; i < letrasArriscadas.length(); i++) {
            apresentacao += letrasArriscadas.charAt(i)+", ";
        }
        campoLetrasUsadas.setText(apresentacao);
    }
    public static void main(String[] args) {
        JogoDaForca janela = new JogoDaForca();
        janela.setSize(500, 420);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
    }
    public void preencherBiblioteca() {
        biblioteca.add("computador");
        biblioteca.add("ventilador");
        biblioteca.add("óculos");
        biblioteca.add("mesa");
        biblioteca.add("teto");
        biblioteca.add("paralelepipedo");
        biblioteca.add("biblioteca");
        biblioteca.add("monitor");
        biblioteca.add("mouse");
        biblioteca.add("loja");
        biblioteca.add("cama");
        biblioteca.add("gato");
        biblioteca.add("cortina");
        biblioteca.add("fogo");
        biblioteca.add("filme");
        biblioteca.add("frozen");
        biblioteca.add("tela");
        biblioteca.add("enrolados");
        biblioteca.add("chave");
        biblioteca.add("pimenta");
        biblioteca.add("corredor");
        biblioteca.add("coraline");
    }
}
class PainelPintado extends JPanel {
    int erros;
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawLine(10, 350, 240, 350);
        g.drawLine(20, 350, 20, 20);
        g.drawLine(20, 20, 150, 20);
        g.drawLine(150, 20, 150, 40);
        g.setColor(Color.BLUE);
        if(erros >= 1) {
            g.drawArc(100, 40, 100, 100, 0, 360);// Cabeça
        }
        if(erros >= 2) {
            g.drawLine(150, 140, 150, 240); // Tronco
        }
        if(erros >= 3) {
            g.drawLine(100, 220, 150, 160); // Braço direito
        }
        if(erros >= 4) {
            g.drawLine(200, 220, 150, 160); // Braço esquerdo
        }
        if(erros >= 5) {
            g.drawLine(100, 300, 150, 240); // Perna direita
        }
        if(erros >= 6) {
            g.drawLine(200, 300, 150, 240); // Perna esquerda
        }
        if(erros >= 7) {
            g.drawLine(120, 60, 140, 80); // Rosto
            g.drawLine(140, 60, 120, 80); // Rosto
            g.drawLine(160, 60, 180, 80); // Rosto
            g.drawLine(180, 60, 160, 80); // Rosto
            g.drawArc(125, 95, 50, 50, 0, 180); // Rosto
        }
    }
}