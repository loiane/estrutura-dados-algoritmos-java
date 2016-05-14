package com.loiane.estruturadados.pilha.labs;

public class Livro {

	private String isbn;
	private String autor;
	private int anoLancamento;
	private String nome;
	
	public Livro() {
		super();
	}
	public Livro(String isbn, String autor, int anoLancamento, String nome) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.anoLancamento = anoLancamento;
		this.nome = nome;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", autor=" + autor + ", anoLancamento="
				+ anoLancamento + ", nome=" + nome + "]";
	}
}
