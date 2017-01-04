package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlienWeightResultPage {
	
	private WebDriver webDriver;

	public AlienWeightResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public String getAlienWeight() {
		return webDriver.findElement(By.id("alienWeight")).getText();
	}
	
	public String getAlienPlanet() {
		return webDriver.findElement(By.id("alienPlanet")).getText();
	}
	
	public String getEarthWeight() {
		return webDriver.findElement(By.id("earthWeight")).getText();
	}

}
