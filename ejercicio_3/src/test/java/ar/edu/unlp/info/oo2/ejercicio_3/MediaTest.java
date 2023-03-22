package ar.edu.unlp.info.oo2.ejercicio_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaTest {
	private MediaPlayer mediaPlayer;
	
	@BeforeEach
	void setUp() {
		mediaPlayer = new MediaPlayer();
	}
	
	@Test
	void test() {
		Audio audio = new Audio();
		VideoStream videoStream = new VideoStream();
		VideoFile videoFile = new VideoFile();
		Adaptador adaptador = new Adaptador(videoStream);
		
		this.mediaPlayer.addMedia(audio);
		this.mediaPlayer.addMedia(videoFile);
		this.mediaPlayer.addMedia(adaptador);
		
		this.mediaPlayer.reproducir();
	
	}
}
