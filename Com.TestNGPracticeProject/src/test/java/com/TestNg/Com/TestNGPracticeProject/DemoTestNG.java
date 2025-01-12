package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void Setup() {
		System.out.println("Launching browser and opens the url.......... ");
		
	}
	@BeforeMethod
	public void closure() {
		System.out.println("This for closing the url.............");
	}
	
		
	@AfterMethod 
	public void registration() {
		System.out.println("This is for registration functionality ..........");
		
		
	}
	@AfterMethod
	public void login () {
		System.out.println("This is for login functionality...........");
	
		
	}
	@Test 
    public void homepage() {
		System.out.println("This is a homepage after login to the application......");
	}
}
