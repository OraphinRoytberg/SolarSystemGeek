package com.techelevator.ssg.model;

import java.util.HashMap;
import java.util.Map;

public class AlienAgeCalculator {

	private String planet;
	private int earthAge;
	
	public AlienAgeCalculator(String planet, int earthAge) {
		this.planet = planet;
		this.earthAge = earthAge;
	}
	
	public String getAlienPlanet() {
		return planet;
	}
	
	public int getEarthAge() {
		return earthAge;
	}
	
	public int getAlienAge() {
		Map <String, Double> planetYear = new HashMap<>();
		planetYear.put("Mercury", 87.96/365);
		planetYear.put("Venus", 224.68/365);
		planetYear.put("Mars", 686.98/365);
		planetYear.put("Jupiter", 11.862);
		planetYear.put("Saturn", 29.456);
		planetYear.put("Uranus", 84.07);
		planetYear.put("Neptune", 164.81);
		return (int)(earthAge/planetYear.get(planet)) ;
		
	}
	
}
