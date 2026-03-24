package ar.edu.unlp.objetos.uno.oo2_ejercicio2;

public class Lagarto implements Opcion {

	@Override
	public String jugarContra(Opcion rival) {
		return rival.jugarContraLagarto();
	}

	@Override
	public String jugarContraPiedra() {
		// TODO Auto-generated method stub
		return "GANA PIEDRA: Piedra aplasta lagarto";
	}

	@Override
	public String jugarContraPapel() {
		// TODO Auto-generated method stub
		return "GANA LAGARTO: Lagarto come papel";
	}

	@Override
	public String jugarContraTijera() {
		// TODO Auto-generated method stub
		return "GANA TIJERA: Tijera decapita lagarto";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "GANA LAGARTO: Lagarto envenena spock";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Empate";
	}

}
