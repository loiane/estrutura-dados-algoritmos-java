package com.loiane.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exer07 {

	public static void main(String[] args) {

		ArrayList<Contato> listaContatos = new ArrayList<Contato>();

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

		for (int i=0; i<contatos.tamanho(); i++){
			listaContatos.add(contatos.obtem(i));
		}

		System.out.println(contatos);
		System.out.println(listaContatos);

		System.out.println("Usando o método get");
		System.out.println(listaContatos.get(15));

		System.out.println("Usando o método busca por posição");
		System.out.println(listaContatos.get(20));

		System.out.println("Usando o método último índice");
		System.out.println(listaContatos.indexOf(listaContatos.get(25)));

		System.out.println("Usando o método contém");
		System.out.println(listaContatos.contains(listaContatos.get(28)));

		System.out.println("Tamanho da lista = " + listaContatos.size());

		System.out.println("Usando o método remove por posição");
		listaContatos.remove(0);

		System.out.println("Tamanho da lista = " + listaContatos.size());

		System.out.println("Usando o método remove por elemento");
		listaContatos.remove(listaContatos.get(2));

		System.out.println("Tamanho da lista = " + listaContatos.size());

		System.out.println(listaContatos);

		listaContatos.clear();

		System.out.println(listaContatos);

		System.out.println("Tamanho da lista = " + listaContatos.size());
	}

}
