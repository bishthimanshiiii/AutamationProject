package implicitweight;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//a[@class='blur_class type-active']")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("delhi",Keys.ENTER);
		driver.findElement(By.xpath("//p[text()='Indira Gandhi International']")).click();
		driver.findElement(By.xpath("//p[text()='Indira Gandhi International']")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys("dehra",Keys.ENTER);
	} 

}
