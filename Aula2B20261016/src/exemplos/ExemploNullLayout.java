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
public class ExemploNullLayout extends JFrame {
    JLabel rotulo1;
    JTextField campo1;
    JLabel rotulo2;
    JTextField campo2;
    JButton botao;
    JTextField resultado;
    
    public ExemploNullLayout() {
        super("Exemplo de NullLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        rotulo1 = new JLabel("Número 1:");
        add(rotulo1);
        rotulo1.setBounds(10, 10, 80, 20);
        campo1 = new JTextField(10);
        add(campo1);
        campo1.setBounds(100, 10, 80, 20);
        rotulo2 = new JLabel("Número 2:");
        add(rotulo2);
        rotulo2.setBounds(10, 40, 80, 20);
        campo2 = new JTextField(10);
        add(campo2);
        campo2.setBounds(100, 40, 80, 20);
        botao = new JButton("Somar");
        add(botao);
        botao.setBounds(10, 70, 80, 30);
        resultado = new JTextField(10);
        add(resultado);
        resultado.setBounds(100, 75, 80, 20);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploNullLayout frame = new ExemploNullLayout();
        frame.setSize(200,150);
        frame.setVisible(true);
    }
    
}
