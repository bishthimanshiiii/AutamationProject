package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		//action class
		//Actions act = new Actions(driver);
		//WebElement mousehover = driver.findElement(By.linkText("Paytm for Consumer"));
		
		//act.moveToElement(mousehover).perform();
		
		//act.moveToElement(driver.findElement(By.linkText("Paytm for Consumer"))).perform();
		
		//rightclick
//		Actions act = new Actions(driver);
//		WebElement rightClick = driver.findElement(By.linkText("Paytm for Consumer"));
//		act.contextClick(rightClick).perform();
		
		//double click
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.linkText("Paytm for Consumer"))).perform();
//		WebElement doubleClick = driver.findElement(By.linkText("Paytm for Consumer"));
//		act.doubleClick(doubleClick).perform();//target WebElement
		
	}
	

}
