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

public class scsht1 {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().window().maximize();
		
		String URL="https://www.google.com";
		driver.get(URL);
		
		WebElement search = driver.findElement(By.className("gLFyf"));
		
		search.sendKeys("meesho");
		search.submit();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		
		WebElement Scsh = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/a/img"));
		
		
		
		//TakesScreenshot Ts= (TakesScreenshot)driver;
		File source = Scsh.getScreenshotAs(OutputType.FILE);
		File desti = new File("./DemoFolder/FullScsht10.png");
		FileUtils.copyFile(source, desti);
		
		
		
		System.out.println("Success.......");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
