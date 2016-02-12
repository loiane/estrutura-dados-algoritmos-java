package com.loiane.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		elementos = new String[capacidade];
		tamanho = 0;
	}

	/*public void adiciona(String elemento) throws Exception{
		if (tamanho < elementos.length){
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
		}
	}*/
	
	public boolean adiciona(String elemento) {
		aumentaCapacidade();
		if (tamanho < elementos.length){
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		} 
		return false;
	}

	public void adiciona(int posicao, String elemento){
		aumentaCapacidade();
		if (!(posicao >= 0 && posicao <= tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=tamanho-1; i>=posicao; i--){
			elementos[i+1] = elementos[i];
		}
		
		elementos[posicao] = elemento;
		tamanho++;
	}
	
	private void aumentaCapacidade(){
		if (tamanho == elementos.length){
			String[] elementosNovos = new String[elementos.length * 2];
			for (int i=0; i<elementos.length; i++){
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i=posicao; i<tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}
	
	public String busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[posicao];
	}
	
	public int busca(String elemento){
		for (int i=0; i<tamanho ;i++){
			if (elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public int tamanho(){
		return this.tamanho;
	}
	
	/*public String toString(){
		return Arrays.toString(elementos);
	}*/

	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}
}
