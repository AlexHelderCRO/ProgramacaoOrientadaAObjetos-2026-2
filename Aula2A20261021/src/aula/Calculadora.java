package aula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
	JTextField campo = new JTextField();
	JPanel painelDosBotoes = new JPanel(new GridLayout(4, 4, 3, 3));
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
		setTitle("Calculadora --");
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

		botaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				texto = texto.replace(',', '.');
				operando1 = Double.parseDouble(texto);
				operacao = '+';
				campo.setText("");
			}
		});
		botaoSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				texto = texto.replace(',', '.');
				operando1 = Double.parseDouble(texto);
				operacao = '-';
				campo.setText("");
			}
		});
		botaoMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				texto = texto.replace(',', '.');
				operando1 = Double.parseDouble(texto);
				operacao = '×';
				campo.setText("");
			}
		});
		botaoDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				texto = texto.replace(',', '.');
				operando1 = Double.parseDouble(texto);
				operacao = '÷';
				campo.setText("");
			}
		});
		
		botaoIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				texto = texto.replace(',', '.');
				double operando2 = Double.parseDouble(texto);
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
				texto = ""+resultado;
				texto = texto.replace('.', ',');
				campo.setText(texto);
			}
		});
		
		botaoPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = campo.getText();
				numero += ",";
				campo.setText(numero);
			}
		});
		
		campo.setPreferredSize(new Dimension(campo.getWidth(), 80));
		campo.setFont(new Font("Arial", Font.PLAIN, 24));
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
