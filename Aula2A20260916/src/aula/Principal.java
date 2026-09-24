package aula;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arroz pratoDeComida = new Arroz();
		pratoDeComida.tempero = "Sal, Alho e Cebola";
		pratoDeComida.ingredientes = "Arroz";
		pratoDeComida.resquentar();
		Macarrao prato2 = new Macarrao();
		prato2.resquentar();
		Feijao prato3 = new Feijao();
		prato3.resquentar();
	}

}
