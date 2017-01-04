package com.techelevator.ssg;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.AlienAgeResultPage;
import com.techelevator.ssg.pageobject.Homepage;

public class AlienAgeIntegrationTest {

	private static WebDriver webDriver;
	private Homepage homePage;
	
	@BeforeClass
	public static void openWebBrowserForTesting() {
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	
	@Before
	public void openHomePage() {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage = new Homepage(webDriver);
	}
	
	@AfterClass
	public static void closeWebBrowser() {
		webDriver.close();
	}
	
	
}
