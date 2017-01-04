package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriveTimeResultPage {
	
	private WebDriver webDriver;

	public DriveTimeResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public String getAlienPlanet() {
		return webDriver.findElement(By.id("alienPlanet")).getText();
	}

	public String getTransportation() {
		return webDriver.findElement(By.id("transportation")).getText();
	}
	
	public String getArrivalAge() {
		return webDriver.findElement(By.id("arrivalAge")).getText();
	}
	
	public String getTravelTime() {
		return webDriver.findElement(By.id("travelTime")).getText();
	}
}
