package com.loiane.estruturadados.vetor.labs;

import java.util.Scanner;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

public class Exer06 {

	public static void main(String[] args) {

		//criação das variáveis
		Scanner scan = new Scanner(System.in);

		//criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);

		//criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

		//criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while (opcao != 0){

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3: 
				obtemContatoPosicao(scan, lista);
				break;
			case 4: 
				obtemContato(scan, lista);
				break;
			case 5: 
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6: 
				pesquisarContatoExiste(scan, lista);
				break;	
			case 7: 
				excluirPorPosicao(scan, lista);
				break;	
			case 8: 
				excluirContato(scan, lista);
				break;	
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;	
			default:
				break;
			}
		}

		System.out.println("Usuário digitou 0, programa terminado");
	}
	
	private static void imprimirVetor(Lista<Contato> lista){

		System.out.println(lista);
	}

	private static void limparVetor(Lista<Contato> lista){

		lista.limpar();
		
		System.out.println("Todos os contatos do vetor foram excluídos");
	}

	private static void imprimeTamanhoVetor(Lista<Contato> lista){

		System.out.println("Tamanho do vetor é de: " + lista.tamanho());
	}

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			lista.remove(pos);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirContato(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			Contato contato = lista.busca(pos);

			lista.remove(contato);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			boolean existe = lista.contem(contato);

			if (existe){
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato não existe");
			}

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContato(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posição " + pos);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista){

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Contato contato = lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista){

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.adiciona(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista){

		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scan);

		try {
			lista.adiciona(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e){
			System.out.println("Posição inválida, contato não adicionado");
		}
	}

	private static String leInformacao(String msg, Scanner scan){

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	private static int leInformacaoInt(String msg, Scanner scan){

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida){

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e){
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return num;
	}

	private static int obterOpcaoMenu(Scanner scan){

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida){

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índide do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11){
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e){

				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){

		Contato contato;

		for (int i=1; i<=quantidade; i++){

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111"+i);
			contato.setEmail("contato"+i+"@email.com");

			lista.adiciona(contato);
		}
	}
}
