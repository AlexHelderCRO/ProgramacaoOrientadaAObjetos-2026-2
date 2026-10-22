package exemplos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExemploGridBagLayout extends JFrame {
    JPanel contentPane;
    GridBagLayout gridBagLayout;
    GridBagConstraints constraints;
    JButton[] button;
    
    /** Creates a new instance of GridBagExemplo */
    public ExemploGridBagLayout() {
        super("Exemplo de GridBagLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);
        constraints = new GridBagConstraints();
        button = new JButton[16];
        for (int i = 0; i < 16; i++) {
            button[i] = new JButton("Botão "+(i+1));
        }
//        constraints.fill = GridBagConstraints.NONE;
        
        button[0].setPreferredSize(new Dimension(500,100));
        button[0].setMinimumSize(new Dimension(500,100));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.gridwidth = 5;
        gridBagLayout.setConstraints(button[0],constraints);
        add(button[0]);

        button[1].setPreferredSize(new Dimension(200,700));
        button[1].setMinimumSize(new Dimension(200,700));
        constraints.gridx = 5;
        constraints.gridy = 0;
        constraints.gridheight = 7;
        constraints.gridwidth = 2;
        gridBagLayout.setConstraints(button[1],constraints);
        add(button[1]);

        button[2].setPreferredSize(new Dimension(100,100));
        button[2].setMinimumSize(new Dimension(100,100));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[2],constraints);
        add(button[2]);

        button[3].setPreferredSize(new Dimension(200,200));
        button[3].setMinimumSize(new Dimension(200,200));
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 2;
        constraints.gridwidth = 2;
        gridBagLayout.setConstraints(button[3],constraints);
        add(button[3]);

        button[4].setPreferredSize(new Dimension(100,100));
        button[4].setMinimumSize(new Dimension(100,100));
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[4],constraints);
        add(button[4]);

        button[5].setPreferredSize(new Dimension(100,200));
        button[5].setMinimumSize(new Dimension(100,200));
        constraints.gridx = 4;
        constraints.gridy = 1;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[5],constraints);
        add(button[5]);

        button[6].setPreferredSize(new Dimension(100,200));
        button[6].setMinimumSize(new Dimension(100,200));
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[6],constraints);
        add(button[6]);

        button[7].setPreferredSize(new Dimension(100,200));
        button[7].setMinimumSize(new Dimension(100,200));
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridheight = 2;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[7],constraints);
        add(button[7]);

        button[8].setPreferredSize(new Dimension(200,100));
        button[8].setMinimumSize(new Dimension(200,100));
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 2;
        gridBagLayout.setConstraints(button[8],constraints);
        add(button[8]);

        button[9].setPreferredSize(new Dimension(100,100));
        button[9].setMinimumSize(new Dimension(100,100));
        constraints.gridx = 4;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[9],constraints);
        add(button[9]);

        button[10].setPreferredSize(new Dimension(100,300));
        button[10].setMinimumSize(new Dimension(100,300));
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridheight = 3;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[10],constraints);
        add(button[10]);

        button[11].setPreferredSize(new Dimension(300,100));
        button[11].setMinimumSize(new Dimension(300,100));
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridheight = 1;
        constraints.gridwidth = 3;
        gridBagLayout.setConstraints(button[11],constraints);
        add(button[11]);

        button[12].setPreferredSize(new Dimension(100,100));
        button[12].setMinimumSize(new Dimension(100,100));
        constraints.gridx = 4;
        constraints.gridy = 4;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[12],constraints);
        add(button[12]);

        button[13].setPreferredSize(new Dimension(100,100));
        button[13].setMinimumSize(new Dimension(100,100));
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[13],constraints);
        add(button[13]);

        button[14].setPreferredSize(new Dimension(300,200));
        button[14].setMinimumSize(new Dimension(300,200));
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridheight = 2;
        constraints.gridwidth = 3;
        gridBagLayout.setConstraints(button[14],constraints);
        add(button[14]);

        button[15].setPreferredSize(new Dimension(100,100));
        button[15].setMinimumSize(new Dimension(100,100));
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        gridBagLayout.setConstraints(button[15],constraints);
        add(button[15]);

    }
    
    public static void main(String[] args) {
        ExemploGridBagLayout egbl = new ExemploGridBagLayout();
        egbl.setSize(710,730);
        egbl.setVisible(true);
    }

}
