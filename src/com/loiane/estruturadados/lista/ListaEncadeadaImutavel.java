package com.loiane.estruturadados.lista;

/**
 * ListaEncadeadaImutavel
 */
public class ListaEncadeadaImutavel<T> {

	private NoImutavel<T> primeira;
	private NoImutavel<T> ultima;
	private int tamanho = 0;

	public void adiciona(final T elemento){
        NoImutavel<T> celula = new NoImutavel<>(elemento);
		if (this.tamanho == 0){
		    this.primeira = celula;
		} else {
			this.ultima.setProxima(celula);
			this.ultima = celula;
			
        }
        this.ultima = celula;
        this.tamanho++;
	}

	private NoImutavel<T> buscaCelula(int posicao){
		if (!(posicao >= 0 && posicao < this.tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		
		NoImutavel<T> atual = this.primeira;
		for (int i=0; i<posicao; i++){
			atual = atual.getProxima();
		}
		return atual;
	}
	
	public T busca(int posicao){
		return this.buscaCelula(posicao).getElemento();
	}
	
	public int busca(T elemento){
		
		NoImutavel<T> atual = this.primeira;
		int pos = 0;
		
		while (atual != null){
			if (atual.getElemento().equals(elemento)) {
				return pos;
			}
			pos++;
			atual = atual.getProxima();
		}
		
		return -1;
	}
	
	@Override
	public String toString() {

		if(this.tamanho == 0){
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		NoImutavel<T> atual = this.primeira;
		
		for (int i = 0; i < this.tamanho - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(",\n");
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		
		return builder.toString();
	}

	public int getTamanho() {
        return tamanho;
	}
	
	@SuppressWarnings("unchecked")
	public T[] transformaArray() {
		if (this.tamanho == 0) {
			return (T[]) new Object[0];
		}
		Object[] vetor = new Object[this.tamanho];
		NoImutavel<T> atual = this.primeira;
		for (int i = 0; i < this.tamanho; i++) {
			vetor[i] = atual.getElemento();
			atual = atual.getProxima();
		}
		return (T[]) vetor;
	}

}