package com.techelevator.ssg;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.AlienAgeInputPage;
import com.techelevator.ssg.pageobject.AlienAgeResultPage;
import com.techelevator.ssg.pageobject.Homepage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class AlienAgeSteps {
	
	private Homepage homePage;
	private WebDriver webDriver;
	private AlienAgeInputPage alienAgeInputPage;
	private AlienAgeResultPage alienAgeResultPage; //Declare

	@Autowired
	public AlienAgeSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.homePage = new Homepage(webDriver);
		this.alienAgeInputPage = new AlienAgeInputPage(webDriver);
		this.alienAgeResultPage = new AlienAgeResultPage(webDriver); //making it class level
	}

	@Given("^I want to calculate my age on Mars$")
	public void i_want_to_calculate_my_age_on_Mars() throws Throwable {
	    webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair");
	    homePage.clickAlienAgeLink().chooseAPlanet("Mars");
	}

	@Given("^my earth age is (\\d+) years$")
	public void my_earth_age_is_years(String earthAge) throws Throwable {
	    alienAgeInputPage.enterEarthAge(earthAge);
	}

	@When("^I request my alien age$")
	public void i_request_my_alien_age() throws Throwable {
	   alienAgeInputPage.submitForm();
	}

	@Then("^my alien age should be (\\d+) years$")
	public void my_alien_age_should_be_years(String expectedAlienAge) throws Throwable {
	    Assert.assertEquals(expectedAlienAge, alienAgeResultPage.getAlienAge());
	}

}
