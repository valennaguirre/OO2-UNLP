package ar.edu.unlp.objetos.uno.oo2_ejercicio2;

public class Spock implements Opcion {

	@Override
	public String jugarContra(Opcion rival) {
		return rival.jugarContraSpock();
	}

	@Override
	public String jugarContraPiedra() {
		// TODO Auto-generated method stub
		return "GANA SPOCK: Spock vaporiza piedra";
	}

	@Override
	public String jugarContraPapel() {
		// TODO Auto-generated method stub
		return "GANA PAPEL: Papel desaprueba Spock";
	}

	@Override
	public String jugarContraTijera() {
		// TODO Auto-generated method stub
		return "GANA SPOCK: Spock rompe tijera";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "GANA LAGARTO: Lagarto envenena Spock";
	}

}
