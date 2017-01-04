package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AlienWeightInputPage {
	
	private WebDriver webDriver;

	public AlienWeightInputPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public AlienWeightInputPage chooseAPlanet(String planet) {
		Select selectFeild = new Select(webDriver.findElement(By.id("planet")));
		selectFeild.selectByVisibleText(planet);
		return this;
	}
	
	public AlienWeightInputPage enterWeight(String earthWeight) {
		WebElement weightFeild = webDriver.findElement(By.id("earthWeight"));
		weightFeild.sendKeys(earthWeight);
		return this;
	}
	
	public AlienWeightResultPage submitForm() {
		WebElement submitButton = webDriver.findElement(By.id("calculateWeight"));
		submitButton.click();
		return new AlienWeightResultPage(webDriver);
	}

}
