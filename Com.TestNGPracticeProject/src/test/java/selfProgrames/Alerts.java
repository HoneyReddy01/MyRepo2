package selfProgrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().window().maximize();
		
		String URL="https://www.hyrtutorials.com/p/alertsdemo.html";
		driver.get(URL);
		System.out.println(driver.findElement(By.id("alertBox")).getText());
		driver.findElement(By.id("alertBox")).click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		System.out.println(driver.findElement(By.id("output")).getText());
		
		System.out.println("Success");
		driver.quit();
		
		
		
	}

}
