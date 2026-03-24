package ar.edu.unlp.objetos.uno.oo2_ejercicio2;

public class Papel implements Opcion {

	@Override
	public String jugarContra(Opcion rival) {
		return rival.jugarContraPapel();
	}
	
	@Override
	public String jugarContraPiedra() {
		// TODO Auto-generated method stub
		return "GANA PAPEL: Papel cubre piedra";
	}

	@Override
	public String jugarContraPapel() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContraTijera() {
		// TODO Auto-generated method stub
		return "GANA TIJERA: Tijera corta papel";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "GANA PAPEL: Papel desaprueba spock";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "GANA LAGARTO: Lagarto come papel";
	}

}
