package aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OperacoesMatematicas extends JFrame {
	JLabel rotulo1 = new JLabel("Num1: ");
	JLabel rotulo2 = new JLabel("Num2: ");
	JLabel rotulo3 = new JLabel("Resultado: ");
	JTextField campo1 = new JTextField(10);
	JTextField campo2 = new JTextField(10);
	JTextField campo3 = new JTextField(10);
	JButton botao = new JButton("      Calcular      ");
	JRadioButton radioSomar = new JRadioButton("+");
	JRadioButton radioSubtrair = new JRadioButton("-");
	JRadioButton radioMultiplicar = new JRadioButton("×");
	JRadioButton radioDividir = new JRadioButton("÷");
	ButtonGroup grupo = new ButtonGroup();

	public OperacoesMatematicas() {
		setTitle("Calculo de operações matemáticas");
		setLayout(new FlowLayout());
		add(rotulo1);
		add(campo1);
		add(rotulo2);
		add(campo2);
		add(radioSomar);
		add(radioSubtrair);
		add(radioMultiplicar);
		add(radioDividir);
		add(botao);
		add(rotulo3);
		add(campo3);
		grupo.add(radioSomar);
		grupo.add(radioSubtrair);
		grupo.add(radioMultiplicar);
		grupo.add(radioDividir);
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(campo1.getText());
				double num2 = Double.parseDouble(campo2.getText());
				double resultado = 0;
				if(radioSomar.isSelected()) {
					resultado = num1+num2;
				} else if(radioSubtrair.isSelected()) {
					resultado = num1-num2;
				} else if(radioMultiplicar.isSelected()) {
					resultado = num1*num2;
				} else if(radioDividir.isSelected()) {
					resultado = num1/num2;
				}
				campo3.setText(""+resultado);
			}
		});
	}
	
	public static void main(String[] args) {
		OperacoesMatematicas janela = new OperacoesMatematicas();
		janela.setSize(200, 250);
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

}
