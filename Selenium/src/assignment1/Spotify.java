package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://open.spotify.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='What do you want to play?']")).click();
	}

}
