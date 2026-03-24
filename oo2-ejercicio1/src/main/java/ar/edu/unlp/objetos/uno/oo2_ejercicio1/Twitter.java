package ar.edu.unlp.objetos.uno.oo2_ejercicio1;

import java.util.ArrayList;

public class Twitter {
	
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Twitter(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario crearUsuario(String screenName) {
		boolean existe = usuarios.stream().anyMatch(u->u.getScreenName().equals(screenName));
		if (existe) {
			return null;
		}
		else {
			Usuario nuevo = new Usuario(screenName);
			usuarios.add(nuevo);
			return nuevo;
		}
	}
	
	public void eliminarUsuario(String screenName) {
		Usuario usuario = usuarios.stream()
				.filter(u -> u.getScreenName()
				.equals(screenName))
				.findFirst()
				.orElse(null);
		
		if (usuario != null) {
			usuario.eliminarTodosLosTweets();
			usuarios.remove(usuario);
		}
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
}
