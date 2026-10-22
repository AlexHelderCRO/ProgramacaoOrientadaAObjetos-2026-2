package aula;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MinhaJanela extends JFrame {
	JLabel rotulo1 = new JLabel("Digite um número: ");
	JTextField campo1 = new JTextField(10);
	JLabel rotulo2 = new JLabel("Digite outro número: ");
	JTextField campo2 = new JTextField(10);
	JButton botao = new JButton("SOMAR");
	JLabel rotuloR = new JLabel("Resultado: ");
	JTextField campoR = new JTextField(10);
	
	public MinhaJanela() {
		setTitle("Somador");
		setLayout(new FlowLayout());
		add(rotulo1);
		add(campo1);
		add(rotulo2);
		add(campo2);
		add(botao);
		add(rotuloR);
		add(campoR);
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(campo1.getText());
				int num2 = Integer.parseInt(campo2.getText());
				int resultado = num1+num2;
				campoR.setText(""+resultado);
			}
		});
	}

	public static void main(String[] args) {
		MinhaJanela janela = new MinhaJanela();
		janela.setSize(300, 200);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
	}

}
