package aula;

public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arquivo = "Mês;Receita;Despesa\r\n"
				+ "janeiro;654;123\r\n"
				+ "fevereiro;654;156\r\n"
				+ "março;789;189\r\n"
				+ "abril;456;147\r\n"
				+ "maio;123;156\r\n"
				+ "junho;456;132\r\n"
				+ "julho;897;165\r\n"
				+ "agosto;564;198\r\n"
				+ "setembro;897;197\r\n"
				+ "outubro;654;164\r\n"
				+ "novembro;358;131\r\n"
				+ "dezembro;987;165\r\n"
				+ "";
		String[] linhas = arquivo.split("\n");
		for(int i = 0; i < linhas.length; i++) {
			String[] colunas = linhas[i].split(";");
			for(int j = 0; j < colunas.length; j++) {
				System.out.print(colunas[j]+"\t");
			}
		}

	}

}
