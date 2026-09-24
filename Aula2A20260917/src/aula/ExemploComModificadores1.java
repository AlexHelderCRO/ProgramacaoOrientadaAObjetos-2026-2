package aula;

public class ExemploComModificadores1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseComMetodosEstaticosENaoEstaticos.metodoSoma(4, 3);
		ClasseComMetodosEstaticosENaoEstaticos objeto = new ClasseComMetodosEstaticosENaoEstaticos();
		objeto.adiciona(5);
	}

}

class ClasseComMetodosEstaticosENaoEstaticos {
	int x;
	
	public int adiciona(int y) {
		return x+y;
	}
	
	public static int metodoSoma(int a, int b) {
		return a+b;
	}
	
}