package com.guideyoufrn.dao;

import com.guideyoufrn.model.Coordenada;
import com.guideyoufrn.model.Servico;
import com.guideyoufrn.model.Unidade;

import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {
	public static List<Servico> findAll(){
		List<Servico> servicos = new ArrayList<>();
		Unidade unidade = new Unidade("Instituto Metrópole Digital", new Coordenada(-5.831994,-35.205506));
		servicos.add(new Servico("Proficiência", "", unidade));
		servicos.add(new Servico("Aproveitamento de Estudos", "", unidade));
		servicos.add(new Servico("Recorrer a jubilamento", "", unidade));
		return servicos;
	}
}
