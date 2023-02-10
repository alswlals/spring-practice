package com.douzone.container.videosystem;

public class DVDPlayer {
	
	private DigitalVideoDisc dvd;
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	/*수동 설정할 거라 annotation 하나도 쓸 거 없음 */
	public String play() {
		return dvd.play();
	}
}
