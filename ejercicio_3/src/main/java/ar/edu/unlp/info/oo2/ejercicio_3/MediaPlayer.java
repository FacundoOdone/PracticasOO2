package ar.edu.unlp.info.oo2.ejercicio_3;

import java.util.ArrayList;

public class MediaPlayer {
	private ArrayList<Media> media;
	
	
	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}
	
	public void addMedia(Media media) {
		this.media.add(media);
	}
	
	public void reproducir() {
		media.stream()
		.forEach(m -> System.out.println(m.play()));
	}
}
