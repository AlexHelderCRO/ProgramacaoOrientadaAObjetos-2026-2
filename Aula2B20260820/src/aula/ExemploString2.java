package aula;

public class ExemploString2 {
	public static void main(String[] args) {
		String arquivo = "Mês ;Receita;Despesa\r\n"
				+ "jan;654;123\r\n"
				+ "fev;654;156\r\n"
				+ "mar;789;189\r\n"
				+ "abr;456;147\r\n"
				+ "mai;123;156\r\n"
				+ "jun;456;132\r\n"
				+ "jul;897;165\r\n"
				+ "ago;564;198\r\n"
				+ "set;897;197\r\n"
				+ "out;654;164\r\n"
				+ "nov;358;131\r\n"
				+ "dez;987;165\r\n"
				+ "";
		String[] linhas = arquivo.split("\r\n");
		for(int i = 0; i < linhas.length; i++) {
			String[] colunas = linhas[i].split(";");
			for(int j = 0; j < colunas.length; j++) {
				System.out.print(colunas[j]+"\t");
			}
			System.out.println();
		}
	}
}
