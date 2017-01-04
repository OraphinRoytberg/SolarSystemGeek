package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriveTimeInputPage {
	
	private WebDriver webDriver;

	public DriveTimeInputPage(WebDriver webDriver) {
		this.webDriver =  webDriver;
	}
	
	public DriveTimeInputPage chooseAPlanet(String planet) {
		Select selectFeild = new Select(webDriver.findElement(By.id("planet")));
		selectFeild.selectByVisibleText(planet);
		return this;
	}
	
	public DriveTimeInputPage chooseTransportation(String transportation) {
		Select selectTransportation = new Select(webDriver.findElement(By.id("transportation")));
		selectTransportation.selectByVisibleText(transportation);
		return this;
	}
	
	public DriveTimeInputPage enterEarthAge(String earthAge) {
		WebElement ageField = webDriver.findElement(By.id("earthAge"));
		ageField.sendKeys(earthAge);
		return this;
	}
	
	public DriveTimeResultPage submitForm() {
		WebElement submitButton = webDriver.findElement(By.id("culculateTravelTime"));
		submitButton.click();
		return new DriveTimeResultPage(webDriver);
	}

}
