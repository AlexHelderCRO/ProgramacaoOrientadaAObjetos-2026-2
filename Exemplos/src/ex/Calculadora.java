package ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora extends JFrame {
    JTextField campo = new JTextField();
    JPanel painelDosBotoes = new JPanel(new GridLayout(4, 4));
    JButton[] botoesNumericos = new JButton[10];
    JButton botaoSoma = new JButton("+");
    JButton botaoSubtracao = new JButton("-");
    JButton botaoMultiplicacao = new JButton("×");
    JButton botaoDivisao = new JButton("÷");
    JButton botaoIgual = new JButton("=");
    JButton botaoPonto = new JButton(".");
    char operacao;
    double operando1;
    double operando2;
    public Calculadora() {
        setLayout(new BorderLayout());
        add(campo, BorderLayout.NORTH);
        add(painelDosBotoes, BorderLayout.CENTER);
        for (int i = 0; i < 10; i++) {
            botoesNumericos[i] = new JButton(""+i);
            botoesNumericos[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String texto = campo.getText();
                    texto += ((JButton) e.getSource()).getText();
                    campo.setText(texto);
                }
            });
        }
        painelDosBotoes.add(botoesNumericos[7]);
        painelDosBotoes.add(botoesNumericos[8]);
        painelDosBotoes.add(botoesNumericos[9]);
        painelDosBotoes.add(botaoDivisao);
        painelDosBotoes.add(botoesNumericos[4]);
        painelDosBotoes.add(botoesNumericos[5]);
        painelDosBotoes.add(botoesNumericos[6]);
        painelDosBotoes.add(botaoMultiplicacao);
        painelDosBotoes.add(botoesNumericos[1]);
        painelDosBotoes.add(botoesNumericos[2]);
        painelDosBotoes.add(botoesNumericos[3]);
        painelDosBotoes.add(botaoSubtracao);
        painelDosBotoes.add(botoesNumericos[0]);
        painelDosBotoes.add(botaoPonto);
        painelDosBotoes.add(botaoIgual);
        painelDosBotoes.add(botaoSoma);
        botaoPonto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = campo.getText();
                texto += ".";
                campo.setText(texto);
            }
        });
        botaoSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao = '+';
                operando1 = Double.parseDouble(campo.getText());
                campo.setText("");
            }
        });
        botaoSubtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao = '-';
                operando1 = Double.parseDouble(campo.getText());
                campo.setText("");
            }
        });
        botaoMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao = '×';
                operando1 = Double.parseDouble(campo.getText());
                campo.setText("");
            }
        });
        botaoDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operacao = '÷';
                operando1 = Double.parseDouble(campo.getText());
                campo.setText("");
            }
        });
        botaoIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operando2 = Double.parseDouble(campo.getText());
                double resultado = 0;
                switch(operacao) {
                    case '+':
                        resultado = operando1+operando2;
                        break;
                    case '-':
                        resultado = operando1-operando2;
                        break;
                    case '×':
                        resultado = operando1*operando2;
                        break;
                    case '÷':
                        resultado = operando1/operando2;
                        break;
                }
                campo.setText(""+resultado);
            }
        });
    }
    public static void main(String[] args) {
        Calculadora janela = new Calculadora();
        janela.setSize(400, 420);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
    }
}
