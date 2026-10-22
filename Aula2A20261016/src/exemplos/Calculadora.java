package exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame {
	JTextField campo = new JTextField();
	JPanel painelDosBotoes = new JPanel(new GridLayout(4, 4, 2, 2));
	JButton[] botoesNumericos = new JButton[10];
	JButton botaoPonto = new JButton(",");
	JButton botaoSoma = new JButton("+");
	JButton botaoSubtracao = new JButton("-");
	JButton botaoMultiplicacao = new JButton("×");
	JButton botaoDivisao = new JButton("÷");
	JButton botaoIgual = new JButton("=");
	
	public Calculadora() {
		setTitle("Calculadora");
		setLayout(new BorderLayout());
		add(campo, BorderLayout.NORTH);
		add(painelDosBotoes, BorderLayout.CENTER);
		for (int i = 0; i < botoesNumericos.length; i++) {
			botoesNumericos[i] = new JButton(""+i);
			botoesNumericos[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton botao = (JButton) e.getSource();
					String numero = campo.getText();
					numero += botao.getText();
					campo.setText(numero);
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
	}

	public static void main(String[] args) {
		Calculadora janela = new Calculadora();
		janela.setSize(500, 550);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
