package aula;

import java.util.Iterator;

public class ExemploComVetor3 {
	public static void main(String[] args) {
		System.out.println("Iniciou o programa");
		int[][][][][][] vetor = new int[10][20][30][40][50][60];
		System.out.println("Criou o vetor");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				for (int k = 0; k < 30; k++) {
					for (int l = 0; l < 40; l++) {
						for (int m = 0; m < 50; m++) {
							for (int n = 0; n < 50; n++) {
								vetor[i][j][k][l][m][n] = 5;
							}
						}
					}
				}
			}
		}
		System.out.println("Usou o vetor");
	}
}
