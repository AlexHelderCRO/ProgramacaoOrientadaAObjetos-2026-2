package ex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaBonitinha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaBonitinha frame = new JanelaBonitinha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaBonitinha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Digite um número:");
		lblNewLabel_1.setBounds(33, 24, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Digite  outro número:");
		lblNewLabel.setBounds(21, 56, 118, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 53, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField.getText());
				int num2 = Integer.parseInt(textField_1.getText());
				int num3 = num1+num2;
				textField_2.setText(num3+"");
			}
		});
		btnNewButton.setBounds(64, 105, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(67, 156, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 153, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

	}
}
