package selfProgrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandW {
	
   public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	String URL="https://www.meesho.com/";
	driver.get(URL);
	
	WebElement size = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/div[1]/div[4]"));
	Dimension H = size.getSize();
	System.out.println("height of the element is :"+ H.height);
	
	System.out.println("width of the element is: "+ H.width);
	
	
	System.out.println("Success.........");
	
}

}
