package aula;

public class Trabalhador {
	private String nome;
	private String tipoDeContrato;
	private String contratoDeTrabalho;
	private String jornadaDeTrabalho;
	private double remuneracao;
	
	public Trabalhador(String nome, String tipoDeContrato, String contratoDeTrabalho, String jornadaDeTrabalho, double remuneracao) {
		this.nome = nome;
		this.tipoDeContrato = tipoDeContrato;
		this.contratoDeTrabalho = contratoDeTrabalho;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
		this.remuneracao = remuneracao;
	}
	public Trabalhador() {
		this("Jacó", "servidão", "Trabalhará 7 anos", "7x0", 0.75);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoDeContrato() {
		return tipoDeContrato;
	}
	public void setTipoDeContrato(String tipoDeContrato) {
		this.tipoDeContrato = tipoDeContrato;
	}
	public String getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}
	public void setJornadaDeTrabalho(String jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	public double getRemuneracao() {
		return remuneracao;
	}
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
	public String getContratoDeTrabalho() {
		return contratoDeTrabalho;
	}
	public void setContratoDeTrabalho(String contratoDeTrabalho) {
		this.contratoDeTrabalho = contratoDeTrabalho;
	}
	
	public void acrescentarAditivoDeContrato(String aditivo) {
		contratoDeTrabalho = contratoDeTrabalho.concat(aditivo);
	}
}
