package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exer06 {

	public static void main(String[] args) {
		
		Lista<Contato> contatos = new Lista<Contato>(20);

		for (int i=1; i<=30; i++){
			Contato c = new Contato();
			c.setNome("Contato " + i);
			if (i < 10){
				c.setTelefone("1234-"+i+i+i+i);
			} else {
				c.setTelefone("1234-"+i+i);
			}
			c.setEmail("contato"+i+"@email.com");
			contatos.adiciona(c);
		}
		
		System.out.println(contatos);
		
		System.out.println("Usando o método obtém");
		System.out.println(contatos.obtem(15));
		
		System.out.println("Usando o método busca por posição");
		System.out.println(contatos.busca(20));
		
		System.out.println("Usando o método último índice");
		System.out.println(contatos.ultimoIndice(contatos.obtem(25)));
		
		System.out.println("Usando o método contém");
		System.out.println(contatos.contem(contatos.obtem(28)));
		
		System.out.println("Tamanho da lista = " + contatos.tamanho());
		
		System.out.println("Usando o método remove por posição");
		contatos.remove(0);
		
		System.out.println("Tamanho da lista = " + contatos.tamanho());

		System.out.println("Usando o método remove por elemento");
		contatos.remove(contatos.obtem(2));
		
		System.out.println("Tamanho da lista = " + contatos.tamanho());

		System.out.println(contatos);
		
		contatos.limpar();
		
		System.out.println(contatos);
		
		System.out.println("Tamanho da lista = " + contatos.tamanho());

	}

}
