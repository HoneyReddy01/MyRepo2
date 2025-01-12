package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.Test;

public class oneTestNg {
	@Test(groups= {"Smoke"})
	public void oneTestNg(){
		System.out.println("This is for one...........");
		
	}
	@Test
	public void TwoTestNg(){
		System.out.println("This is for two...........");
		
	}
	
	@Test(groups= {"Smoke"})
	public void ThreeTestNg(){
		System.out.println("This is for three...........");
		
		
	}

}
