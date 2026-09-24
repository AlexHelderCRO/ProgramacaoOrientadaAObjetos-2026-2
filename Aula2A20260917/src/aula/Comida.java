package aula;

public abstract class Comida {
	String tempero;
	double preco;
	public void descrever() {
		System.out.println("Temperado com: "+tempero+"\n"+"Custa: "+preco);
	}
	public abstract void modoDePreparo();
}
