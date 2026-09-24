package aula;

public abstract class Comida {
	String ingredientes;
	String tempero;
	public void resquentar() {
		System.out.println("Coloca no microondas por 3 minutos.");
	}
	public abstract void modoDePreparo();
}
