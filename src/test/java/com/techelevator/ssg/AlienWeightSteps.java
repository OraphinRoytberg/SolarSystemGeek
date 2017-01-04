package com.techelevator.ssg;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.AlienWeightInputPage;
import com.techelevator.ssg.pageobject.AlienWeightResultPage;
import com.techelevator.ssg.pageobject.Homepage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class AlienWeightSteps {
	
	private WebDriver webDriver;
	private AlienWeightInputPage alienWeightInput;
	private AlienWeightResultPage alienWeightResult;
	private Homepage homePage;
	
	@Autowired
	public AlienWeightSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.homePage = new Homepage(webDriver);
		this.alienWeightInput = new AlienWeightInputPage(webDriver);
		this.alienWeightResult = new AlienWeightResultPage(webDriver);
	}
	
	@Given("^I want to calculate my weight on Mars$")
	public void i_want_to_calculate_my_weight_on_Mars() throws Throwable {
	    webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair");
	    homePage.clickAlienWeightLink().chooseAPlanet("Mars");
	}

	@Given("^my earth weight is (\\d+) lbs\\.$")
	public void my_earth_weight_is_lbs(String earthWeight) throws Throwable {
	    alienWeightInput.enterWeight(earthWeight);
	}

	@When("^I request my alien weight$")
	public void i_request_my_alien_weight() throws Throwable {
	    alienWeightInput.submitForm();
	}

	@Then("^my alien weight should be (\\d+) lbs\\.$")
	public void my_alien_weight_should_be_lbs(String expecedAlienWeight) throws Throwable {
	    Assert.assertEquals(expecedAlienWeight, alienWeightResult.getAlienWeight());
	}

}
