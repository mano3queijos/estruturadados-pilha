package br.com.emanuelLap.pilha.exercicios.domain;

import java.time.LocalDate;

public class Livro {

	private String nome;
	private String isbn;
	private LocalDate aboLancamento;
	private String autor;

	public Livro(String nome, String isbn, LocalDate aboLancamento, String autor) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.aboLancamento = aboLancamento;
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

	public LocalDate getAboLancamento() {
		return aboLancamento;
	}

	public void setAboLancamento(LocalDate aboLancamento) {
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
