package actionclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToSwitchWindow {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
	 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone",Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'] )[1]")).click();
		
		
		
		
//		Set<String>allid = driver.getWindowHandles();
//		
//		for(String id : allid)
//		{
//		driver.switchTo().window(id);
//		if(driver.getTitle().equals("Amazon.in : iphone"))
//		{
//			break;
//		}
//			
//		}
		
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]")).click();
	}

}
