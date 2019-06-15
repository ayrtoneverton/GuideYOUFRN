package com.guideyoufrn.model;

public class Unidade {
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private Unidade unidadeResponsavel;
	private Coordenada coordenada;

	public Unidade(String nome, Coordenada coordenada) {
		this.nome = nome;
		this.coordenada = coordenada;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Unidade getUnidadeResponsavel() {
		return unidadeResponsavel;
	}
	public void setUnidadeResponsavel(Unidade unidadeResponsavel) {
		this.unidadeResponsavel = unidadeResponsavel;
	}
	public Coordenada getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
}
