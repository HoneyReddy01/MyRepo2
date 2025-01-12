package selfProgrames;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScsht {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().window().maximize();
		
		String URL="https://demo.automationtesting.in/Alerts.html";
		driver.get(URL);
		TakesScreenshot ts= (TakesScreenshot)driver;
		WebElement sht = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1"));
		
		Thread.sleep(3000);
		
		File Source = sht.getScreenshotAs(OutputType.FILE);
		
		File desti = new File("./DemoFolder/sample.png");
		
		FileUtils.copyFile(Source, desti);
		
		System.out.println("Success");
		
		
		
		

}
}
