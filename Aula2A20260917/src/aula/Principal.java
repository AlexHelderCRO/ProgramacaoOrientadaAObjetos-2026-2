package aula;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arroz prato1 = new Arroz();
		prato1.tempero = "Arroz temperado com sal, alho e cebola.";
		prato1.preco = 14;
		Macarrao prato2 = new Macarrao();
		prato2.tempero = "Espaguete com molho de tomate com azeite, orégano, azeitona e manjericão.";
		prato2.preco = 35;
		prato1.descrever();
		prato2.descrever();
		Feijao prato3 = new Feijao();
		prato1.modoDePreparo();
		prato2.modoDePreparo();
		prato3.modoDePreparo();
	}

}
