package ar.edu.unlp.objetos.uno.oo2_ejercicio2;

public class Juego {

	public static void main(String[] args) {
		Papel papel = new Papel();
		Piedra piedra = new Piedra();
		Spock spock = new Spock();
		Tijera tijera = new Tijera();
		Lagarto lagarto = new Lagarto();
		
		System.out.println(papel.jugarContra(lagarto));
		System.out.println(piedra.jugarContra(tijera));
		System.out.println(spock.jugarContra(piedra));
		System.out.println(lagarto.jugarContra(tijera));
		System.out.println(tijera.jugarContra(tijera));
		System.out.println(spock.jugarContra(lagarto));
		System.out.println(lagarto.jugarContra(spock));
	}

}
