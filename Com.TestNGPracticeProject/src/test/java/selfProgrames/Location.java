package selfProgrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// Get Location will give Only X & Y Coordinates Only 
// Return type is Point

public class Location {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		String URL= "https://www.meesho.com/";
		driver.get(URL);
		WebElement Location = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/div[5]/span"));
		Point Loc = Location.getLocation();
		System.out.println("X coordinate Of the Element: "+ Loc.getX());
		System.out.println("Y coordinate of the element is :"+ Loc.getY());
		
		System.out.println("Success......");
		
	
	
	
	
	}

}
