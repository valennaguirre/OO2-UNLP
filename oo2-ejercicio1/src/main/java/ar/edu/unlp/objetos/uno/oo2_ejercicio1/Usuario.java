package ar.edu.unlp.objetos.uno.oo2_ejercicio1;

import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> tweets;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<>();
	}
	
	public Tweet agregarTweet(String contenido) {
		Tweet t = null;
		if (contenido.length() >= 1 && contenido.length() <= 280) {
			t = new Tweet(contenido, null);
			this.tweets.add(t);
		}			
		return t; //está bien retornar null o sería mejor arrojar una excepción??
	}
	
	public Tweet agregarRetweet(Tweet tweetOrigen) {
		Tweet t = new Tweet(null, tweetOrigen);
		this.tweets.add(t);
		return t;
	}
	
	public void eliminarTodosLosTweets() {
		tweets.clear();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public ArrayList<Tweet> getTweets(){
		return this.tweets; //van los getters en el uml?
	}

}
