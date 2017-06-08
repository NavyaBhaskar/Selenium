package com.practice;

import org.testng.annotations.Test;

public class PriorityandInvocationCount {

	@Test(priority=-1)
	public void example1(){
		System.out.println("Print Exmp 1");
	}

	@Test(invocationCount=2)
	public void example2(){
		System.out.println("Print Exmp 2");
	}
	@Test(priority=2)
	public void example3(){
		System.out.println("Print Exmp 1");
	}


}




