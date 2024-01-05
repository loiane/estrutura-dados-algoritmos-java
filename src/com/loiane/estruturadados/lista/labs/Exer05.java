package com.loiane.estruturadados.lista.labs;

import java.time.LocalDate;

import com.loiane.estruturadados.lista.ListaEncadeadaImutavel;

/**
 * Escreva um programa que será usado para acompanhar os passos da venda de um
 * automóvel e/ou imóvel. Por exemplo, o automável é comprado inicialmente pela
 * pessoa A. Inserimos na lista um nó que representa essa informação, como
 * descrição do veículo, identificador, preço de compra, data de compra,
 * dono(a).
 */
public class Exer05 {
    public static void main(String[] args) {
        ListaEncadeadaImutavel<Transacao> lista = new ListaEncadeadaImutavel<>();

        Transacao compra = new Transacao(1, 1, "Compra veiculo novo", 30000, LocalDate.now(), "Maria");
        lista.adiciona(compra);

        lista.adiciona(new Transacao(2, 2, "Venda", 25000, LocalDate.now(), "João"));

        System.out.println(lista);
    }
}
