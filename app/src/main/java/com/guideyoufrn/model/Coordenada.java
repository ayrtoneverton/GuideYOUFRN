package com.guideyoufrn.model;

public class Coordenada {
	private double latitude;
	private double longetude;

	public Coordenada(double latitude, double longetude) {
		this.latitude = latitude;
		this.longetude = longetude;
	}

	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongetude() {
		return longetude;
	}
	public void setLongetude(double longetude) {
		this.longetude = longetude;
	}
}
