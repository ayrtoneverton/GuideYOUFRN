package com.guideyoufrn.controller;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.guideyoufrn.R;
import com.guideyoufrn.controller.TurmasAdapter;
import com.guideyoufrn.controller.NotificationUtils;
import com.guideyoufrn.model.Turma;
import com.guideyoufrn.model.Unidade;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback, TurmasAdapter.OnSelectTurma, GoogleMap.OnMarkerClickListener {

	private GoogleMap mMap;
	private String lastMarker = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((ListView) findViewById(R.id.list_turmas)).setAdapter(new TurmasAdapter(getApplicationContext(), this));

		// Obtain the SupportMapFragment and get notified when the map is ready to be used.
		SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
		mapFragment.getMapAsync(this);

		NotificationUtils.show(this);
	}


	/**
	 * Manipulates the map once available.
	 * This callback is triggered when the map is ready to be used.
	 * This is where we can add markers or lines, add listeners or move the camera. In this case,
	 * we just add a marker near Sydney, Australia.
	 * If Google Play services is not installed on the device, the user will be prompted to install
	 * it inside the SupportMapFragment. This method will only be triggered once the user has
	 * installed Google Play services and returned to the app.
	 */
	@Override
	public void onMapReady(GoogleMap googleMap) {
		mMap = googleMap;
		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-5.833241, -35.202861), 17f));
		mMap.setOnMarkerClickListener(this);
	}

	@Override
	public void selectTurma(Turma turma) {
		Unidade unidade = turma.getDisciplina().getUnidade();
		LatLng latLng = new LatLng(unidade.getCoordenada().getLatitude(), unidade.getCoordenada().getLongetude());
		mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 17f));
		mMap.addMarker(new MarkerOptions().position(latLng).title(unidade.getNome()));
	}

	@Override
	public boolean onMarkerClick(Marker marker) {
		if (marker.getTitle().equals(lastMarker)) {
			lastMarker = null;
			startActivity(new Intent(this, UnidadeActivity.class));
			return true;
		} else {
			lastMarker = marker.getTitle();
			return false;
		}
	}
}
