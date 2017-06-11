package com.practice;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {

	@BeforeClass
	public void openBrowser(){
		System.out.println("Open the browser");
	}
	@AfterClass
	public void closeBrowser(){
		System.out.println("Close the browser");
	}
	
	@BeforeMethod
	public void openApplication(){
		System.out.println("Open the Application");
	}
	
	@AfterMethod
	public void closeApplication(){
		System.out.println("Close the Application");
	}

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




