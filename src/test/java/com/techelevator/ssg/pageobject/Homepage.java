package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	private WebDriver webDriver;
	
	public Homepage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public  AlienAgeInputPage clickAlienAgeLink() {
		WebElement alienAgeLink = webDriver.findElement(By.linkText("Alien Age"));
		alienAgeLink.click();
		return new AlienAgeInputPage(webDriver);
	}

	public AlienWeightInputPage clickAlienWeightLink() {
		WebElement alienWeightLink = webDriver.findElement(By.linkText("Alien Weight"));
		alienWeightLink.click();
		return new AlienWeightInputPage(webDriver);
	}
	
	public DriveTimeInputPage clickDriveTimeLink() {
		WebElement driveTimeLink = webDriver.findElement(By.linkText("Drive Time"));
		driveTimeLink.click();
		return new DriveTimeInputPage(webDriver);
	}
	
	public SpaceForumInputPage clickSpaceForumLink() {
		WebElement spaceForumLink = webDriver.findElement(By.linkText("Space Forum"));
		spaceForumLink.click();
		return new SpaceForumInputPage(webDriver);
	}
	
	public SpaceStoreInputPage clickSpaceStroeLink() {
		WebElement spaceStoreLink = webDriver.findElement(By.linkText("Space Store"));
		spaceStoreLink.click();
		return new SpaceStoreInputPage(webDriver);
	}
}
