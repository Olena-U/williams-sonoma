/**
 * File Name: AppBasics.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 14, 2017
 */
package com.sqa.ou.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName, String appName) {
		System.out.println("Thank you for using the " + appName + " Application");
		System.out.println("Good Bye " + userName);
	}

	public static String greetUserAndGetName(String nameOfApp) {
		System.out.println("Hello, Welcome to the " + nameOfApp + " App.");
		System.out.print("Could I please ask your name? \n");
		return scanner.nextLine();
	}
}
