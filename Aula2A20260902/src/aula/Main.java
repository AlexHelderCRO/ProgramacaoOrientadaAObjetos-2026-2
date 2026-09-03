package aula;

public class Main {
	public static void main(String[] args) {
//		Trabalhador gilmar = new Trabalhador("Robson", "PJ", "O trabalhador trabalhará blablablablobloblo", "4x3", 10000);
		Trabalhador gilmar = new Trabalhador();
		gilmar.acrescentarAditivoDeContrato("Vai trabalhar mais 7 anos para obter o benefício.");
		System.out.println(gilmar.getNome());
		System.out.println(gilmar.getTipoDeContrato());
		System.out.println(gilmar.getContratoDeTrabalho());
		System.out.println(gilmar.getJornadaDeTrabalho());
		System.out.println(gilmar.getRemuneracao());
	}
}
