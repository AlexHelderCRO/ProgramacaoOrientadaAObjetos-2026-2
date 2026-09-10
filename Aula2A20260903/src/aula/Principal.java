package aula;

public class Principal {

	public static void main(String[] args) {
//		Relogio r = new Relogio();
//		r.ajustarHorario("10h30");
//		System.out.println(r.horario);
		RelogioComAlarme ra = new RelogioComAlarme();
		ra.ajustarHorario("10h30");
		System.out.println(ra.horario);
		ra.ajustarAlarme("11h30");
		System.out.println(ra.alarme);
	}

}
