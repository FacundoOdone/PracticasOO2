package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;

public class Usuario {

	
	private String screenName;
	private ArrayList<Tweet> tweets;

	public Usuario(String screenName) {
		super();
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	@Override
	public String toString() {
		return "Usuario [screenName=" + screenName + ", tweets=" + tweets + "]";
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public ArrayList<Tweet> getTweets() {
		return tweets;
	}
	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
	
	public void borrarTweets() {
		this.tweets.clear();
	}
	
}
