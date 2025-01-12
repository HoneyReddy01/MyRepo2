package selfProgrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 driver.manage().window().maximize();
		 String URL="https://www.meesho.com/?";
		 driver.get(URL);
		 
		// USing GetRect We will get both HEight,Width
		 //X coordinate ,Y coordinate
		 // return trypr is rectangle
		 
		 WebElement HW = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div/input"));
		 Rectangle Height = HW.getRect();
		 
		 System.out.println("Height of the search box is: " + Height.height);
		 System.out.println("Width of the Search box is :"+ Height.width);
		 
		 System.out.println("X Coordinate of the Search Box is :"+ Height.x);
		 System.out.println("Y Coordinate of the Search Box is :"+ Height.y);
		 
		 System.out.println("Successfully got..........");
		 
		 driver.close();
		 
		 
	}

}
