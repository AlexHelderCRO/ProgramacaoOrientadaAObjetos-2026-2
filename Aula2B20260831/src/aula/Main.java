package aula;

public class Main {
	public static void main(String[] args) {
		Livro livroDaAlice = new Livro("Alice no País das Maravilhas", "Lewis Carrol", "LP&M");
//		Livro livroDaAlice = new Livro();
//		livroDaAlice.setTitulo("Alice no País das Maravilhas");
//		livroDaAlice.setAutor("Lewis Carrol");
//		livroDaAlice.setEditora("LP&M");
		System.out.println("Titulo: "+livroDaAlice.getTitulo());
		System.out.println("Autor: "+livroDaAlice.getAutor());
		System.out.println("Editora: "+livroDaAlice.getEditora());
		
		
		
//		Carro fusca = new Carro();
//		fusca.acelerar();
//		fusca.acelerar();
//		fusca.frear();
//		System.out.println("velocidade do fusca: "+fusca.consultarVelocimetro());
//		
//		ContaCorrente conta = new ContaCorrente();
////		conta.saldo = 1000000000;
////		System.out.println("Saldo da conta: "+conta.saldo);
//		conta.depositar(1000);
//		conta.sacar(125);
//		System.out.println("Saldo da conta: "+conta.consultarSaldo());
		
	}

}
