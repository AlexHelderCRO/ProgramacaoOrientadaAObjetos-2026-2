package aula;

import java.awt.Color;
import java.awt.Frame;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame janela1 = new Frame("janela 1");
		Frame janela2 = new Frame("janela 2");
		Frame janela3 = new Frame("janela 3");
		janela2.setSize(50, 50);
		janela3.setSize(500, 600);
		janela1.setSize(400, 300);
		janela3.setBackground(Color.BLUE);
		janela1.setBackground(Color.RED);
		janela2.setBackground(Color.GREEN);
		janela3.setVisible(true);
		janela2.setVisible(true);
		janela1.setVisible(true);
		janela2.setSize(800, 800);
		janela2.setBackground(Color.WHITE);
		System.out.println(janela1.getSize());
		System.out.println(janela2.getSize());
		System.out.println(janela3.getSize());
		System.out.println(janela1.getBackground());
		System.out.println(janela2.getBackground());
		System.out.println(janela3.getBackground());
	}

}
