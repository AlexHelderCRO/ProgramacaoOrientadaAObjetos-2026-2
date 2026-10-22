package aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame {
	JTextField campo = new JTextField();
	JPanel painelDosBotoes = new JPanel(new GridLayout(4, 4, 5, 5));
	JButton[] botoesNumericos = new JButton[10];
	JButton botaoSoma = new JButton("+");
	JButton botaoSubtracao = new JButton("-");
	JButton botaoMultiplicacao = new JButton("×");
	JButton botaoDivisao = new JButton("÷");
	JButton botaoIgual = new JButton("=");
	JButton botaoPonto = new JButton(",");
	double operando1;
	char operacao;
	
	public Calculadora() {
		setTitle("Calculadora--");
		setLayout(new BorderLayout());
		add(campo, BorderLayout.NORTH);
		add(painelDosBotoes, BorderLayout.CENTER);
		for (int i = 0; i < botoesNumericos.length; i++) {
			botoesNumericos[i] = new JButton(""+i);
			botoesNumericos[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton botao = (JButton)e.getSource();
					String texto = campo.getText();
					texto += botao.getText();
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
		campo.setPreferredSize(new Dimension(campo.getWidth(), 70));
		campo.setFont(new Font("Arial", Font.PLAIN, 24));
		botaoPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				texto += ".";
				campo.setText(texto);
			}
		});
		botaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1 = Double.parseDouble(campo.getText());
				operacao = '+';
				campo.setText("");
			}
		});
		botaoSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1 = Double.parseDouble(campo.getText());
				operacao = '-';
				campo.setText("");
			}
		});
		botaoMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1 = Double.parseDouble(campo.getText());
				operacao = '×';
				campo.setText("");
			}
		});
		botaoDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando1 = Double.parseDouble(campo.getText());
				operacao = '÷';
				campo.setText("");
			}
		});
		botaoIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double operando2 = Double.parseDouble(campo.getText());
				double resultado = 0;
				if(operacao == '+') {
					resultado = operando1 + operando2;
				} else if(operacao == '-') {
					resultado = operando1 - operando2;
				} else if(operacao == '×') {
					resultado = operando1 * operando2;
				} else if(operacao == '÷') {
					resultado = operando1 / operando2;
				}
				campo.setText(""+resultado);
			}
		});
	}
	
	public static void main(String[] args) {
		UIManager.put("Button.font", new Font("Arial", Font.PLAIN, 24));
		Calculadora janela = new Calculadora();
		janela.setSize(400, 500);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
