package ar.edu.unlp.objetos.uno.oo2_ejercicio1;

public class Tweet {

	private String contenido;
	private Tweet tweetOrigen;
	
	public Tweet(String contenido, Tweet tweetOrigen) {
		this.contenido = contenido;
		this.tweetOrigen = tweetOrigen;
	}
	
	public String getContenido() {
		return this.contenido;
	}
	public Tweet getTweetOrigen() {
		return this.tweetOrigen;
	}
	
}
