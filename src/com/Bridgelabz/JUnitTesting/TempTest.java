package com.Bridgelabz.JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TempTest {

	@Test
	public void temptest() {
		Utility u = new Utility();
		double result = u.temperatureConversion(40.0);
		assertEquals(104.0, result);

	}

	@Test
	void temp1Test() {
		Utility u = new Utility();
		double result = u.temperatureConversion1(68.0);
		assertEquals(20, result);
	}

}
