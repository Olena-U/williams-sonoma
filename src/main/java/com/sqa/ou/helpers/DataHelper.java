/**
 * File Name: DataHelper.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 30, 2017
 */
package com.sqa.ou.helpers;

/**
 * DataHelper //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 * @since 1.0
 */
public class DataHelper {
	// Constructor

	// Static Method
	public static String displayData(Object[][] data) {
		StringBuilder sb = new StringBuilder();
		// TODO Create two loops, one withing another to add all items to sb.
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				sb.append(data[i][j] + "\t");
			}
			sb.append("\n");
		}
		// sb.append(data[0][0]);
		return sb.toString();
	}

	// Instance Method (Will need a constructor that takes the Object[][])
	public String displayData() {
		String dataString = null;
		return dataString;
	}
}
