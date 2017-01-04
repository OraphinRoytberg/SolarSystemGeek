package com.techelevator.ssg.model;

import java.util.HashMap;
import java.util.Map;

public class AlienTravelCalculator {
	
	private String planet;
	private String transportation;
	private int earthAge;
	
	public AlienTravelCalculator(String planet, String transportation, int earthAge) {
		this.earthAge = earthAge;
		this.planet = planet;
		this.transportation = transportation;
	}
	
	public String getAlienPlanet() {
		return planet;
	}
	
	public String getTransportation() {
		return transportation;
	}
	
	public int getTravelTime() {
		Map <String, Long> planetDistance = new HashMap<>();
		planetDistance.put("Mercury", 56974146l);
		planetDistance.put("Venus", 25724767l);
		planetDistance.put("Mars", 48678219l);
		planetDistance.put("Jupiter", 390674710l);
		planetDistance.put("Saturn", 792248270l);
		planetDistance.put("Uranus", 1692662530l);
		planetDistance.put("Neptune", 2703959960l);
		
		Map <String, Integer> speedMph = new HashMap<>();
		speedMph.put("Walking", 3);
		speedMph.put("Car", 100);
		speedMph.put("Bullet Train", 200);
		speedMph.put("Boeing 747", 570);
		speedMph.put("Concorde", 1350);
		
		long hoursToTravel= planetDistance.get(planet)/speedMph.get(transportation);
		int yearToTravel = (int)hoursToTravel/8760;
		
		return yearToTravel;
	}
	
	public int getArrivalAge() {
		return getTravelTime()+earthAge;
	}
	
	public int getEarthAge() {
		return earthAge;
	}
	

}
