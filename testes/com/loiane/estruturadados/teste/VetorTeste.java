package com.loiane.estruturadados.teste;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.loiane.estruturadados.Vetor;

public class VetorTeste {
	
	private Vetor vetor;
	
	@Before
	public void executaAntesCadaTeste(){
		vetor = new Vetor(10);
	}
	
	@Test
	public void criarVetorVazio(){
		
		assertEquals(0, vetor.tamanho());
	}

	
	@Test
	public void adicionaFinalVetor(){
		vetor.adiciona("meu elemento");
		assertEquals(1, vetor.tamanho());
	}
	
	@Test
	public void buscaElementoExiste(){
		vetor.adiciona("meu elemento");
		
		assertEquals(1, vetor.tamanho());
		assertEquals(true, vetor.busca("meu elemento"));
	}
	
	@Test
	public void buscaElementoNaoExiste(){
		vetor.adiciona("meu elemento");
		
		assertEquals(1, vetor.tamanho());
		assertEquals(false, vetor.busca("asdfg"));
	}
}
