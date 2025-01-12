package com.TestNg.Com.TestNGPracticeProject;

import org.testng.annotations.Test;

public class TwoTestNg {
	@Test (groups= {"Smoke"})          
	public void bananaTestNg() {
		System.out.println("This is for banana .........");
		
	}
	
	@Test
	public void appleTestNg() {
		System.out.println("This is for apple .........");
	}
	
	@Test
	public void grapeTestNg() {
		System.out.println("This is for grape .........");
	}
	
	@Test(groups= {"Smoke"})
	public void pomogranateTestNg() {
		System.out.println("This is for pomogranate .........");
		
	}
}
