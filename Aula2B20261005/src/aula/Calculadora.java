package aula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
	JLabel rotulo1 = new JLabel("Digite um número: ");
	JTextField campo1 = new JTextField(10);
	JLabel rotulo2 = new JLabel("Digite outro número: ");
	JTextField campo2 = new JTextField(10);
	JRadioButton radioSoma = new JRadioButton("+");
	JRadioButton radioSubtracao = new JRadioButton("-");
	JRadioButton radioMultiplicacao = new JRadioButton("×");
	JRadioButton radioDivisao = new JRadioButton("÷");
	JButton botao = new JButton("Calcular");
	JLabel rotuloR = new JLabel("Resultado:");
	JTextField campoR = new JTextField(10);
	ButtonGroup grupo = new ButtonGroup();
	
	public Calculadora() {
		setLayout(new FlowLayout());
		add(rotulo1);
		add(campo1);
		add(rotulo2);
		add(campo2);
		add(radioSoma);
		add(radioSubtracao);
		add(radioMultiplicacao);
		add(radioDivisao);
		add(botao);
		add(rotuloR);
		add(campoR);
		grupo.add(radioSoma);
		grupo.add(radioSubtracao);
		grupo.add(radioMultiplicacao);
		grupo.add(radioDivisao);
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(campo1.getText());
				double num2 = Double.parseDouble(campo2.getText());
				double resultado = 0;
				if(radioSoma.isSelected()) {
					resultado = num1+num2;
				} else if(radioSubtracao.isSelected()) {
					resultado = num1-num2;
				} else if(radioMultiplicacao.isSelected()) {
					resultado = num1*num2;
				} else if(radioDivisao.isSelected()) {
					resultado = num1/num2;
				}
				campoR.setText(""+resultado);
			}
		});
		campoR.setEditable(false);
	}
	
	public static void main(String[] args) {
		Calculadora janela = new Calculadora();
		janela.setSize(280, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE); // Encerra o programa quando clica no "X".
		janela.setLocationRelativeTo(null); // Centraliza a janela
	}

}
