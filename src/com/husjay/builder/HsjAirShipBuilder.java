package com.husjay.builder;

public class HsjAirShipBuilder implements AirShipBuilder{
	
	public HsjAirShipBuilder() {
		
	}
	@Override
	public OrbitaModule builderOrbitaModule() {
		System.out.println("构建hsj轨道舱");
		return new OrbitaModule("hsj轨道舱");
	}

	@Override
	public Engine builderEngine() {
		System.out.println("构建hsj发动机");
		return new Engine("hsj发动机");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建hsj逃逸塔");
		return new EscapeTower("hsj逃逸塔");
	}

}
