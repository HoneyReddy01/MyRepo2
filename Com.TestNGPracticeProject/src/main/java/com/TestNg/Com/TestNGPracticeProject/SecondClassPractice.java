package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SecondClassPractice {

	
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("Printing Before method 1");
		
		
	}
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("Printing after Method 2");
		
		
	}
	@Test
	public void TestMethod() {
		System.out.println("This is test method ");
	}
}
