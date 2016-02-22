package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula04Vetor {

	public static void main(String[] args) throws Exception {

		//vetor com capacidade para 10 elementos
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");

		System.out.print("Tamanho do vetor: ");
		System.out.println(vetor.tamanho());

		System.out.println("Elementos do vetor:");
		System.out.println(vetor.toString());
	}

}
