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
public class ExemploBorderLayout extends JFrame {
    
    public ExemploBorderLayout() {
        super("Exemplo de BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new JTextField("Escreva algo aqui."), BorderLayout.NORTH);
        add(new JLabel("Status Bar: É a vez do jogador X"), BorderLayout.SOUTH);
        add(new JButton("Menu Lateral"), BorderLayout.EAST);
        add(new JTextArea(), BorderLayout.CENTER);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExemploBorderLayout frame = new ExemploBorderLayout();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    
}
