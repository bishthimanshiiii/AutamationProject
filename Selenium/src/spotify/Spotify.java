package spotify;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://open.spotify.com/");
		
		driver.findElement(By.xpath("(//span[@class='IconWrapper__Wrapper-sc-16usrgb-0 hYdsxw'] )[1]")).click();
		

		driver.findElement(By.xpath("(//button[@class='mWj8N7D_OlsbDgtQx5GW'] )[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Log in'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("anitabisht2201@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("anitabisht",Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 liTfRZ encore-bright-accent-set']")).click();
		
		driver.findElement(By.xpath("(//div[@class='RowButton-sc-xxkq4e-0 hIehTT'])[3]")).click();
		
		
		
		
		//search
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='encore-text encore-text-body-small NtkAQg9R1r5CjuP0XHwl']")).sendKeys("Guzarish");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Guzarish'])[1]")).click();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='Button-sc-1dqy6lx-0 gniGgW'])[2]")).click();
		
		
//addto playlist
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add to playlist']")).click();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='My Playlist #1']/ancestor::button[@class='mWj8N7D_OlsbDgtQx5GW']")).click();
		
		//play song
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='IconWrapper__Wrapper-sc-1hf1hjl-0 cNvoOe']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='RowButton-sc-xxkq4e-0 hIehTT'])[2]")).click();

//playmusic
Thread.sleep(20);
driver.findElement(By.xpath("//div[text()='Lover']")).click();
//play
Thread.sleep(20);
driver.findElement(By.xpath("//span[@class='IconWrapper__Wrapper-sc-1hf1hjl-0 cNvoOe']")).click();
//driver.findElement(By.xpath("(//button[@class='j2s64Lz8y6VzBLB_V9Gm'])[1]")).click();


		

//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Guzarish']")).click();
//		
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bXrXni encore-bright-accent-set']")).click();
		

//playlist visit

	
		
		
		
		
	}

}
