package br.com.emanuelLap.pilha.exercicios.domain;

public class Livro {

	private String nome;
	private String isbn;
	private String aboLancamento;
	private String autor;

	public Livro(String nome, String isbn, String anoLancamento, String autor) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.aboLancamento = anoLancamento;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAboLancamento() {
		return aboLancamento;
	}

	public void setAboLancamento(String aboLancamento) {
		this.aboLancamento = aboLancamento;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", isbn=" + isbn + ", aboLancamento=" + aboLancamento + ", autor=" + autor
				+ "]";
	}

	
}
