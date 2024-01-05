package com.loiane.estruturadados.lista.labs;

import com.loiane.estruturadados.lista.ListaEncadeada;

public class FilaEncadeada<T> {

	private ListaEncadeada<T> elementos;

	FilaEncadeada() {
		this.elementos = new ListaEncadeada<>();
	}

	public void enfileira(T elemento) {
		this.elementos.adiciona(elemento);
	}

	public T espiar() {
		if (this.elementos.getTamanho() == 0) {
			return null;
		}
		return this.elementos.buscaPorPosicao(0);
	}

	public T desenfileira() {
		if (this.elementos.getTamanho() == 0) {
			return null;
		}
		return this.elementos.removeInicio();
	}

	public String toString() {
		return this.elementos.toString();
	}
}
