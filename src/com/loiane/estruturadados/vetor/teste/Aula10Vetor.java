package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10Vetor {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(5);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(1, c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);
	}
}
