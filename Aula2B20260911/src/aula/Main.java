package aula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leao reiDaSelva = new Leao();
		reiDaSelva.comer();
		Cobra serpente = new Cobra();
		serpente.dormir();
//		Animal ornintorrinco = new Animal(); // Não é possível instanciar classes abstratas.
		Girafa girrafas = new Girafa();
		girrafas.mover();
		Arara matraca = new Arara();
		matraca.mover();
	}

}
