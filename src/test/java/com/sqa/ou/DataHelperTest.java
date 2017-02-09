package com.sqa.ou;

import org.testng.*;
import org.testng.annotations.*;

import com.sqa.ou.helpers.*;

public class DataHelperTest {
	// @Test(dataProvider = "dp")
	// public void test(Object[] data) {
	// }
	//
	//
	// @DataProvider
	// public Object[][][] dp() {
	// return (Object[][][]) new Object[][] {
	// new Object[] { new Object { 1, "a"} },
	// new Object[] { new Object { 2, "b"} },
	// };
	// }

	// @Test// (dataProvider = "dp")
	// public void testDataHelper() {
	// // @DataProvider - Should comment out because you do not need this
	// // method
	// }
	public Object[][] dp() {
		return new Object[][] { new Object[] { 3, 5, 4, 1 }, new Object[] { 3.1, 5.55, 4.1, 1.3 },
				{ "3", "5", "4", "1" }, { '3', '5', '4', '1' } };
	}

	@Test // (dataProvider="dp") - Again, should comment out because you do not
			 // need this method
	public void testStaticDisplayData() {
		Object[][] data = dp();
		String expected = "3	5	4	1	\n" + "3.1	5.55	4.1	1.3	\n" + "3	5	4	1	\n"
				+ "3	5	4	1	\n";
		String actual = DataHelper.displayData(data);
		System.out.println(DataHelper.displayData(data));
		Assert.assertEquals(actual, expected, "does not work correctly");
	}
}
