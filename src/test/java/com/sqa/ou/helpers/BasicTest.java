/**
 * File Name: BasicTest.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 4, 2017
 */
package com.sqa.ou.helpers;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.testng.annotations.*;

public class BasicTest {

	private String baseUrl;

	private WebDriver driver;

	public BasicTest(String baseUrl) {
		super();
		this.baseUrl = baseUrl;
	}

	public String getBaseUrl() {
		return this.baseUrl;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	@BeforeMethod(groups = "chrome")
	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.get(this.baseUrl);
	}

	@BeforeMethod(groups = "firefox")
	public void setupFirefox() {
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.get(this.baseUrl);
	}

	@BeforeMethod(groups = "safari")
	public void setupSafari() {
		this.driver = new SafariDriver();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.driver.get(this.baseUrl);
	}

	@AfterMethod
	public void teardown() {
		this.driver.quit();
	}
}