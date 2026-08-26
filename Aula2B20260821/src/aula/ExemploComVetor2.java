package aula;

import javax.swing.JOptionPane;

public class ExemploComVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] atividades = new String[3][5];
		String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
		String[] hora = {"Manhã", "Tarde", "Noite"};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				atividades[i][j] = JOptionPane.showInputDialog("Qual a atividade de "+dias[j]+
																" no periodo da "+hora[i]);
			}
		}
		System.out.println("Tabela de Atividades:");
		System.out.println("\t"+dias[0]+"\t"+dias[1]+"\t"+dias[2]+"\t"+dias[3]+"\t"+dias[4]);
		for(int i = 0; i < 3; i++) {
			System.out.print(hora[i]+"\t");
			for(int j = 0; j < 5; j++) {
				System.out.print(atividades[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
