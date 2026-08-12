package extra;

public class ExemplosOutraCoisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("Contando: "+i);
		}

	}

}
