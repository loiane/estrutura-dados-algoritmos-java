package com.loiane.estruturadados.lista.teste;

import java.util.LinkedList;

import com.loiane.estruturadados.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        // testesIniciais();
        // adicionaInicio();
        // adicionaPosicao();
        // removeInicio();
        // removeFinal();
        // removePosicao();
        // insereOrdenado()
        testeLinkedList();
    }

    public static void testeLinkedList() {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.addFirst(0);
        lista.addLast(3);

        System.out.println(lista.contains(1));

        lista.add(2, 2);

        System.out.println(lista);

        lista.remove();
        System.out.println(lista);

        lista.remove(0);
        lista.removeFirst();
        lista.removeLast();
        System.out.println(lista);
    }

    private static void insereOrdenado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        CompararNumero comparator = new CompararNumero();
        lista.adicionaOrdenado(5, comparator);
        System.out.println(lista);
        lista.adicionaOrdenado(1, comparator);
        System.out.println(lista);
        lista.adicionaOrdenado(4, comparator);
        System.out.println(lista);
        lista.adicionaOrdenado(2, comparator);
        System.out.println(lista);
        lista.adicionaOrdenado(3, comparator);
        System.out.println(lista);
        lista.adicionaOrdenado(6, comparator);
        System.out.println(lista);
        lista.adicionaOrdenado(5, comparator);
        System.out.println(lista);
    }

    public static void removePosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(5);

        System.out.println("Elemento removido: " + lista.remove(4));
        System.out.println("Lista: " + lista);

    }

    public static void removeFinal() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        // lista.removeFinal();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeFinal());
        System.out.println("Lista: " + lista);
    }

    public static void removeInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        // lista.removeInicio();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);

        System.out.println("Elemento removido: " + lista.removeInicio());
        System.out.println("Lista: " + lista);
    }

    public static void adicionaPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        // lista.adiciona(-1, 1);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4); // 1, 2, 4

        // lista.adiciona(5, 0);
        lista.adiciona(0, 0); // 0, 1, 2, 4
        lista.adiciona(4, 5); // 0, 1, 2, 4, 5
        lista.adiciona(2, 3); // 0, 1, 2, 3, 4, 5

        System.out.println(lista);
    }

    public static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1); // 1, 2, 3

        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        // lista.limpa();
        // System.out.println(lista);

        // busca por elemento
        System.out.println("******* busca por elemento ");
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));
        System.out.println(lista.busca(0));

        // busca por posição
        System.out.println("******* busca por posição ");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        // System.out.println(lista.buscaPorPosicao(-1));
        // System.out.println(lista.buscaPorPosicao(4));
    }
}
