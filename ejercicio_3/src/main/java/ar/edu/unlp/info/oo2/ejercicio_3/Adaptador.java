package ar.edu.unlp.info.oo2.ejercicio_3;

public class Adaptador extends Media{
	
	private VideoStream videoStream;
	
	public Adaptador(VideoStream videoStream) {
		this.videoStream = videoStream;
	}
	
	public String play() {
		return this.videoStream.reproduce();
		
	}
}
