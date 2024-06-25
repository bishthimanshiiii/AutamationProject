package actionclass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosedWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/ncr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[1]")).click();
		Set <String> allid = driver.getWindowHandles();
		
		for(String id : allid)
		{
			driver.switchTo().window(id);//to switch window 
			if(driver.getTitle().equals("Zomato | LinkedIn"))
			{
				break;
			}
			
					
		}
		Thread.sleep(2000);
	   driver.close(); 
		//driver.quit();
	}
	
}
