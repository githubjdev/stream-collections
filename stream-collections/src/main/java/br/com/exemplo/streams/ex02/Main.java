package br.com.exemplo.streams.ex02;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Produto> produtos = List.of(new Produto("Notebook", 4500), 
				new Produto("Mouse", 120));

		List<String> nomes = produtos.stream()
				                     .map(Produto::getNome)
				                     .toList();

		nomes.forEach(System.out::println);
	}
}