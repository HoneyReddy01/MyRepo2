package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNGTwo {
	
	@BeforeTest
	public void AfterTestMethod() {
		System.out.println("This method will prints after atest Method...........");
	}
	
	@Test
	public void DemoMethod() {
		System.out.println("This Method Is a demo Method ................");
	}

}
