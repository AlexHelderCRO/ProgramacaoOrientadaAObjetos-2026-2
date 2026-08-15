package aula;

import java.awt.Color;
import java.awt.Frame;

public class ExemploComObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame janela1 = new Frame("janela 1");
		Frame janela2 = new Frame("janela 2");
		Frame janela3 = new Frame("janela 3");
		janela2.setSize(400,300);
		janela1.setSize(100, 100);
		janela3.setSize(500, 600);
		janela3.setBackground(Color.RED);
		janela2.setBackground(Color.BLUE);
		janela1.setBackground(Color.GREEN);
		janela2.setVisible(true);
		janela3.setVisible(true);
		janela1.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		janela1.setSize(200,200);
		janela1.setBackground(Color.PINK);
	}

}
