package com.pwioi.composite_entities;

public class Heart {
	private int heartBeats;
	public Heart(int heartBeats, int weigth) {
		super();
		this.heartBeats = heartBeats;
		this.weigth = weigth;
	}
	public void setHeartBeats(int heartBeats) {
		this.heartBeats = heartBeats;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	private int weigth;
	public int getHeartBeats() {
		return heartBeats;
	}
	public int getWeigth() {
		return weigth;
	}
}
