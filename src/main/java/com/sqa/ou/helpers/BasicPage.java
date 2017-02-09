/**
 * File Name: BasicPage.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 4, 2017
 */
package com.sqa.ou.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class BasicPage {

	private WebDriver driver;

	public BasicPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public boolean isElementPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by);
	}

	public boolean takeScreenshot() {
		return AutoBasics.takeScreenShot(getDriver(), "Nestle:");
	}

	public boolean takeScreenshot(String name) {
		return AutoBasics.takeScreenShot(getDriver(), name);
	}
}
