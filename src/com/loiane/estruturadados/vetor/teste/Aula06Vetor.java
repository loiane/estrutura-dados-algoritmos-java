package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06Vetor {

	public static void main(String[] args) throws Exception {

		//vetor com capacidade para 10 elementos
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");

		System.out.print("Busca elemento 'Estrutura de Dados': ");
		System.out.println(vetor.busca("Estrutura de Dados"));
		
		System.out.print("Busca elemento 'loiane.training': ");
		System.out.println(vetor.busca("loiane.training"));
	}
}
