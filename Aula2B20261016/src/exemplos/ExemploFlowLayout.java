package exemplos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author yoda
 */
public class ExemploFlowLayout extends JFrame {
    JLabel rotulo1;
    JTextField campo1;
    JLabel rotulo2;
    JTextField campo2;
    JButton botao;
    JTextField resultado;

    public ExemploFlowLayout() {
        super("Exemplo com FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new FlowLayout()); Sem argumento, ele centraliza.
        setLayout(new FlowLayout(FlowLayout.RIGHT));// O argumento está alinhando à esquerda. Adivinha como alinhar à direita...
        rotulo1 = new JLabel("Número 1");
        add(rotulo1);
        campo1 = new JTextField(10);
        add(campo1);
        rotulo2 = new JLabel("Número 2");
        add(rotulo2);
        campo2 = new JTextField(10);
        add(campo2);
        botao = new JButton("Somar");
        add(botao);
        resultado = new JTextField(10);
        add(resultado);
    }
    public static void main(String[] args) {
        ExemploFlowLayout janela = new ExemploFlowLayout();
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
}
