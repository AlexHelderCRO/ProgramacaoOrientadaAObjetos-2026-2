package aula;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
		
	public Livro(String titulo, String autor, String editora) {
		this.autor = autor;
		this.editora = editora;
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
