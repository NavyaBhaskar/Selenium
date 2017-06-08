package com.practice;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "SmokeTest")
	public void TC1() {
		System.out.println("Print hello");
	}

	@Test(groups = { "SmokeTest", "FunctionalTest" })
	public void TC2() {
		System.out.println("Hi, how are u");
	}

	@Test(groups = { "FunctionalTest", "IntegrationTest" })
	public void TC3() {
		System.out.println("Print logout");
	}
}
