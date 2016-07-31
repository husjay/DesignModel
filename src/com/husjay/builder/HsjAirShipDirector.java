package com.husjay.builder;

public class HsjAirShipDirector implements AirShipDirector{

	private AirShipBuilder airShipBuilder;
	
	
	
	public HsjAirShipDirector(AirShipBuilder airShipBuilder) {
		
		this.airShipBuilder = airShipBuilder;
	}



	@Override
	public AirShip directAirship() {
		OrbitaModule orbitaModule = airShipBuilder.builderOrbitaModule();
		Engine engine = airShipBuilder.builderEngine();
		EscapeTower escapeTower = airShipBuilder.builderEscapeTower();
		
		AirShip airShip = new AirShip();
		airShip.setOrbitaModule(orbitaModule);
		airShip.setEngine(engine);
		airShip.setEscapeTower(escapeTower);
		return airShip;
	}

}
