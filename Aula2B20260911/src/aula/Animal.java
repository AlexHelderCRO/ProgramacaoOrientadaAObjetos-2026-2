package aula;

public abstract class Animal {
	public void comer() {
		System.out.println("Abocanhar a comida.");
		System.out.println("Mastigar.");
		System.out.println("Engolir a comida.");
	}
	public void dormir() {
		System.out.println("Deitar.");
		System.out.println("Fechar os olhos.");
		System.out.println("Permanecer assim durante um tempo.");
	}
	public abstract void mover();
}
