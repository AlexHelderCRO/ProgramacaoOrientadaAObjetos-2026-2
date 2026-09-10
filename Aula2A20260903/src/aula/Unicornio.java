package aula;

import java.awt.Color;

public class Unicornio {
	private String tipoDeChifre;
	private Color cor;
	private String raca;
	private String poder;
	
	public Unicornio(String tipoDeChifre, Color cor, String raca, String poder) {
		this.setTipoDeChifre(tipoDeChifre);
		this.setCor(cor);
		this.setRaca(raca);
		this.setPoder(poder);
	}

	public String getTipoDeChifre() {
		return tipoDeChifre;
	}

	public void setTipoDeChifre(String tipoDeChifre) {
		this.tipoDeChifre = tipoDeChifre;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
}
