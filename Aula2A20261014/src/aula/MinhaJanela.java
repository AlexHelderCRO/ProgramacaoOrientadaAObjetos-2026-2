package aula;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class MinhaJanela extends JFrame {
	JLabel rotulo = new JLabel("Escreva algo:");
	JTextField campo = new JTextField(10);
	JButton botao = new JButton("Copiar");
	JTextArea area = new JTextArea(5, 10);
	public MinhaJanela() {
		setLayout(new FlowLayout());
		add(rotulo);
		add(campo);
		add(botao);
		add(area);
//		Ouvinte ouvinte = new Ouvinte();
//		botao.addActionListener(ouvinte);
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				area.append(texto+"\n");
			}
		});
	}
	public static void main(String[] args) {
		MinhaJanela janela = new MinhaJanela(); // Estou criando um objeto da janela.
		janela.setSize(400, 300); // Defino um tamanho. Sem ele aparece uma janela que só vemos os botões de maximizar e fechar janela.
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE); // Encerra o programa quando clicar no X.
		janela.setLocationRelativeTo(null); // Programa inicia centralizado na tela do computador.
		janela.setVisible(true); // Faço a janela aparecer na tela.
	}
//	class Ouvinte implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
////			JOptionPane.showMessageDialog(null, "Clicou no botão.");
//			String texto = campo.getText();
//			area.append(texto+"\n");
//		}
//	}
}
//class Ouvinte implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, "Clicou no botão.");
////		String texto = campo.getText(); // Não encontra os atributos da classe MinhaJanela.
//	}
//}
