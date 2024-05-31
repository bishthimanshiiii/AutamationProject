package implicitweight;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Shoppers {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40) );
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='Santoor']")).click();
		//WebElement a =driver.findElement(By.xpath("//form[@class='ProductDisplay_pinForm__iy7Zz MuiBox-root css-0']")).sendKeys("12345");
		
		driver.findElement(By.id("Check")).sendKeys("67890");
	}

}
