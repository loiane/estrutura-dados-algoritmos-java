package com.loiane.estruturadados.teste;

import org.junit.Assert;
import org.junit.Test;

import com.loiane.estruturadados.Vetor;

public class VetorTeste {

	@Test
	public void criarVetorVazio(){
		
		Vetor vetor = new Vetor(10);
		int tamanho = vetor.tamanho();
		
		Assert.assertEquals(0, tamanho);
	}
	
	@Test
	public void adicionaFinalVetor(){
		
		Vetor vetor = new Vetor(10);
		vetor.adiciona("meu elemento");
		
		Assert.assertEquals(1, vetor.tamanho());
	}
	
	@Test
	public void buscaElementoExiste(){
		Vetor vetor = new Vetor(10);
		vetor.adiciona("meu elemento");
		
		Assert.assertEquals(1, vetor.tamanho());
		Assert.assertEquals(true, vetor.busca("meu elemento"));
	}
	
	@Test
	public void buscaElementoNaoExiste(){
		Vetor vetor = new Vetor(10);
		vetor.adiciona("meu elemento");
		
		Assert.assertEquals(1, vetor.tamanho());
		Assert.assertEquals(false, vetor.busca("asdfg"));
	}
}
