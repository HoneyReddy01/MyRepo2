package com.TestNg.Com.TestNGPracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HardAssertions {
	
    public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 //
		 Assert.assertTrue(driver.getTitle(), false);
		 
		 
		 driver.findElement(By.linkText("Cart")).click();
		 
	}
}
