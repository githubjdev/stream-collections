package br.com.exemplo.streams.ex05;

import java.util.List;

import br.com.exemplo.streams.ex03.Pedido;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
            new Pedido(500),
            new Pedido(12000),
            new Pedido(800)
        );

        boolean existe = pedidos.stream()
                .anyMatch(p -> p.getValor() > 10000);

        System.out.println("Existe pedido alto? " + existe);
    }
}