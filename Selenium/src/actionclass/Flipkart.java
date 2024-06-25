package actionclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
		//to switch window
		Set<String>  allid= driver.getWindowHandles();//handles will give parent and child id
		
		//for itrating the id
		for(String id :  allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"))
			{
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
	}

}
