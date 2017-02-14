package com.sqa.ou.helpers;

/**
 * File Name: Core.java<br>
 * Umanska, Olena<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 11, 2017
 */
/**
 * Core //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Umanska, Olena
 * @version 1.0.0
 * @since 1.0
 */
public class Core {

	public boolean addProp(String key, String value) {
		return AutoBasics.writeProps(key, value);
	}

	public int getInt(String name) {
		return AutoBasics.getInt(name);
	}

	public String getProp(String name) {
		return AutoBasics.getProp(name);
	}
}
