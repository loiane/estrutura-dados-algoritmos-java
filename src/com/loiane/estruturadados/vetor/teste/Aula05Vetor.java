package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05Vetor {

	public static void main(String[] args) throws Exception {

		//vetor com capacidade para 10 elementos
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");

		System.out.print("Elemento da posição 1: ");
		System.out.println(vetor.busca(1));
		
		System.out.print("Elemento da posição 3: ");
		System.out.println(vetor.busca(3));
	}
}
