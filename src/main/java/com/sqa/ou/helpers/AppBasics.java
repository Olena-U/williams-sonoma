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

	public static String requestInfoFromUser(String question) {
		String response;
		System.out.print(question + " ");
		response = scanner.nextLine();
		return response;
	}

	public static void tellUserWhatDayIsToday() {
		Calendar now = Calendar.getInstance();
		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));
		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		// Day_OF_WEEK starts from 1 while array index starts from 0
		System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
	}
}
