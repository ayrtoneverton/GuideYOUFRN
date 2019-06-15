package com.guideyoufrn.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.guideyoufrn.R;

public class TabsFragment extends Fragment {

	private static final String ARG_TAB_NUMBER = "tab_number";
	private int tab;

	public static TabsFragment newInstance(int index) {
		TabsFragment fragment = new TabsFragment();
		Bundle bundle = new Bundle();
		bundle.putInt(ARG_TAB_NUMBER, index);
		fragment.setArguments(bundle);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			tab = getArguments().getInt(ARG_TAB_NUMBER);
		}
	}

	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle bundle) {
		switch (tab) {
			case 0:
				return inflater.inflate(R.layout.fragment_tab_1, container, false);
			case 1:
				return inflater.inflate(R.layout.fragment_tab_2, container, false);
			default:
				return inflater.inflate(R.layout.fragment_tab_3, container, false);
		}
	}
}