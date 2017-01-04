package com.techelevator.ssg.model;

import java.util.HashMap;
import java.util.Map;

public class AlienWeightCalculator {
	
	private String planet;
	private int earthWeight;
	
	public AlienWeightCalculator(String planet, int earthWeight) {
		this.planet = planet;
		this.earthWeight = earthWeight;
	}
	
	public String getAlienPlanet() {
		return planet;
		
	}
	
	public int getEarthWeight() {
		return earthWeight;
	}
	
	public int getAlienWeight() {
		Map <String, Double> planetG = new HashMap<>();
			planetG.put("Mercury", 0.37);
			planetG.put("Venus", 0.90);
			planetG.put("Mars", 0.38);
			planetG.put("Jupiter", 2.65);
			planetG.put("Saturn", 1.13);
			planetG.put("Uranus", 1.09);
			planetG.put("Neptune", 1.43);
		return (int)(planetG.get(planet) * earthWeight) ;
	}

}
