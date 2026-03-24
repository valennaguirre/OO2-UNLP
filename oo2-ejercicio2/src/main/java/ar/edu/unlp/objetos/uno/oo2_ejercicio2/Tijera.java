package ar.edu.unlp.objetos.uno.oo2_ejercicio2;

public class Tijera implements Opcion {

	@Override
	public String jugarContra(Opcion rival) {
		return rival.jugarContraTijera();
	}
	
	@Override
	public String jugarContraPiedra() {
		// TODO Auto-generated method stub
		return "GANA PIEDRA: Piedra aplasta tijera";
	}

	@Override
	public String jugarContraPapel() {
		// TODO Auto-generated method stub
		return "GANA TIJERA: Tijera corta papel";
	}

	@Override
	public String jugarContraTijera() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "GANA SPOCK: Spock rompe tijera";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "GANA TIJERA: Tijera decapita lagarto";
	}
}
