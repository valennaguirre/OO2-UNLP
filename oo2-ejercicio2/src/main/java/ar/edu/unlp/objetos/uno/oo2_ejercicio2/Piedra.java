package ar.edu.unlp.objetos.uno.oo2_ejercicio2;

public class Piedra implements Opcion {

	@Override
	public String jugarContra(Opcion rival) {
		return rival.jugarContraPiedra();
	}

	@Override
	public String jugarContraPiedra() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContraPapel() {
		// TODO Auto-generated method stub
		return "GANA PAPEL: Papel cubre piedra";
	}

	@Override
	public String jugarContraTijera() {
		// TODO Auto-generated method stub
		return "GANA PIEDRA: Piedra aplasta tijera";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "GANA SPOCK: Spock vaporiza piedra";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "GANA PIEDRA: Piedra aplasta lagarto";
	}
}
