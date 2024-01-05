package com.loiane.estruturadados.lista.labs;

import java.time.LocalDate;


public record Transacao(int idTransacao,
                        int idVeiculo, String descricao, double preco,
                        LocalDate data, String proprietario) {}
