package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.Test;

public class GroupingTestCases {
	
	@Test(groups= {"Smoke"})
	public void setup() {
		System.out.println("To setup the Browser .......");
		
	}
	public void DemoMethod() {
		System.out.println("This Method Is a demo Method ................");
	}
	
	@Test
	public void login() {
		System.out.println("This for login Functionality.......");
		
		
	}
	@Test(groups={"Smoke"})
	public void registration() {
		System.out.println("This is for Registration functionality.........");
	}
	
	

}
