package aula;

import java.util.Random;

public class ExemplosConversao1 {

	public static void main(String[] args) {
//		ProfissionalDeTI jefferson = new ProfissionalDeTI();
//		Advogado thomas = (Advogado)jefferson; // Não funciona porque não tem relação de herança.
		
//		if(thomas == jefferson) {
//			System.out.println("São iguais.");
//		} else {
//			System.out.println("São diferentes.");
//		}

//		TecnicoDeManutencao jefferson = new TecnicoDeManutencao();
//		ProfissionalDeTI thomas = jefferson; 

//		ProfissionalDeTI jefferson = new ProfissionalDeTI();
//		TecnicoDeManutencao thomas = (TecnicoDeManutencao)jefferson; // compila mas não executa, porque em tempo de execução o objeto não é da classe Técnico de Manutenção.
//		thomas.consertarComputadores();
//		jefferson.usarComputador();

//		ProfissionalDeTI jefferson = new ProfissionalDeTI();
//		TecnicoDeManutencao thomas = (TecnicoDeManutencao)jefferson; 
		
//		TecnicoEmInformatica jefferson = new TecnicoEmInformatica();
//		EngenheiroDeSoftware thomas = (EngenheiroDeSoftware)jefferson;

//		TecnicoEmInformatica jefferson = new TecnicoEmInformatica();
//		ProfissionalDeTI thomas = jefferson;
		
		Random r = new Random();
		boolean sorteado = r.nextBoolean();
		
		ProfissionalDeTI jefferson;
		if(sorteado) {
			jefferson = new TecnicoDeManutencao();
		} else {
			jefferson = new Programador();
		}
		
		if(jefferson instanceof TecnicoDeManutencao) {
			TecnicoDeManutencao thomas = (TecnicoDeManutencao)jefferson;
			thomas.consertarComputadores();
		} else {
			Programador thomas = (Programador) jefferson;
			thomas.desenvolverSoftware();
		}
		
	}

}
class ProfissionalDeTI {
	public void usarComputador() {
		System.out.println("Usar o computador.");
	}
}
class Advogado {
	public void representarJudicialmente() {
		System.out.println("Representar judicialmente.");
	}
}
class Programador extends ProfissionalDeTI {
	public void desenvolverSoftware() {
		System.out.println("Desenvover software.");
	}
}
class TecnicoDeManutencao extends ProfissionalDeTI {
	public void consertarComputadores() {
		System.out.println("Consertar computadores.");
	}
}
class EngenheiroDeSoftware extends Programador {
	public void planejarSistema() {
		System.out.println("Planejar o sistema.");
	}
}
class TecnicoEmInformatica extends Programador {
	public void implementarCodigo() {
		System.out.println("Implementar o código.");
	}
}