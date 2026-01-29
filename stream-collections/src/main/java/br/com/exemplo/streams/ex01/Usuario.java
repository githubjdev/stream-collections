package br.com.exemplo.streams.ex01;

public class Usuario {
	private String nome;
	private boolean ativo;

	public Usuario(String nome, boolean ativo) {
		this.nome = nome;
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public boolean isAtivo() {
		return ativo;
	}
}