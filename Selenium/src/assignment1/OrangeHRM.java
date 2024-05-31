package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//username
		//driver.findElement(By.css("username")).sendKeys("bcvuvhj");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ff");
		
	}

}
