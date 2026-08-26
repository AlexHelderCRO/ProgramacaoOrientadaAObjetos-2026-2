package aula;

import java.text.DecimalFormat;

public class ExemploDecimalFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DecimalFormat monetario = new DecimalFormat("R$ #,##0.00");
//		double preco = 986549879;
//		System.out.println("O produto custa: "+monetario.format(preco));
		
//		DecimalFormat porcentagem = new DecimalFormat("0.0##%");
//		double idosos = 10;
//		double adultos = 30;
//		double criancas = 10;
//		double total = idosos+adultos+criancas;
//		System.out.println("Porcentagem de idosos: "+porcentagem.format(idosos/total));
//		System.out.println("Porcentagem de adultos: "+porcentagem.format(adultos/total));
//		System.out.println("Porcentagem de crianças: "+porcentagem.format(criancas/total));
		
//		DecimalFormat diaOuMes = new DecimalFormat("00");
//		DecimalFormat Ano = new DecimalFormat("0000");
//		
//		int dia = 3;
//		int mes = 7;
//		int ano = 305;
//		
//		System.out.println("Pode ter acontecido algo historicamente importante na data: "
//		+diaOuMes.format(dia)+"/"+diaOuMes.format(mes)+"/"+Ano.format(ano));
		
//		DecimalFormat cientifico = new DecimalFormat("0.0##E0");
//		int velocidade = 96345;
//		System.out.println("A velocidade é de: "+cientifico.format(velocidade));
//		double tamanho = 0.00097;
//		System.out.println("A velocidade é de: "+cientifico.format(tamanho));
//		double avogrado = 6022E20;
//		System.out.println("Quantidade de moleculas em um mol: "+cientifico.format(avogrado));
		
		DecimalFormat temperatura = new DecimalFormat("0.0##°C");
		double temp = 38.5;
		System.out.println("Temperatura: "+temperatura.format(temp));
	}

}
