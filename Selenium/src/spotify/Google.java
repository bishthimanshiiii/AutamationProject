package spotify;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		

	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	
	
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='app']"));
	
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//span[text()='Maps']")).click();
	//driver.findElement(By.xpath("(//a[@class='tX9u1b'])[3]")).click();
	
	
	
	}

}
