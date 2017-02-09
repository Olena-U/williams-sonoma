/**
 * File Name: AutoBasics.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 4, 2017
 */
package com.sqa.ou.helpers;

import java.io.*;

import org.apache.commons.io.*;
import org.openqa.selenium.*;

public class AutoBasics {

	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean takeScreenShot(WebDriver driver, String fileName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
