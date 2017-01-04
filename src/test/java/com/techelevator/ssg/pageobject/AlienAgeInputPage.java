package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AlienAgeInputPage {
	
	private WebDriver webDriver;

	public AlienAgeInputPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public AlienAgeInputPage chooseAPlanet(String planet) {
		Select selectField = new Select(webDriver.findElement(By.id("planet")));
		selectField.selectByVisibleText(planet);
		return this;
	}
	
	public AlienAgeInputPage enterEarthAge(String earthAge ) {
		WebElement agefield = webDriver.findElement(By.id("earthAge"));
		agefield.sendKeys(earthAge);
		return this;
	}
	
	public AlienAgeResultPage submitForm() {
		WebElement submitButton = webDriver.findElement(By.id("calculateAge"));
		submitButton.click();
		return new AlienAgeResultPage(webDriver);
	}

}
