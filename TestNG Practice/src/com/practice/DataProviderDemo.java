package com.practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	@DataProvider
	public Object[][] GetLoginData(){

		Object[][] A=new Object[3][2];
		A[0][0]= "abc";
		A[0][1]= "123";

		A[1][0]= "def";
		A[1][1]= "567";

		A[2][0]= "mno";
		A[2][1]= "890";
	return A;
	}
	

	@Test(dataProvider="GetLoginData")

		public void LoginAndLogout(String username, String password){
			System.out.println("enter username" +username);
			System.out.println("enter password" +password);
		}

	}











