package com.loiane.estruturadados.lista.labs;

public class Exer04 {
    public static void main(String[] args) {
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        for (int i=0; i<10; i++) {
            fila.enfileira(i);
        }

        System.out.println(fila);

        System.out.println(fila.desenfileira());

        System.out.println(fila.espiar());

        System.out.println(fila);
    }
}
