package ar.edu.unlp.objetos.uno.oo2_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEj1 {
		
		Twitter twitter;
		Usuario usu;
		Tweet tweetOrigen;
		
		@BeforeEach
		void setUp() throws Exception {
			twitter = new Twitter();
			tweetOrigen = new Tweet("hola como va", null);
			usu = twitter.crearUsuario("valen");
		}
		
	    @Test
	    public void testCrearUsuario() {
	    	Usuario usuario = twitter.crearUsuario("eliana");
	        assertEquals("eliana", usuario.getScreenName());
	        assertEquals(2, twitter.getUsuarios().size());
	    }
	    
	    @Test
	    public void testNoCrearUsuario() {
	    	Usuario usuNoCreado = twitter.crearUsuario("valen");
	        assertEquals(null, usuNoCreado);
	        assertEquals(1, twitter.getUsuarios().size());
	    }
	    
	    @Test
	    public void testNoAgregarTweetPorFaltaDeCaracteres() {
	    	Tweet tweet = usu.agregarTweet("");
	        assertEquals(null, tweet);
	        assertEquals(0, usu.getTweets().size());
	    }
	    
	    @Test
	    public void testNoAgregarTweetPorExcesoDeCaracteres() {
	    	Tweet tweet = usu.agregarTweet("kjaokjdoodisjdoisdjoisjdaoisdjoiasdoiasdoiadsnionasdonsokansdonasdokjjnjlkjnlkjlkjlknlknlknlknklnlknlknlknlknlknlnasdoknasdokadnsokansdoknasoknadsonsaodnksadosnokasdnkoasdnkoandkonaskondasokndkondsoknasdoknasdoknasodknaosknasokdnokasndokasndkoasndokandskoansdokanskodnaoksndoaksndokansdoknasdoknadsoknasdoknadsokn");
	        assertEquals(null, tweet);
	        assertEquals(0, usu.getTweets().size());
	    }
	    
	    @Test
	    public void testAgregarTweet() {
	    	Tweet tweet = usu.agregarTweet("hola que tal");
	        assertEquals(1, usu.getTweets().size());
	    }   
	    
	    @Test
	    public void testAgregarRetweet() {
	    	Tweet retweet = usu.agregarRetweet(tweetOrigen);
	        assertEquals(1, usu.getTweets().size());
	    }
	    
	    @Test
	    public void testNoEliminarUsuarioNoEncontrado() {
	    	twitter.eliminarUsuario("jose");
	        assertEquals(1, twitter.getUsuarios().size());
	    }
	    
	    @Test
	    public void testEliminarUsuario() {
	    	twitter.eliminarUsuario("valen");
	        assertEquals(0, usu.getTweets().size());
	        assertEquals(0, twitter.getUsuarios().size());
	    }
	    
	   
	    
	    
}

