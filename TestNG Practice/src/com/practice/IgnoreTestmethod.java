package com.practice;
import org.testng.annotations.Test;

public class IgnoreTestmethod {
	
	@Test
	public void logintest(){
		System.out.println("Print login");
	}

	@Test(enabled=false)
	public void signupTest(){
		System.out.println("print signup");
	}
}
