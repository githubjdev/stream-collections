package br.com.exemplo.streams.ex04;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
            new Funcionario("Ana", "TI"),
            new Funcionario("Carlos", "RH"),
            new Funcionario("Beatriz", "TI")
        );

        Map<String, List<Funcionario>> agrupado =
            funcionarios.stream()
                        .collect(Collectors.groupingBy(Funcionario::getSetor));

        agrupado.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(f -> System.out.println(" - " + f.getNome()));
        });
    }
}