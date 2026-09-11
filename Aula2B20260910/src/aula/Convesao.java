package aula;

public class Convesao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal();
//		Vegetal n = (Vegetal)a;
		
//		Mamifero mamador = new Mamifero();
//		Animal a = mamador;
//		Vaca vacarina = new Vaca();
//		Animal a = vacarina;

		Animal bicho = new Macaco();
		if(bicho instanceof Macaco) {
			Macaco v = (Macaco)bicho;
			System.out.println("converteu");
		} else {
			System.out.println("Não pode ser convertido");
		}
		
	}

}

class Animal {
	
}
class Vegetal {
	
}
class Mamifero extends Animal{
	
}
class Peixe extends Animal{
	
}
class Vaca extends Mamifero {
	
}
class Macaco extends Mamifero {
	
}
