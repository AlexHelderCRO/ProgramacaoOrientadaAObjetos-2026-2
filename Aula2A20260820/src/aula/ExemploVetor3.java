package aula;

public class ExemploVetor3 {

	public static void main(String[] args) {
		System.out.println("O programa iniciou.");
		int[][][][][][] supervetor = new int[20][30][40][50][60][70];
		System.out.println("Inicializou o vetor.");
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 30; j++) {
				for(int k = 0; k < 40; k++) {
					for(int l = 0; l < 50; l++) {
						for(int m = 0; m < 60; m++) {
							for(int n = 0; n < 70; n++) {
								supervetor[i][j][k][l][m][n] = i+j+k+l+m+n;
							}
						}
					}
				}
			}
		}
		System.out.println("O programa terminou com sucesso.");

	}

}
