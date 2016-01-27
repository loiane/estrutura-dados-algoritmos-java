package com.loiane.estruturadados.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

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
	
	@Test
	public void buscaPosicaoZero(){
		
		vetor.adiciona("meu elemento");
		
		assertEquals(1, vetor.tamanho());
		assertNotNull(vetor.busca(0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void buscaPosicaoNaoExistente(){
		
		vetor.adiciona("meu elemento");
		
		assertEquals(1, vetor.tamanho());
		assertNotNull(vetor.busca(2));
	}
}
