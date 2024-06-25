package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deam11 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.dream11.com/ ");
	
	//identify the frame and switch to that frame
	
	//using web element reference variable
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
			
			
	/*for using frame by id or name and attributr driver.switchTo().frame("send-sms-iframe");*/
	
	//using web element reference variable
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("112344567");
}
}
