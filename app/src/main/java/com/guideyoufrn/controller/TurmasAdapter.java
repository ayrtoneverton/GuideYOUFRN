package com.guideyoufrn.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.guideyoufrn.R;
import com.guideyoufrn.dao.TurmasDAO;
import com.guideyoufrn.model.Turma;

import java.util.List;

public class TurmasAdapter extends BaseAdapter implements View.OnClickListener {
	private LayoutInflater inflater;
	private List<Turma> turmas;
	private OnSelectTurma onSelectTurma;

	public TurmasAdapter(Context context, OnSelectTurma onSelectTurma) {
		inflater = LayoutInflater.from(context);
		turmas = TurmasDAO.findAll();
		this.onSelectTurma = onSelectTurma;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		Turma turma = turmas.get(i);
		View item = inflater.inflate(R.layout.item_list_turmas, viewGroup, false);
		((TextView) item.findViewById(R.id.nome_unidade)).setText(turma.getDisciplina().getUnidade().getNome());
		((TextView) item.findViewById(R.id.nome_disciplina)).setText(turma.getDisciplina().getNome());
		((TextView) item.findViewById(R.id.horario_aula)).setText(turma.getDescricaoHorario());
		item.findViewById(R.id.enter_aula).setOnClickListener(this);
		item.findViewById(R.id.enter_aula).setTag(i);
		return item;
	}

	@Override
	public int getCount() {
		return turmas.size();
	}

	@Override
	public Object getItem(int i) {
		return turmas.get(i);
	}

	@Override
	public long getItemId(int i) {
		return turmas.get(i).getId();
	}

	@Override
	public void onClick(View view) {
		onSelectTurma.selectTurma(turmas.get((Integer) view.getTag()));
	}

	public interface OnSelectTurma{
		void selectTurma(Turma turma);
	}
}
