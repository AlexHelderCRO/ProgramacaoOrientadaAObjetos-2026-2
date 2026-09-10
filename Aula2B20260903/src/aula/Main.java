package aula;

public class Main {

	public static void main(String[] args) {
		Relogio r = new Relogio();
		r.ajustarHorario("11h00");
		System.out.println(r.horario);
		r.ajustarAlarme("12h40");
//		RelogioComAlarme ra = new RelogioComAlarme();
//		ra.ajustarHorario("11h00");
//		ra.ajustarAlarme("12h40");
//		System.out.println(ra.horario);
//		System.out.println(ra.alarme);
	}

}
