package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula07Vetor {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");
		vetor.adiciona(0,"http://loiane.training");
		vetor.adiciona(3,"http://loiane.com");
		
		System.out.println(vetor);

	}

}
