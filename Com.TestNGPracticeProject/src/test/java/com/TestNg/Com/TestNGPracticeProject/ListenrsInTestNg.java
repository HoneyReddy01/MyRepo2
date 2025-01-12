package com.TestNg.Com.TestNGPracticeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ListenrsInTestNg {
	
	public void one() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.filpkart.com/");
		Assert.assertEquals(driver.getTitle(),"Your store");
		}
	
	

}
