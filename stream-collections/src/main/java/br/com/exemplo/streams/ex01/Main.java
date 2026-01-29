package br.com.exemplo.streams.ex01;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Usuario> usuarios = List.of(new Usuario("Alex", true), 
								new Usuario("Maria", false),
								new Usuario("Joao", true));

		List<Usuario> filtro = usuarios.stream().filter(Usuario::isAtivo).toList();

		filtro.forEach(u -> System.out.println(u.getNome()));
	}
}