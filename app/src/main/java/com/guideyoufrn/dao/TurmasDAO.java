package com.guideyoufrn.dao;

import com.guideyoufrn.model.Coordenada;
import com.guideyoufrn.model.Disciplina;
import com.guideyoufrn.model.Turma;
import com.guideyoufrn.model.Unidade;

import java.util.ArrayList;
import java.util.List;

public class TurmasDAO {
	public static List<Turma> findAll(){
		List<Turma> turmas = new ArrayList<Turma>();
		Unidade unidade1 = new Unidade("Instituto Metrópole Digital", new Coordenada(-5.831994,-35.205506));
		Unidade unidade2 = new Unidade("Centro De Ciencias Humanas", new Coordenada(-5.842627,-35.209948));
		Disciplina disciplina1 = new Disciplina("Análise e Projeto Orientado a Objetos", unidade1);
		Disciplina disciplina2 = new Disciplina("Libras", unidade2);
		Disciplina disciplina3 = new Disciplina("Métodos formais", unidade1);
		Disciplina disciplina4 = new Disciplina("Grafos", unidade1);
		Disciplina disciplina5 = new Disciplina("Cálculo 2", unidade1);
		turmas.add(new Turma("13:00", disciplina1));
		turmas.add(new Turma("14:55", disciplina2));
		turmas.add(new Turma("16:50", disciplina3));
		turmas.add(new Turma("18:45", disciplina4));
		turmas.add(new Turma("20:35", disciplina5));
		return turmas;
	}
}
