package com.practice;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Validation {
	/**
	 * This is my 1st pgm.
	 * 
	 */
	@Test
	public void validateIntvalues() {
		System.out.println("inside validateInt values");
		int actualvalue = 10;
		int expectedvalue = 19;
		Assert.assertSame(actualvalue, expectedvalue);
		System.out.println("inside chat withfrnds test");
	}
}
