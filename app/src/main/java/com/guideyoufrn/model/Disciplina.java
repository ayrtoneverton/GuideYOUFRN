package com.guideyoufrn.model;

public class Disciplina {
	private int id;
	private String codigo;
	private String nome;
	private Unidade unidade;

	public Disciplina(String nome, Unidade unidade) {
		this.nome = nome;
		this.unidade = unidade;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}
}
