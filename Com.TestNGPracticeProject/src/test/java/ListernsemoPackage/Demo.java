package ListernsemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class Demo {
	
@Test	
public void one() {
		
		WebDriver driver= new ChromeDriver();
		driver. manage().window().maximize();
		driver.get("https:/www.filpkart.com/");
		Assert.assertEquals(driver.getTitle(),"Your store");
		
		driver.quit();
		
		}
	

}
