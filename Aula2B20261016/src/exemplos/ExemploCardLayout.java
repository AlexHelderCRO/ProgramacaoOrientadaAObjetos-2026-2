package exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExemploCardLayout extends JFrame {
    JPanel contentPane;
    CardLayout cardLayout;
    JPanel painel1;
    JPanel painel2;
    JPanel painel3;
    JComboBox comboBox;
    JButton botaoP1;
    JRadioButton radio1;
    JRadioButton radio2;
    JRadioButton radio3;
    JButton botaoP2;
    JButton botaoP3B1;
    JButton botaoP3B2;
    JButton botaoP3B3;
    
    public ExemploCardLayout() {
        super("Exemplo de CardLayout");
        contentPane = (JPanel)getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        painel1 = new JPanel(new FlowLayout());
        painel2 = new JPanel(new FlowLayout());
        painel3 = new JPanel(new FlowLayout());
        add(painel1, "Painel 1");
        add(painel2, "Painel 2");
        add(painel3, "Painel 3");
        comboBox = new JComboBox();
        comboBox.addItem("Painel 1");
        comboBox.addItem("Painel 2");
        comboBox.addItem("Painel 3");
        painel1.add(comboBox);
        botaoP1 = new JButton("Ok");
        painel1.add(botaoP1);
        botaoP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(contentPane, (String) comboBox.getSelectedItem());
            }
        });
        radio1 = new JRadioButton("Painel 1");
        radio1.setSelected(true);
        radio1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                radio2.setSelected(false);
                radio3.setSelected(false);
            }
        });
        radio2 = new JRadioButton("Painel 2");
        radio2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                radio1.setSelected(false);
                radio3.setSelected(false);
            }
        });
        radio3 = new JRadioButton("Painel 3");
        radio3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                radio1.setSelected(false);
                radio2.setSelected(false);
            }
        });
        botaoP2 = new JButton("Ok");
        botaoP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (radio1.isSelected()) {
                    cardLayout.show(contentPane, "Painel 1");
                } else if (radio2.isSelected()) {
                    cardLayout.show(contentPane, "Painel 2");
                } else if (radio3.isSelected()) {
                    cardLayout.show(contentPane, "Painel 3");
                }
            }
        });
        painel2.add(radio1);
        painel2.add(radio2);
        painel2.add(radio3);
        painel2.add(botaoP2);
        botaoP3B1 = new JButton("Painel 1");
        botaoP3B2 = new JButton("Painel 2");
        botaoP3B3 = new JButton("Painel 3");
        painel3.add(botaoP3B1);
        botaoP3B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(contentPane, "Painel 1");
            }
        });
        painel3.add(botaoP3B2);
        botaoP3B2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(contentPane, "Painel 2");
            }
        });
        painel3.add(botaoP3B3);
        botaoP3B3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cardLayout.show(contentPane, "Painel 3");
            }
        });
    }
    
    public static void main(String[] args) {
        ExemploCardLayout ce = new ExemploCardLayout();
        ce.setSize(400,300);
        ce.setVisible(true);
    }
    
}
