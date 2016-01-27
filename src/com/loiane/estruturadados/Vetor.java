package com.loiane.estruturadados;

import java.util.Arrays;

public class Vetor {

	private Object[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		elementos = new Object[capacidade];
		tamanho = 0;
	}

	public void adiciona(Object elemento){
		elementos[tamanho] = elemento;
		tamanho++;
	}

	public void adiciona(int posicao, Object elemento){

	}
	
	public void remove(int posicao){

	}
	
	public Object busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[posicao];
	}
	
	public boolean busca(Object elemento){
		for (int i=0; i<tamanho ;i++){
			if (elementos[i].equals(elemento)){
				return true;
			}
		}
		return false;
	}

	public int tamanho(){
		return tamanho;
	}

	public String toString(){
		return Arrays.toString(elementos);
	}
}
