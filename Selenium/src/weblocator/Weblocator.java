package weblocator;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weblocator {

	public static void main(String[] args) throws InterruptedException {
	
		
//id locator
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
        Thread.sleep(3000);
		WebElement search = driver.findElement(By.id("email"));
		search.sendKeys("hghugkm");
		
		  Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("333");
		
	/*	WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();*/
		
		  Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.id("loginbutton")).click();
		
	//class
	//driver.get("https://www.instagram.com/accounts/login/?hl=en");

	//WebElement email = driver.findElement(By.name("username");
	//email.sendKeys("vydgsygv");
	

	//WebElement pasword = driver.findElement(By.className("_add6"));
	//email.sendKeys("888cn");
	
	
	//WebElement login = driver.findElement(By.className("_acan"));
	//login.click();
	
	
//__aa4b _add6 _ac4d _ap35
//	class="_aa4b _add6 _ac4d _ap35"

	}
}  
