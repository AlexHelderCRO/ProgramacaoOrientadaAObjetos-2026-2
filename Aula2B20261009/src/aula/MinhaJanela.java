package aula;

import java.awt.*; // FlowLayout.
import java.awt.event.*; // Evento do botão.
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.*;

public class MinhaJanela extends JFrame {
	JLabel rotuloProduto = new JLabel("Produto: ");
	JLabel rotuloMarca = new JLabel("Marca: ");
	JLabel rotuloPreco = new JLabel("Preço: ");
	JTextField campoProduto = new JTextField(20);
	JTextField campoMarca = new JTextField(20);
	JTextField campoPreco = new JTextField(20);
	JButton botao = new JButton("Cadastrar");
	JTextArea area = new JTextArea(5, 40);
	
	ArrayList<Produto> lista = new ArrayList<Produto>();
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	
	public MinhaJanela() {
		setTitle("Cadastro");
		setLayout(new FlowLayout());
		add(rotuloProduto);
		add(campoProduto);
		add(rotuloMarca);
		add(campoMarca);
		add(rotuloPreco);
		add(campoPreco);
		add(botao);
		add(area);
		area.setText("Produto\tMarca\tPreço\n");
		
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto();
				produto.nome = campoProduto.getText();
				produto.marca = campoMarca.getText();
				produto.preco = Double.parseDouble(campoPreco.getText());
				lista.add(produto);
				area.append(produto.nome+"\t"+produto.marca+"\t"+df.format(produto.preco)+"\n");
			}
		});
		
	}

	public static void main(String[] args) {
		MinhaJanela janela = new MinhaJanela();
		janela.setSize(600, 300);
		janela.setVisible(true); // Joga o objeto na tela.
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE); // Para encerrar o programa quando clicar no X.
		janela.setLocationRelativeTo(null);// Opcional - Centraliza a janela
	}

}
class Produto {
	String nome;
	String marca;
	double preco;
}