package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	
	//@BeforeMethod 
	@AfterClass
	public void SetUp() {
		System.out.println("Opeining the browser and opening the application URL.........");
		
		
	}
	//@AfterMethod
	@BeforeClass
	public void Closure()
	{
		System.out.println("Closing the browser...............");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("This is for login Functionality.......");
		
	}
	@Test(priority=1)
	public void registration() {
		System.out.println("This is for Registration Functionality.......");
		
	}
	@Test(priority=3)
	public void homepage() {
		System.out.println("This is for homepage Functionality .....");
		
	}
}
