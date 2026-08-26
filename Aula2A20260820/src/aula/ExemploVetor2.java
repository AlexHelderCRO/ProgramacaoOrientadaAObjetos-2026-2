package aula;
import javax.swing.JOptionPane;
public class ExemploVetor2 {
	public static void main(String[] args) {
		String[][] atividades = new String[3][5];
		String dia = "";
		String hora = "";
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 0) {
					hora = "manhã";
				} else if(i == 1) {
					hora = "tarde";
				} else if(i == 2) {
					hora = "noite";
				}
				if(j == 0) {
					dia = "segunda";
				} else if(j == 1) {
					dia = "terça";
				} else if(j == 2) {
					dia = "quarta";
				} else if(j == 3) {
					dia = "quinta";
				} else if(j == 4) {
					dia = "sexta";
				}
				atividades[i][j] = JOptionPane.showInputDialog("Qual a atividade de "+dia+" pela "+hora+"?");
			}
		}
		System.out.println("Segunda\tTerça\tQuarta\tQuinta\tSexta");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(atividades[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
