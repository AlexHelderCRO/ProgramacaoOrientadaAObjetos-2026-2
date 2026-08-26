package aula;

import java.text.DecimalFormat;

public class ExemploFormatacaoNumerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DecimalFormat monetario = new DecimalFormat("R$ #,##0.00");
//		double preco = 1164655748;
//		System.out.println("Preço: "+monetario.format(preco));

//		DecimalFormat temperatura = new DecimalFormat("0.0## °C");
//		double temp = -37;
//		System.out.println("Temperatura: "+temperatura.format(temp));
		
//		DecimalFormat porcentagem = new DecimalFormat("0.## %");
//		double porc = 0.157;
//		System.out.println("Porcentagem: "+porcentagem.format(porc));
		
		DecimalFormat nCientifica = new DecimalFormat("0.###E0");
		double valor = 0.0000000015678;
		System.out.println("Notação científica: "+nCientifica.format(valor));
	}

}
