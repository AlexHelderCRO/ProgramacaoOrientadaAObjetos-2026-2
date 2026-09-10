package aula;

public class Main {

	public static void main(String[] args) {
//		Relogio r = new Relogio();
//		r.ajustarHorario("08h30");
//		System.out.println(r.horario);
		RelogioComAlarme ra = new RelogioComAlarme();
		ra.ajustarHorario("08h30");
		ra.ajustarAlarme("09h00");
		System.out.println(ra.horario);
		System.out.println(ra.alarme);
	}

}
