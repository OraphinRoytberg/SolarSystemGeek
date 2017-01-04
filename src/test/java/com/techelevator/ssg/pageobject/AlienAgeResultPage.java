package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlienAgeResultPage {
	
	private WebDriver webDriver;

	public AlienAgeResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public String getAlienAge() {
		return webDriver.findElement(By.id("alienAge")).getText();
	}

	public String getAlienPlanet() {
		return webDriver.findElement(By.id("alienPlanet")).getText();
	}
	
	public String getEarthAge() {
		return webDriver.findElement(By.id("earthAge")).getText();
	}
}
