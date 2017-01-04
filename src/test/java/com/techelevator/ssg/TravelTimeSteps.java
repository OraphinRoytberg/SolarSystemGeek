package com.techelevator.ssg;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.DriveTimeInputPage;
import com.techelevator.ssg.pageobject.DriveTimeResultPage;
import com.techelevator.ssg.pageobject.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class TravelTimeSteps {
	
	private WebDriver webDriver;
	private Homepage homePage;
	private DriveTimeInputPage driveTimeInput;
	private DriveTimeResultPage driveTimeResult;
	
	@Autowired
	public TravelTimeSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.homePage = new Homepage(webDriver);
		this.driveTimeInput = new DriveTimeInputPage(webDriver);
		this.driveTimeResult = new DriveTimeResultPage(webDriver);
	}
	
	@Given("^I want to calculate travel time to Mars$")
	public void i_want_to_calculate_travel_time_to_Mars() throws Throwable {
	    webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair");
	    homePage.clickDriveTimeLink().chooseAPlanet("Mars");
	}

	@Given("^my mode of transportation is Bullet Train$")
	public void my_mode_of_transportation_is_Bullet_Train() throws Throwable {
	    driveTimeInput.chooseTransportation("Bullet Train");
	}

	@When("^I request my travel time$")
	public void i_request_my_travel_time() throws Throwable {
	    driveTimeInput.submitForm();
	}

	@Then("^my travel time should be (\\d+) years$")
	public void my_travel_time_should_be_years(String expectedTravelTime) throws Throwable {
	    Assert.assertEquals(expectedTravelTime, driveTimeResult.getTravelTime());
	}

	@Then("^my alien age should be (\\d+) years old$")
	public void my_alien_age_should_be_years_old(String expectedArrivalAge) throws Throwable {
	    Assert.assertEquals(expectedArrivalAge, driveTimeResult.getArrivalAge());
	}

}
