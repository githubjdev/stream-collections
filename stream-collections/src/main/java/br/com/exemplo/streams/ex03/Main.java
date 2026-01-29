package br.com.exemplo.streams.ex03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
            new Pedido(150),
            new Pedido(300),
            new Pedido(550)
        );

        double total = pedidos.stream()
                .mapToDouble(Pedido::getValor)
                .sum();

        System.out.println("Total: " + total);
    }
}