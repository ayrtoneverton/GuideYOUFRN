package com.guideyoufrn.model;

public class Turma {
	private int id;
	private String codTurma;
	private String descricaoHorario;
	private String localAula;
	private Disciplina disciplina;

	public Turma(String descricaoHorario, Disciplina disciplina) {
		this.descricaoHorario = descricaoHorario;
		this.disciplina = disciplina;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}
	public String getDescricaoHorario() {
		return descricaoHorario;
	}
	public void setDescricaoHorario(String descricaoHorario) {
		this.descricaoHorario = descricaoHorario;
	}
	public String getLocalAula() {
		return localAula;
	}
	public void setLocalAula(String localAula) {
		this.localAula = localAula;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
