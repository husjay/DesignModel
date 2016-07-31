package com.husjay.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector hsjAirShipDirector = new HsjAirShipDirector(new HsjAirShipBuilder());
		
		AirShip hsjAirShip = hsjAirShipDirector.directAirship();
	}
}
