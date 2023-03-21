package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.Optional;

public class Twitter {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Tweet> tweets;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
		this.tweets = new ArrayList<Tweet>();
	}
	
	public void addUser(String screenName) throws Exception {
		try {
			if (this.usuarios.stream()
					.anyMatch(u -> u.getScreenName().equals(screenName))) {
				throw new Exception();
			} else {
				Usuario user = new Usuario(screenName);
				this.usuarios.add(user);
			}
		}catch (Exception e) {
			throw new Exception("El usuario ya existe en el sistema");
		}
	}
	
	public void addTweet(Tweet origen,String cuerpo) throws Exception {
		Tweet tweet = new Tweet(origen, cuerpo);
		this.tweets.add(tweet);
	}
	
	public void removeUser(String screenName) throws Exception {
		try {
			Optional<Usuario> optionalUser = this.usuarios.stream()
					.filter(u -> u.getScreenName().equals(screenName))
					.findFirst();
			Usuario u = optionalUser.orElse(null);
		
			if (u != null) {
				u.borrarTweets();
			}else {
				throw new Exception ();
			}
		} catch(Exception e) {
			throw new Exception ("No se pudo encontrar al usuario ");
		}
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	
}
