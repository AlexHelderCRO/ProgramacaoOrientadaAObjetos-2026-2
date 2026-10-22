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
public class ExemploGroupLayout extends JFrame {
    JLabel rotulo1;
    JTextField campo1;
    JLabel rotulo2;
    JTextField campo2;
    JButton botao;
    JTextField resultado;
    
    public ExemploGroupLayout() {
        super("Exemplo de GroupLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GroupLayout layout = new GroupLayout(getContentPane());
        setLayout(layout);
        
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
        
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup().addComponent(rotulo1).addComponent(rotulo2).addComponent(botao));
        hGroup.addGroup(layout.createParallelGroup().addComponent(campo1).addComponent(campo2).addComponent(resultado));
        layout.setHorizontalGroup(hGroup);
        
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup().addComponent(rotulo1).addComponent(campo1));
        vGroup.addGroup(layout.createParallelGroup().addComponent(rotulo2).addComponent(campo2));
        vGroup.addGroup(layout.createParallelGroup().addComponent(botao).addComponent(resultado));
        layout.setVerticalGroup(vGroup);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploGroupLayout frame = new ExemploGroupLayout();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    
}
