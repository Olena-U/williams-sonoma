/**
 * File Name: QAMath.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 28, 2017
 */
package com.sqa.ou.helpers;

/**
 * QAMath //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 * @since 1.0
 */
public class QAMath {

	public static int addNumbers(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int square(int num, int pow) {
		int result = num;
		for (int i = 0; i < pow - 1; i++) {
			result *= num;
		}
		return result;
	}

	public static int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	private int total;

	public int addNumber(int num) {
		setTotal(getTotal() + num);
		// total+=num;
		// return total;
		return getTotal();
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return this.total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	public int square(int pow) {
		this.total = QAMath.square(getTotal(), pow);
		return this.total;
	}

	public int subNumber(int num) {
		this.total -= num;
		return this.total;
	}
}
