package com.loiane.estruturadados.lista.labs;

import com.loiane.estruturadados.lista.ListaEncadeada;

/**
 * Escreva um programa que inverte a ordem dos nós de uma lista encadeada 
 * (a primeira passa a ser a última, a segunda passa a ser a penúltima etc.). 
 * Faça isso sem usar espaço auxiliar; apenas alterando os ponteiros.
 */
public class Exer02 {
    
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        for (int i=1; i<=10; i++) {
            lista.adiciona(""+i);
        }
        System.out.println(lista);

        lista.inverte();
        System.out.println(lista);
    }
}
