package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWAit {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//span[text()='SANTOOR']")).click();
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("110006");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//element find
	WebElement button = driver.findElement(By.xpath("//button[@id='Check']"));
	wait.until(ExpectedConditions.visibilityOf(button));
	
	
}
}
