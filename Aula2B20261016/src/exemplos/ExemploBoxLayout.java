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
public class ExemploBoxLayout extends JFrame {
    JLabel rotulo1;
    JTextField campo1;
    JLabel rotulo2;
    JTextField campo2;
    JButton botao;
    JTextField resultado;
    
    public ExemploBoxLayout() {
        super("Exemplo de BoxLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
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
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploBoxLayout frame = new ExemploBoxLayout();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    
}
